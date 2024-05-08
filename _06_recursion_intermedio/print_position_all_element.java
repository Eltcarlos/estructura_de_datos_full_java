package _06_recursion_intermedio;

public class print_position_all_element {
    public static void main(String[] args){
        int[] matrix = {2,5,1,5,3,1};
        print_all(matrix, matrix.length - 1);
    }

    public static void print_all(int[] matrix, int n){
        if(n < 0){
          return;
        }

        print_all(matrix, n -1);
        System.out.println(matrix[n]);

    }
}
