package _05_recursion;

public class number_of_digits {
    public static void main(String[] args){
      System.out.println(digits(231));
    }

    public static int digits(int n){
        if(n==0){
            return 0;
        }
        System.out.println(digits(n/10));
        return digits(n/10) + 1;
    }
}
