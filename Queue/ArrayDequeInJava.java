import java.util.ArrayDeque;

public class ArrayDequeInJava {
    public static void main(String[] args) {

        ArrayDeque<Integer> myArrayDeq = new ArrayDeque<>();


        myArrayDeq.offer(20);
        myArrayDeq.offerFirst(10);
        myArrayDeq.offer(30);
        myArrayDeq.offer(40);
        myArrayDeq.offerLast(50);

        System.out.println(myArrayDeq);


        System.out.println(myArrayDeq.peek());
        System.out.println(myArrayDeq.peekFirst());
        System.out.println(myArrayDeq.peekLast());

        System.out.println(myArrayDeq.poll());
        System.out.println(myArrayDeq.pollFirst());
        System.out.println(myArrayDeq.pollLast());

        System.out.println(myArrayDeq);
    }
}
