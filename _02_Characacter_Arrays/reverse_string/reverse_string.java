package _02_Characacter_Arrays.reverse_string;

public class reverse_string {
    public static void main(String[] args) {
        String name = "Carlos";
        String nameReverse = new StringBuilder(name).reverse().toString();
        System.out.println(nameReverse);
    }
}
