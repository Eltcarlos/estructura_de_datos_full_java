package sum_of_array_elements;


public class sum_of_array_elements {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7};
        int count = 0;

        for(int i = 0; i < array.length; i++){
            count += array[i];
        }

        System.out.println(count);
    }
}