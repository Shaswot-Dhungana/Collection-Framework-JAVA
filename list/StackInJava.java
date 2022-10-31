import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();
        animals.push("Ant");
        animals.push("Tiger");
        animals.push("Lion");
        animals.push("Horse");

        System.out.println(animals);

        // IN Peek ,  Last element you push or add will be in top.
        // first element you add will be on botton.
        System.out.println("Last Element / Top Element / Peek Element :~ "+animals.peek());

        System.out.println(animals);

        // pop means peek element will change.
        // pop top element - 1.

        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek());



    }
}
