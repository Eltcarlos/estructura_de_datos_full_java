package array_in_reverse_order_print;

public class array_in_reverse_order {
    public static void main(String[] args) {
        int[] array = {2, 4 , 6 , 9 , 2, 1 , 2, 5};

        System.out.println("Arreglo original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        System.out.println("Arreglo invertido");

        for(int j = array.length - 1 ; j >= 0; j--){
            System.out.print(array[j] + " ");
        }
        
    }

}
