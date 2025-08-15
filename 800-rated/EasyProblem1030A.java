
import java.util.*;

public class EasyProblem1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        int[] num = new int[cases];

        for(int i = 0; i<cases; i++){
            num[i] = sc.nextInt();
        }

        String ans = "";
        for(int i = 0; i<cases; i++){
            if(num[i] == 1){
                ans = "HARD";
                break;
            }else{
                ans = "EASY";
            }
        }
        System.out.println(ans);
    }
}
