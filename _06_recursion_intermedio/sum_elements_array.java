package _06_recursion_intermedio;

public class sum_elements_array {
    public static void main(String[] args){
      int[] array = {};
      System.out.println(sum(array, array.length - 1));
    }

    public static int sum(int[] arr, int n){

        if (n < 0){
            return 0;
        }

        return sum(arr, n -1 ) + arr[n];


    }
}
