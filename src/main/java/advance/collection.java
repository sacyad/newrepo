package advance;

public class collection {

    public static void main(String[] args) {

        int i = 0;

        System.out.println("first i : " +i); // 0

        int j=i;
        System.out.println("first  j : "+ j);  // 0

        j = i++ +j;

        System.out.println("final : "+  i + " \n and j : " + j);
    }
}
