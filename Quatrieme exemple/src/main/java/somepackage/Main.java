package somepackage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static int NB_LETTERS = 26;
    static List<Character> ALPHABET;

    static {
        try {
            // Ici, on peut faire un traitement potentiellement beaucoup plus long
            ALPHABET = new ArrayList<>(NB_LETTERS);
            for (char i = 'a'; i <= 'z'; i++) {
                ALPHABET.add(i);
            }
        }catch (Exception e){}
        System.out.println("End of static initialisation");
    }


    public static void main(String[] args) throws Exception {
        for (char c : ALPHABET){
            System.out.println(c);
        }
    }
}


