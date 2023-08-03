package iotest02;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class FruitTest {

    static HashMap<String, Number> map;

    public static void main(String[] args) {

        String fruitName = null;
        int value = 0;
        File file = new File("d:\\temp\\fruitData.txt");

        try {

            map = new HashMap<String, Number>();
            BufferedReader in = new BufferedReader(new FileReader(file));
            String s;
            s = in.readLine();
            System.out.println("과일정보:");
            System.out.println("======================");
            while (s != null) {
                System.out.println(s);
                calcFruit(s);
                s = in.readLine();
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("과일 개수 출력하기");
        printFruitCounts();
    }

    private static void calcFruit(String s) {
        StringTokenizer st = new StringTokenizer(s, ",");
        while (st.hasMoreTokens()) {
            String fruitName = st.nextToken().trim();
            if (map.containsKey(fruitName)) {
                int value = map.get(fruitName).intValue();
                map.put(fruitName, value + 1);
            } else {
                map.put(fruitName, 1);
            }
        }
    }

    private static void printFruitCounts() {
        Set<String> fruits = map.keySet();
        for (String fruit : fruits) {
            int count = map.get(fruit).intValue();
            System.out.println(fruit + ":" + count + "개");
        }
    }
}