package Map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        

        Map<String, Integer> num = new HashMap<>();
        
        num.put("Ten", 10);
        num.put("Twenty", 20);
        num.put("Thirty", 30);
        num.put("Forty", 40);
        num.put("Fifty", 50);

        // if(!num.containsKey("Fifty")) {
        //     num.put("Fifty", 5000);
        // }

        num.putIfAbsent("Fifty", 5000);

        System.out.println(num);

        System.out.println(num.containsValue(30)); //check for specific value
        System.out.println(num.containsKey("Thirty")); //check for specific key
        System.out.println(num.isEmpty()); //check is the map empty

        for (Map.Entry<String, Integer> e: num.entrySet()) {
            System.out.print(e + " "); //Print all entries
        }

        System.out.println("");

        for (Map.Entry<String, Integer> e: num.entrySet()) {
            System.out.print(e.getKey() + " "); //print only keys
        }
        System.out.println("");

        for (Map.Entry<String, Integer> e: num.entrySet()) {
            System.out.print(e.getValue() + " "); //print only values
        }

        System.out.println("");

        for (String key: num.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println("");

        for (Integer value: num.values()) {
            System.out.print(value + " ");
        }
        

    }
}
