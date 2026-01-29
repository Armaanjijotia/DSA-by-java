public class enqueue {
    private int max = 4;
    private int[] array = new int[max];
    private int F = -1;
    private int R = -1;

    public void enqueue(int data) {
        if (R == max - 1) {
            System.out.println("OVERFLOW.");
            return;
        }
        if (F == -1) {
           F = 0;
        }
        R++;
        array[R] = data;
        System.out.println(data + " inserted.");
    }
    public void delete() {
        if (F == -1 || F > R) {
            System.out.println("UNDERFLOW.");
            return;
        }
        System.out.println(array[F] + " deleted.");
        F++;
    }
    public void display() {
        if (F == -1 || F> R) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = F; i <= R; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        enqueue q = new enqueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);  // should trigger overflow

        q.display();

        q.delete();
        q.delete();
        q.display();
    }
}
