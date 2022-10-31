import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {
    public static void main(String[] args) {
// HashMap
        Map<String , Integer> myMap = new HashMap<>();

        myMap.put("One" , 1);
      myMap.put("two" , 2);
      myMap.put("three" , 3);
      myMap.put("Four" , 4);
      myMap.put("Five" , 5);


        System.out.println(myMap);

        // Key Should be unique , otherwise it will override the value..
        myMap.put("Five" , 9);
        System.out.println(myMap);

        if(!myMap.containsKey("Six")){
            myMap.put("Six" , 6);
        }
        System.out.println(myMap);


        myMap.putIfAbsent("Seven" , 7);
        System.out.println(myMap);


        // Iteration in Map...

        for (Map.Entry<String , Integer> e : myMap.entrySet()){
            System.out.println("Iterating Map");
            System.out.println(e);
            System.out.println("Iterating Keys Only of Map");
            System.out.println(e.getKey());
            System.out.println("Iterating Values Only of Map");
            System.out.println(e.getValue());
        }

        System.out.println(myMap.isEmpty());

       myMap.clear();
        System.out.println(myMap);


    }
}