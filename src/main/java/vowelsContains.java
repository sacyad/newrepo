import java.util.Scanner;

public class vowelsContains {


    public static boolean vowelsContains(String input ){

       return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {


        System.out.println(  vowelsContains("sachin"));
        System.out.println(vowelsContains("ddffgghhjjpre"));

    }
}
