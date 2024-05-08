package _06_recursion_intermedio;

public class first_index_of_element {
    public static void main(String[] args){
        int[] matrix = {2,5,1,5,3,1};
        System.out.println(first(matrix, 0, 1));
    }

    public static int first(int[] matrix, int n, int k){

        if (n >= matrix.length) {
            return -1;
        }

        if(matrix[n] == k){
            return n;
        }

        return first(matrix, n + 1, k);

    }
}
