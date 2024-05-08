package _08_merge_sort_quick_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *  si array.length es 0 || 1 devuelve la raiz porque ya estaria ordenada
 *  [5,4,2,3,7,1];
 *  s           e
 *  1. Dividimos la matriz  en 2  [5,4,2] [3,7,1]
 *  2. y ordenamos las dos matrices
 *  [2,4,5] & [1,3,7]
 *  [1,2,3,4,5,7] 
 */

public class merge_sort {
    public static void main(String[] args){
        int[] arr = {5,4,2,3,7,1};
        int[] order = mergeSort(arr, 0, arr.length - 1);
        for(int k = 0; k < order.length; k++){
            System.out.println(order    [k] + " ");
        }
    }

    public static  int[]  mergeSort(int[]arr, int s, int e){

    }

    public static int[] mergeArrays(int[] array1, int[] array2){
    }


    public static int[] slice(int[] arr, int desde, int hasta) {
    }


}
