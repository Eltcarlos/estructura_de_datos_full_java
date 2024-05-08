package _02_Characacter_Arrays.print_all_prefixes;

public class print_all_prefixes {
    public static void main(String[] args) {
        String name = "abcd";
        for(int i = 0; i <= name.length(); i++){
            System.out.println(name.substring(0, i));
        }
    }
}
