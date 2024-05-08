package _04_basic_sorting_algorithm.optimized_bubble_sort;

public class optimized_bubble_sort {
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int pointer = 0;
        int flag = 0;

        while(pointer < array.length){
            for(int i = 0; i < array.length -1  ; i ++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = 1;
                }
            }
            
            if(flag == 0){
                break;
            }
            pointer++;
        }

        for(int k = 0; k < array.length; k++){
            System.out.println(array[k] + " ");
        }
    }
}
