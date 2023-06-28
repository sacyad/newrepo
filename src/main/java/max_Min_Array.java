public class max_Min_Array {


    static int[] arr = {12, 45, 33, 789, 23, 89};

    public static int maxlength() {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minlength() {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }



    public static void main(String[] args) {

        System.out.println("max lenght in array : "+maxlength());
        System.out.println("min lenght in array : "+minlength());
    }
}
