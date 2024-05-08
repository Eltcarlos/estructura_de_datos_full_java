package _07_recursion_avanzado;

public class replace_character {
    public static void main(String[] args){
        String word = "arlos";
        System.out.println(replace_character_1(word, word.length() - 1, "c"));

    }
    
    public static String replace_character_1(String word, int n, String c){
            if(n < 0){
                return "";
            }
            String ocurrences = String.valueOf(word.charAt(n)).equals(c) ? "X" : String.valueOf(word.charAt(n));
            return replace_character_1(word, n -1, c) + ocurrences;
    }
}
