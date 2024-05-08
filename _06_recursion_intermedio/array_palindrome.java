package _06_recursion_intermedio;

public class array_palindrome {
    public static void main(String[] args){
        int[] arr = {1,2};
        System.out.println(isPailindrome(arr, 0, arr.length-1));
    }

    public static boolean isPailindrome(int[] arr, int s, int e){

        if(e < 0){
            return false;
        }

        if(arr[s] != arr[e]){
            return false;
        }

        if(s > e){
            return true;
        }

        return isPailindrome(arr, s + 1, e - 1);


    }
}
