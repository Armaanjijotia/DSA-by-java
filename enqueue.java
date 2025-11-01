public class enqueue {
    private int max = 4;
    private int[] array = new int[max];
    private int front = -1;
    private int rear = -1;

    public void enqueue(int data) {
        if (rear == max - 1) {
            System.out.println("OVERFLOW.");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        array[rear] = data;
        System.out.println(data + " inserted.");
    }

    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("UNDERFLOW.");
            return;
        }

        System.out.println(array[front] + " deleted.");
        front++;
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
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
