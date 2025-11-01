public class circular {
    public final int max = 6;
    public int arry[] = new int[max];
    public int F = -1;
    public int R = -1;

    public void enqueue(int data) {
      
        if ((R + 1) % max == F) {
            System.out.println("OVERFLOW: Queue is full.");
            return;
        }
       
        if (F == -1) {
            F = 0;
        }
        R = (R + 1) % max;
        arry[R] = data;
        System.out.println("Enqueued: " + data);
    }
    public void dequeue() {
        
        if (F == -1) {
            System.out.println("UNDERFLOW: Queue is empty.");
            return;
        }
        int dedata = arry[F];
        System.out.println("Dequeued: " + dedata);
        
        if (F == R) {
            F = -1;
            R = -1;
        } else {
            
            F = (F + 1) % max;
        }
    }
        public void print() {
        if (F == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("The queue is: ");
        //int i = F;
        // while (i != R) {
        //     System.out.print(arry[i] + " ");   //NOW it will print the added data at end not in assending order
        //     i = (i + 1) % max;
        // }
        for(int i=0;i<max;i++) {  // NOW it will print in assending order 
           
                System.out.print(arry[i] + " ");
            }
        }
        // System.out.print(arry[R] + " "); 
        // System.outprintln();
    


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
        q.enqueue(35); 
        q.dequeue(); 
        q.print(); 
    }
}

