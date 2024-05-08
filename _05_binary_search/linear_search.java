package _05_binary_search;

/*
 *  array => [10,20,3,4,1,0]
 *  Vamos a buscar la key = 20
 *  es recorrer el arreglo de manera linear y buscar la posicion
 *  de la clave que busquemos
 *  compledijidad de n (steps)
 */


public class linear_search {
    public static void main(String[] args){
        int[] array = {2,10,5,23,19,11,1,2};
        int key = 15;
        boolean flag = false;

        for(int i = 0; i < array.length; i++){
            if(key == array[i]){
                System.out.println("Su llave se encuentra en la posicion" + i);
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("No se encontro la llave");
        }


    }
    
}
