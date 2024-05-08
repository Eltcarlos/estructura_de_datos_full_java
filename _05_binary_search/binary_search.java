package _05_binary_search;

/*
 * La matriz debe estar ordenada
 *  [2,3,5,8,20,23,40,49]
 *   start 0   end 7
 *   tenemos que calcular el mid
 *   0 + 7 / 2 = 3.5 y lo dejamos en 3
 *    if a(mid) = key
 *      return mid
 *    if a(mid) > key
 *         end = mid-1
 * 
 * if a(mid) < key
 *         start = mid+1
 */

public class binary_search {
    public static void main(String[] args) {
        int[] array = { 2, 3, 5, 8, 20, 23, 40, 49 };

        int start = 0, end = array.length - 1, mid;
        int key = 20;

        while (start <= end) {
            mid = Math.round((start + end) / 2);

            if (array[mid] == key) {
                System.out.println("la posicion del numero: " + " " + mid);
                break;
            }
            if (array[mid] > key) {
                end = mid - 1;
            }
            if (array[mid] < key) {
                start = mid + 1;
            }
        }

    }

}
