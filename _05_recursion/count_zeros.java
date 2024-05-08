package _05_recursion;

public class count_zeros {
    public static void main(String[] args){
        System.out.println(calculated_zeroes(12040));
    }

    public static int calculated_zeroes(int n ){
        if(n == 0){
            return 0;
        }

        int smallAns = calculated_zeroes(n/10);
        int last_digi = n%10;
        if(last_digi == 0){
            return 1 + smallAns;
        } else {
            return smallAns ;
        }
    }
}
