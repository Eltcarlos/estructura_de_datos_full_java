package _07_recursion_avanzado;

public class print_and_reverse_print_recursive {
    public static void main(String[] args){
        String word = "abc";
        System.out.println(reverseString(word, 0));
    }

    public static String reverseString(String word, int cantidad){
        if(cantidad > word.length() -1){
            return "";
        }

        return reverseString(word, cantidad + 1) + String.valueOf(word.charAt(cantidad));
    }
}
