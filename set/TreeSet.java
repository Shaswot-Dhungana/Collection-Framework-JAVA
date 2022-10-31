import java.util.TreeSet;
import java.util.Set;

public class TreeSetInJava {
    public static void main(String[] args) {

        Set<Integer> mySet = new TreeSet<>();

        // Set doesnot allow duplicate data..
        // Order of elements is maintained in Tree Set.


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
