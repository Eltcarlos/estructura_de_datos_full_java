package largest_element_in_array;

public class largest_element_in_array {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7};
        int max_number = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(max_number < array[i]){
                max_number = array[i];
            }
        }
        
        System.out.println(max_number);

    }
}
