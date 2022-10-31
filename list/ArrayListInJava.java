
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListInJava {
    public static void main(String[] args) {

        /*

        String studentsName = new String[3];

        studentsName[0] = "rohan";
        studentName[1] = "ritesh";
        studentName[2] = "Sandesh";

        now we can't add more students name
        because index is only 3 , so in this case
        we use ArrayList...

         */

        ArrayList<String> studentsName = new ArrayList<>();

        studentsName.add("Shaswot");
        System.out.println(studentsName);

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        System.out.println(myList);
        myList.add(30);
        myList.add(40);
        System.out.println(myList);
        myList.add(50); // add function will add element in end of the list.
        System.out.println(myList);

        // add elemnt in particular index/Position of Array
        // here 1 is index in array and
        // 60 is element to add in that index.

        myList.add(1,60);
        System.out.println(myList);


        // Adding New List in Previous List

        List<Integer> myNewList = new ArrayList<>(); // creating New ArrayList
        myNewList.add(70);
        myNewList.add(80);
        myNewList.add(90);
        myNewList.add(100);

        myList.addAll(myNewList); // adding/appending elements of new list to end of the previous list....
        System.out.println(myList);

        // getting Extracting Element from ArrayList.
        System.out.println(myList.get(3));
        System.out.println(myList.get(6));


        // updating particular elements of arrayList.

        System.out.println(myList);
        myList.set(0,999); // update index 0 with 999 value...
        System.out.println(myList);


        // Checking Particular element is present in ArrayList or Not..

        System.out.println(myList.contains(999));
        System.out.println(myList.contains(666));


        // iterating / traversing each elements of ArrayList..
        // using For Loop
        System.out.println("....Using For Loop....");
        for(int i =0; i<myList.size(); i++){
            System.out.println("The element of List with index "+i+" is :~ "+myList.get(i));
        }

        // using For Each Loop...
        System.out.println("....Using For Each Loop....");

        for (Integer element: myList) {
            System.out.println("The element of List  is :~ "+element);
        }

        // Using Iterator

        System.out.println("....Using Iterator....");
        Iterator<Integer> myIterator = myList.iterator();

        while (myIterator.hasNext()){
            System.out.println("Elements are :~ "+ myIterator.next());
        }


        // removing element from ArrayList...

        System.out.println(myList);
        myList.remove(3); // removing particular Position / Value of index.
        System.out.println(myList);


        myList.remove(Integer.valueOf(10)); // removing particular Element...
        System.out.println(myList);


        // Remove all elements from a list using Clear Function..

        myList.clear();
        System.out.println(myList);




    }
}