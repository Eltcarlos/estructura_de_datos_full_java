package _06_recursion_intermedio;

public class count_ocurrence_of_element {
    public static void main(String[] args){
        int[] matrix = {2,5,1,5,3,1};
        System.out.println(countOccurrences(matrix, matrix.length - 1, 5));
    }

    public static int countOccurrences(int[] matrix, int n, int k){
        if(n < 0){
          return 0;
        }

        int occurrences = matrix[n] == k ? 1 : 0;        
        return occurrences + countOccurrences(matrix, n - 1, k);

    }
}
