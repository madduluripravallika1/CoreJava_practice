package collectionswithexample;

import java.util.*;

public class HashMapClass {
    public List<String> method1() {
        Map<String, Integer> values = new HashMap<>();
        values.put("John", 50000);
        values.put("Jane", 60000);
        values.put("Bob", 55000);
        System.out.println("Employee Salaries: " + values);

        // List to store names of employees with high salaries
        List<String> highSalary = new ArrayList<>();

        // Iterate through the map and filter employees based on salary
        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            if (entry.getValue() > 55000) {
                highSalary.add(entry.getKey());
            }
        }

        return highSalary;
    }

    public static void main(String[] args) throws Exception {
        HashMapClass hashMapClass = new HashMapClass();
        List<String> result = hashMapClass.method1();
        System.out.println("Employees with  High Salary > 55000: " + result);
    }
}
