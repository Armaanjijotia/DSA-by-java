import java.util.Stack;

class MyQueue {

    Stack<Integer> stack1; // for push
    Stack<Integer> stack2; // for pop/peek

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Push element to back
    public void push(int x) {
        stack1.push(x);
    }

    // Remove element from front
    public int pop() {
        if (stack2.isEmpty()) {
            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Get front element
    public int peek() {
        if (stack2.isEmpty()) {
            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}