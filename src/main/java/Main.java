import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        // Zadanie 1
        System.out.println("--------------");
        System.out.println("Zadanie 1");
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(12);


        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println();

        for (int i = 0; i < 15; i++) {
            myStack.push(i);

        }
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());

        // zadanie 2
        System.out.println("------------------");
        System.out.println("Zadanie 2");
        String string = "[()]((){})";
        System.out.println(balancedParens(string));

        // zadanie 3 = odwrócenie kolejki
        System.out.println("------------------");
        System.out.println("Zadanie 3");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("pierwszy");
        arrayDeque.add("drugi");
        arrayDeque.add("trzeci");
        System.out.println(arrayDeque);
        reverseQueue(arrayDeque);
        System.out.println(arrayDeque);


    }

    public static boolean balancedParens(String input) throws Exception {
        String[] inputArray = input.split("");
        MyStack<String> stack = new MyStack();


        for (int i = 0; i < inputArray.length; i++) {
            try {
                if (inputArray[i].equalsIgnoreCase("(")) {
                    stack.push(inputArray[i]);
                } else if (inputArray[i].equalsIgnoreCase(")")) {
                    if (stack.peek().equalsIgnoreCase("(")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (inputArray[i].equalsIgnoreCase("[")) {
                    stack.push(inputArray[i]);
                } else if (inputArray[i].equalsIgnoreCase("]")) {
                    if (stack.peek().equalsIgnoreCase("[")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (inputArray[i].equalsIgnoreCase("{")) {
                    stack.push(inputArray[i]);
                } else if (inputArray[i].equalsIgnoreCase("}")) {
                    if (stack.peek().equalsIgnoreCase("{")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            } catch (IllegalStateException e) {
                return false;
            }

        }
        try {
            stack.peek();
        } catch (IllegalStateException e) {
            return true;
        }
        return false;
    }

    public static <T> void reverseQueue(Deque<T> queue){

    }
}
