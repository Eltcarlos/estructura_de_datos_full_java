package _04_basic_sorting_algorithm.selection_sort_algorithm;

/*
 * 
 *  a = > [7,5,3,6,8]
 *  Compara el elemento en el indice 0 en este caso el 7 
 *  con el primer elemento mas pequeño en este caso el 3
 *  luego se cambian los valores en la matriz de tal forma
 *  que quedaria
 *  [3,5,7,6,8]
 *  como ya no hay mas elementos mas pequeños que en el indice 0
 *  sigue con el siguiente indice y comprueba con los restos elementos del
 *  arreglo por ejemplo  7 lo compara con el el 6
 *  [3,5,6,7,8]
 */


public class selection_sort {
    public static void main(String[] args) {
        int[] array = {7,100,5,3,6,1,2,10,23,8};
        int pointer = 0, temp = 0;

        while (pointer  < array.length) {
            for(int i = pointer + 1; i < array.length; i++){
                if(array[temp] > array[i]){
                    temp = i;
                }
            }
            int tmp = array[pointer];
            array[pointer] = array[temp];
            array[temp] = tmp;
            pointer++;
            temp = pointer;
        }
        
        for(int k = 0; k <= array.length; k++){
            System.out.println(array[k] + " ");
        }
    }
}
