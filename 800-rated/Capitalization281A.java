
import java.util.*;
public class Capitalization281A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] chars = word.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        System.out.println(new String(chars));
    }
}
