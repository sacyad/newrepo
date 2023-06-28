public class Fibonacci_series {

//    using recurisve way
    static int n1 ,n3 = 0;
   static int n2= 1;

    public static void printfibonacci(int count){

        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printfibonacci(count-1);
        }
    }
    public static void main(String[] args) {

        int count =10;
        System.out.print(n1+ " "+ n2);
        printfibonacci(count-2);

//        without recursve approach
        /*
        int a= 0;
        int b=1;
        int c=0;
        // count to print the no of series to print
        int count =10;
        System.out.print(a+ ","+ b);
        for (int i=0; i<count -2; ++i){
            c= a + b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
         */
    }
}
