import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueInJava {
    public static void main(String[] args) {

        PriorityQueue<Integer> myPQueue = new PriorityQueue<>();

        myPQueue.offer(110);
        myPQueue.offer(20);
        myPQueue.offer(10);
        myPQueue.offer(40);
        myPQueue.offer(15);

        // Default Priority is in Ascending Order Due to MIN-HEAP Data Structure...
        System.out.println(myPQueue);

        // poll will remove those who have High Priority
        myPQueue.poll();
        System.out.println(myPQueue);


       // peek in queue means which element is now ready to come out....
        System.out.println( myPQueue.peek());





ChangingPriority();

    }
    public static void ChangingPriority(){
        System.out.println("Changing Priority to Descending to Ascending.");

        PriorityQueue<Integer> myPQueue2 = new PriorityQueue<>(Comparator.reverseOrder());

        myPQueue2.offer(110);
        myPQueue2.offer(20);
        myPQueue2.offer(10);
        myPQueue2.offer(40);
        myPQueue2.offer(15);


        // Using Comparator.ReverseOrder()
        // Default Priority is in Ascending Order Due to MIN-HEAP Data Structure...
        System.out.println(myPQueue2);

    }
}
