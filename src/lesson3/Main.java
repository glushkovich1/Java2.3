package lesson3;

import java.sql.SQLOutput;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        String[] Number = new String[10];
        Number[0] = "zero";
        Number[1] = "one";
        Number[2] = "two";
        Number[3] = "three";
        Number[4] = "one";
        Number[5] = "five";
        Number[6] = "six";
        Number[7] = "seven";
        Number[8] = "one";
        Number[9] = "nine";

        task1(Number);

        task2();
    }

    public static void task1(String[] number) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < number.length; i++) {
            if (treeMap.containsKey(number[i])) {
                treeMap.put(number[i], treeMap.get(number[i]) + 1);
            } else {
                treeMap.put(number[i], 1);
            }
        }
        System.out.println(treeMap);
    }

    public static void task2() {
        PhoneList phoneList = new PhoneList();

        phoneList.add("Sasha", "89154032136");
        phoneList.add("Vova", "89770034546");
        phoneList.add("Sasha", "89154032136");
        phoneList.add("Misha", "89164003214");
        phoneList.add("Sasha", "89454032136");
        phoneList.add("Ira", "89153302223");

        System.out.println(phoneList.get("Sasha"));
        System.out.println(phoneList.get("Vova"));
        System.out.println(phoneList.get("Misha"));
        System.out.println(phoneList.get("Sasha"));
        System.out.println(phoneList.get("Ira"));
    }
}
