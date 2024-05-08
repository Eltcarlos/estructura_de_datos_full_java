package _06_recursion_intermedio;

public class check_is_a_element_present_in_array {
    public static void main(String[] args){
        int[] matrix = {0,1,2};
        System.out.println(check(matrix, matrix.length -1, 21));

    }

    public static boolean check(int[] matrix, int n, int k){
        if(n < 0){
            return false;
        }

        if(matrix[n] == k){
            return true;
        }

        return check(matrix, n - 1, k);

    }
}
