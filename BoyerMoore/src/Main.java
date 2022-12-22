import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CharSequence pattern = "abacab";
        CharSequence text = "abacbabadcabacab";
        CharacterComparator comparator = new CharacterComparator();
        System.out.println(pattern);

        System.out.println(PatternMatching.boyerMoore(pattern, text, comparator));

    }
}
