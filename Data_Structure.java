class Node { // USER DEFINE DATA TYPE

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LL { // USER DEFINE STRUCTURE

    Node head;
    Node tail;
    int size=0;

   int get(int idx){
      if(idx<0||idx>size) return-1;
      Node temp=head;
      for(int i=0;i<idx;i++){
         temp=temp.next;
      }
      return temp.val;
   }
   void deleteinsideLL(int idx) {

      if(idx<0||idx>size) return;

      if(idx==0) deletefirst();
    Node temp = head;

    for(int i = 0; i < idx - 1; i++) {
        temp = temp.next;
    }
    temp.next = temp.next.next;
    if(idx == size - 1)
        tail = temp;

    size--;
}
   void addinsideLL(int idx,int val){
       if(idx<0||idx>size) return;

      if(idx==0) addfirst(val);

      else if(idx==size) addlast(val);

      else{
         Node temp=head;
         for(int i=1;i<=idx-1;i++){
            temp=temp.next;
         }
         Node t=new Node(val);
         t.next=temp.next;
         temp.next=t;
         size++;
      }
     }
   int search(int val) {
    if (head == null) return -1;

    Node temp = head;
    int idx = 0;

    while (temp != null) {
        if (temp.val == val)
            return idx;

        temp = temp.next;
        idx++;
    }

    return -1;
}
    // ADD AT LAST
    void addlast(int val) {

        Node temp = new Node(val);

        if (tail == null) {
            head = tail = temp;
        } 
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    // ADD AT FIRST
    void addfirst(int val) {

        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } 
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deletefirst(){
      if(head==null) head=tail=null;
      else{
         head=head.next;
         size--;
      }

    }

    void display(Node head, Node tail) {

        if (head == null) return;
        Node temp = head;

        while (temp != null) {
            System.out.print(" "+temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}  // ⭐ THIS } WAS MISSING

public class Data_Structure {

    public static void main(String[] args) {

        LL ll = new LL();

        ll.addfirst(50);
        ll.addfirst(40);
        ll.addfirst(30);
        ll.display(ll.head, ll.tail);
        ll.deletefirst();
        ll.addlast(100);
        ll.display(ll.head, ll.tail);
        ll.addinsideLL(3, 99);
        ll.display(ll.head,ll.tail);
        System.out.println("size="+ll.size);
        System.out.println("idex="+ll.search(100));
        System.out.println("get="+ll.get(2));
    }
}