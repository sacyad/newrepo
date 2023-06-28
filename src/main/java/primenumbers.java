public class primenumbers {


    public static boolean isprimeno(int n){

        if (n<2){
            return false;
        }
        if (n == 2){
            return true;
        }
        for (int i=2; i<=n/2; i++){
            if ( n%i== 0){
                return false;
        }

        }
        return true;
    }



    public static void main(String[] args) {

        System.out.println(isprimeno(9));
    }
}
