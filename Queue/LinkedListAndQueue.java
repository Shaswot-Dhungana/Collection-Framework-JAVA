import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAndQueue{
    public static void main(String[] args) {

        // Queue Follows first in First Out Concept..

        Queue<Integer> myQueue = new LinkedList<>();

       myQueue.offer(10);
       myQueue.offer(20);
       myQueue.offer(30);
       myQueue.offer(40);
       myQueue.offer(50);

        System.out.println(myQueue);

        // Queue Follows first in First Out Concept.. so 10 enters first and exists also first...
        System.out.println(myQueue.poll());

        // 10 is out now so there will be no 10.
        System.out.println(myQueue);

        // 10 is out so 20 will out first now.
        System.out.println(myQueue.poll());

        // 20 is out  now.
        System.out.println(myQueue);

        // peek in queue means which element is now ready to come out or ready to poll....
        System.out.println(myQueue.peek());


        myQueue.add(60); // if sucessfull then it returns true otherwise it throws an Exception...
        System.out.println(myQueue);

        // .element function returns the head of the queue , if queue is empty then it throes an Wxception..
        System.out.println(myQueue.element());


        // remove function removes the head of the poll. if queue is empty then it throes an Wxception..
        System.out.println(myQueue.remove());
        System.out.println(myQueue);





    }
}


