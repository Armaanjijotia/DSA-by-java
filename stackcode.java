public class stackcode {
    public int max = 4;
    public String[] arry = new String[max];
    public int top = -1;

    // Push method to add data to the stack
    public void push(String data) {
        if (top == max - 1) {
            System.out.println("OVERFLOW");
            return;
        }
        top++;
        arry[top] = data;
        System.out.println("Pushed: " + data);
    }
    // Pop method to remove data from the stack
    public void pop() {
        if (top == -1) {
            System.out.println("UNDERFLOW");
            return;
        }
       String removedData = arry[top];
        top--;
        System.out.println("Popped: " + removedData);
    }
    // Peep method to view the top element without removing it
    public void peep() {
        if (top == -1) {
            System.out.println("Stack is empty (nothing to peep)");
            return;
        }
        System.out.println("Top element: " + arry[top]);
    }
    // Main method to test
    public static void main(String[] args) {
        stackcode stack = new stackcode();

        stack.push("Apple");
        stack.push("Banana");

        stack.peep(); // Should show "Banana"

        stack.pop();  // Removes "Banana"

        stack.peep(); // Should show "Apple"

        stack.pop();  // Removes "Apple"

        stack.peep(); // Should show empty message
    }
}
