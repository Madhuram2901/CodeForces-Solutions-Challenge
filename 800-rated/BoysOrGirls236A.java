
import java.util.*;
public class BoysOrGirls236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i<input.length(); i++){
            set.add(String.valueOf(input.charAt(i)));
        }

        int len = set.size();
        /*System.out.println(len);
        System.out.println(set);*/

        if(len % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
