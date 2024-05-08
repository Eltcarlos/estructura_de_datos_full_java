package _06_recursion_intermedio;

public class check_is_a_array_sort {
    public static void main(String[] args){
      int[] matrix = {0,2,1,3,4,5};
      System.out.println(sorted(matrix, matrix.length));
   
    }

    public static boolean sorted(int[] matrix, int size){
      if(size == 0 || size == 1){
        return true;
      }

      int[] submatrix = new int[size - 1];
      System.arraycopy(matrix, 1, submatrix, 0, size - 1);

      if(!sorted(submatrix, size - 1)){
        return false;
      } 

      if(matrix[0] > matrix[1]){
        return false;
      } else {
        return true;
      }
    
    }
}
