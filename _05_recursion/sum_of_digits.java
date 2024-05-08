package _05_recursion;

public class sum_of_digits {
    public static void main(String[] args){
      System.out.println(digits_sum(123));
    }

    public static int digits_sum(int n){
        if(n == 0){
            return 0;
        }
        return digits_sum(n/10) + n%10;
    }
}
