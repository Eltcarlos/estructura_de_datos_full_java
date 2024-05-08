package _05_recursion;

public class geometric_sum {
    public static void main(String[] args){

    }

    public static double gSum(int k){
        if(k == 0){
             return 1;
        }
        double smallAns = gSum(k - 1);
        return smallAns - 1.0/Math.pow(2,k);
    }
}
