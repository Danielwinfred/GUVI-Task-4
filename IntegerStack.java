import java.util.Stack;

public class IntegerStack {

    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Push element onto the stack
    public void push(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto the stack.");
    }

    // Pop element from the stack
    public void pop() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println(poppedElement + " popped from the stack.");
        } else {
            System.out.println("Stack is empty, nothing to pop.");
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Create the stack object
        IntegerStack integerStack = new IntegerStack();

        // Push some numbers
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Pop one number
        integerStack.pop();

        // Check if stack is empty
        if (integerStack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        // Pop remaining numbers
        integerStack.pop();
        integerStack.pop();

        // Check again if stack is empty
        if (integerStack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }
}
