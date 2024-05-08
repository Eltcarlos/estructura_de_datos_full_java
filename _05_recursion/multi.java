package _05_recursion;

public class multi {
    public static void main(String[] args){
            System.out.println(multiplicacion(2, 3));
    }

    public static int multiplicacion(int a, int b){
            if(b == 0){
                return 0;
            }

            return multiplicacion(a, b - 1) + a;
    }

}
