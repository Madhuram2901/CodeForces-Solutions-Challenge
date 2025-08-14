import java.util.*;

public class NearlyLuckyNumber110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') count++;
        }
        String cntStr = String.valueOf(count);
        boolean isLucky = true;
        if (cntStr.isEmpty()) isLucky = false;
        else {
            for (char c : cntStr.toCharArray()) {
                if (c != '4' && c != '7') {
                    isLucky = false;
                    break;
                }
            }
        }
        System.out.println(isLucky ? "YES" : "NO");
    }
}
