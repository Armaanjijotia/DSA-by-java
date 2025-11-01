public class mergesort {
// n log n 
    public static void divid(int []arry,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(ei+si)/2;
        divid(arry, si, mid);
        divid(arry, mid+1, ei);
        conque(arry, si, mid, ei);
    }
    public static void conque(int [] arry,int si,int mid,int ei){
        int merge[]= new int[ei-si+1];    //idx of merge (5-0+1)=6
        int idx1=si;       // idx1=0
        int idx2=mid+1;    // idx2=3   //mid=(si+ei)/2
        int x=0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arry[idx1] <= arry[idx2]) {
                merge[x] = arry[idx1];
                x++; idx1++;
            } else {
                merge[x] = arry[idx2];
                 x++; idx2++;
            }
        }
        while (idx1 <= mid) {
            merge[x] = arry[idx1];
            x++; idx1++;
        }
        while (idx2 <= ei) {
            merge[x] = arry[idx2];
            x++; idx2++;
        }
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            arry[j] = merge[i];
        }
    }
        public static void main(String[] args) {
        int arry[]={6,3,9,5,2,8,};
        int n=arry.length;       
        divid(arry, 0, n-1);

        // Print the sorted array
        for (int i=0;i<n;i++) {
            System.out.print(arry[i] + " ");
    }
    
}
}
