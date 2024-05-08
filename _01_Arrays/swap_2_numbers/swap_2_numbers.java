package swap_2_numbers;

public class swap_2_numbers {
    public static void main(String[] args) {
         int[] array = {2, 5};
         int temp = array[0];

         array[0] = array[1];
         array[1] = temp;

         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
