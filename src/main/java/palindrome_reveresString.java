import java.util.Scanner;

public class palindrome_reveresString {

    public static void main(String[] args) {

        String orignal ,  reverse="";
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number / String  to check ");
        orignal = sc.nextLine();
        int length =  orignal.length();

        for (int i=length-1; i>=0; i--) {
            reverse = reverse + orignal.charAt(i);

        }
        System.out.println("the reverse string is : "+reverse);
            if (orignal.equals(reverse)){
                System.out.println(" string or number is palindrome ");
            }
            else{
            System.out.println("not palindrome .............");
        }
    }
}
