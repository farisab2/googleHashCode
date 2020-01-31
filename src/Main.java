import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\faris\\IdeaProjects\\googleHashCode\\c_medium.in");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Integer sum = 0;
        Integer pizza = 0;
        String[] sumAndTotal = new String[2];
        String[] values;
        List<Integer> allValues = new ArrayList<>();
        List<Integer> evenValues = new ArrayList<>();
        List<Integer> oddValues = new ArrayList<>();
        String st;
        int count = 0;
        while ((st = br.readLine()) != null) {
            if (count == 0) {
                sumAndTotal = st.split(" ");
                sum = Integer.parseInt(sumAndTotal[0]);
                pizza = Integer.parseInt(sumAndTotal[1]);
                count++;
            } else {
                values = st.split(" ");
                for (int i = 0; i < values.length; i++) {
                    Integer temp = Integer.parseInt(values[i]);
                    allValues.add(temp);
                }
            }
        }
        for (Integer a : allValues) {
            if (a % 2 == 0) {
                evenValues.add(a);
            } else {
                oddValues.add(a);
            }
        }
        System.out.println(closestSum(pizza - 1, sum, allValues));
    }
    public static Integer closestSum(int a, int b, List<Integer> c) {
        Integer tmp = 0;
        Integer tmp1 = 0;
        if (a == 0 || b == 0) {
            return 0;
        } else if (c.get(a) > b) {
            return closestSum(a - 1, b, c);
        } else {
            tmp = closestSum(a - 1, b, c);
            tmp1 = c.get(a) + closestSum(a - 1, b - c.get(a), c);
            return Math.max(tmp, tmp1);
        }
    }
}
