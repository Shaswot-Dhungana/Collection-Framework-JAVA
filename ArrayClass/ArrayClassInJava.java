import java.util.Arrays;

public class ArrayClassInJava {
    public static void main(String[] args) {

        // Array Class is used to Manipulate Array , not arrayList..

        int[] numbers = {1,2,3,4,5};
        int index = Arrays.binarySearch(numbers,4);

        System.out.println("The index of Element 4 in the Array is :~ "+index);


        int [] a =  {20,3,6,8,66,494,3,90,4};

        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println("   ");

        Arrays.sort(a); // Sorting in Ascending Order..
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println("    ");

        // Fill All elements with same data..
        Arrays.fill(a, 5);
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println("   ");

    }
}