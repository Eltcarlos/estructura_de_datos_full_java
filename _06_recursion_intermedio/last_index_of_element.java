package _06_recursion_intermedio;

public class last_index_of_element {
    public static void main(String[] args){
        int[] matrix = {2,5,1,5,3,1};
        System.out.println(last(matrix,  matrix.length - 1, 1));
    }

    public static int last(int[] matrix, int n, int k){

        if (n < 0) {
            return -1;
        }

        if(matrix[n] == k){
            return n;
        }

        return last(matrix, n - 1, k);

    }
    
}
