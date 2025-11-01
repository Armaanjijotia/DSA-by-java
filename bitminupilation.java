public class bitminupilation {
    public static void main(String[] args) {
        // GET BIT ;
        int n=5; //0101
        int pos=2; //bit position 2 (0-based from the right)
        int bitmask=3<<pos; //3 in binary is 0011.
                            //3 << 2 means left shift by 2 bits, resulting in 1100 
                            //1100 is 12 in decimal [bitmask=1100]
        if((bitmask & n)==0){ //0101 & 1100 = 0100 
        System.out.println("bit is zero"); // 2nd postion has 1 hence output would be one
        }
        else{
            System.out.println("bit is one");
        }
        // SET BIT ;

        int m=5;//0101
        int posi=2;//0010 shift by 2 is 1000 
        int bitmaskk=2<<posi; // bitmask is 1000
        int newnumber=bitmaskk | m ; //1000 | 0101 = 1101(13)
        System.out.println(newnumber);

        //CLEAR BIT 
        int p=5;//0101
        int posit=2;//0010 shift by 2 is 1000 
        int bitmaskkk=1<<posi; // bitmask is 0100
        int result=~(bitmask); //1011
         int ans=result & p;  //1011 & 0101 = 0001[1]
         System.out.println(ans);

         //UPDATE BIT 
         int y=5;//0101
         int positi=1;//0001
         int bitmaskkkk=2<<positi;//0100
         int results = (y & ~bitmaskkkk); //0101 & ~0100(1011)= 0001
         System.out.println(results); 
    }
}
