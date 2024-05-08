package return_in_reverse_order;

public class return_in_reverse_order {
    public static void main(String[] args) {
        int[] array = {2, 4 , 6 , 9 , 2, 1 , 2, 5, 2};

        System.out.println("Arreglo original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

       int start = 0;
       int end = array.length - 1 ;

       while (start < end) {
          int temp = array[start];
          array[start] = array[end];
          array[end] = temp;
          
          start++;
          end--;
       }

       System.out.println("Arreglo en reverso:");
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }

    }
}
