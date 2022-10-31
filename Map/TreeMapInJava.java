import java.util.TreeMap;
import java.util.Map;

public class TreeMapInJava {
    public static void main(String[] args) {
// TreeMap
        Map<String , Integer> myMap = new TreeMap<>();

        myMap.put("One" , 1);
        myMap.put("two" , 2);
        myMap.put("three" , 3);
        myMap.put("Four" , 4);
        myMap.put("Five" , 5);

// IN Tree Map It will print in Alphabetical Order of Key.

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

        System.out.println(myMap);
        myMap.remove("Five");
        System.out.println(myMap);

        myMap.clear();
        System.out.println(myMap);


    }
}