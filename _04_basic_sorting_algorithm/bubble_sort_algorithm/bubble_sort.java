package _04_basic_sorting_algorithm.bubble_sort_algorithm;

/*
 *  A => [5,4,3,1,2]
 *  Compara los adyacentes es decir compara el 5 y el 4
 *  entonces nuestra matriz quedara de la siguiente forma
 *  [4,5,3,1,2]
 *  Luego compararemos el siguiente indice con su adyacente es decir 5, con el 3
 *  [4,3,5,1,2] y asi sucesivamente
 *  [4,3,1,5,2] , [4,3,1,2,5]
 *  y este ciclo se hace hasta que recorra la misma cantidad de veces que la longitud del arreglo - 1
 */

public class bubble_sort {
    public static void main(String[] args) {
        int[] array = {5,20,20,4,3,100,200,1,2,1};
        int pointer = 0;

        while(pointer < array.length){
            for(int i = 0; i < array.length -1  ; i ++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            pointer++;
        }

        for(int k = 0; k < array.length; k++){
            System.out.println(array[k] + " ");
        }
    }
}
