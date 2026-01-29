public class circular {
    public final int max = 6;
    public int arry[] = new int[max];
    public int F = -1;
    public int R = -1;

    // ENQUEUE
    public void enqueue(int data) {      
        if ((R + 1) % max == F) {
            System.out.println("OVERFLOW: Queue is full.");
            return;
        }
        if (F == -1) {                   // First element
            F = 0;
        }
        R = (R + 1) % max;
        arry[R] = data;
        System.out.println("Enqueued: " + data);
    }
    // DEQUEUE
    public void dequeue() {
        if (F == -1) {
            System.out.println("UNDERFLOW: Queue is empty.");
            return;
        }
        int dedata = arry[F];
        System.out.println("Dequeued: " + dedata);

        if (F == R) {                   // Only one element
            F = R = -1;
        } else {
            F = (F + 1) % max;
        }
    }
    // CORRECT PRINT FOR CIRCULAR QUEUE
    public void print() {
        if (F == -1) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("The queue is: ");

        int i = F;

        while (true) {
            System.out.print(arry[i] + " ");

            if (i == R) break;

            i = (i + 1) % max;
        }

        System.out.println();
    }

    // MAIN
    public static void main(String[] args) {
        circular q = new circular();

        q.enqueue(12);
        q.enqueue(15);
        q.enqueue(25);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);

        q.print();

        q.dequeue();
        q.dequeue();

        q.print();

        q.enqueue(20);
        q.enqueue(25);
        q.enqueue(30);

        q.print();

        q.enqueue(35); // check overflow

        q.dequeue();

        q.print();
    }
}
