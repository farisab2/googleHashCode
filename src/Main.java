import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\faris\\IdeaProjects\\googleHashCode\\d_quite_big.in");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Integer sum = 0;
        Integer summation = 0;
        Integer pizza;
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
        for (int i = 0; i < allValues.size(); i++) {
            summation += allValues.get(i);
        }
        System.out.println(summation);
        System.out.println(summation - sum);
        for (Integer a : oddValues) {
            //System.out.print(a + " ");
        }
        for (Integer b : evenValues) {
            //System.out.println(b + " ");
        }
    }
}
