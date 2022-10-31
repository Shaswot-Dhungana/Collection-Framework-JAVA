import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassInJava {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();

        myList.add(10);
        myList.add(3);
        myList.add(34);
        myList.add(20);
        myList.add(22);
        myList.add(18);
        myList.add(20);

        System.out.println(myList);

        System.out.println("Smallest Element in List is :~ " + Collections.min(myList));
        System.out.println("FRequency of element 20 in list is :~ " + Collections.frequency(myList,20));

        // sorting in Ascending Order...
        Collections.sort(myList);
        System.out.println(myList);

        // sorting in Decending Order...
        Collections.sort(myList, Comparator.reverseOrder());
        System.out.println(myList);

    }
}