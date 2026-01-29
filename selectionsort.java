public class selectionsort {
    public static void printarry(int arry[]){
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }
    public static void main(String[] args) {
        int arry[]={1,4,7,9,3};

        for(int i=0;i<arry.length-1;i++){
        for(int j=i+1;j<arry.length;j++){
            if(arry[i]>arry[j]){
                int temp=arry[j];
                arry[j]=arry[i];
                arry[i]=temp;
            }
        }
        }
        printarry(arry);
    }
}
