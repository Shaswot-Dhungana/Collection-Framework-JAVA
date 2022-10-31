import java.util.HashSet;
import java.util.Set;

class HashSetInJava{
    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();

        // Set doesnot allow duplicate data..
        // Order of elements is not maintained in HashSet.

        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(40);
        mySet.add(50);


        System.out.println(mySet);

        mySet.remove(50);
        System.out.println(mySet);


        System.out.println(mySet.contains(40));
        System.out.println(mySet.contains(90));

        System.out.println(mySet.isEmpty());

        System.out.println(mySet.size());

        mySet.clear();
        System.out.println(mySet);


    }
}