
import java.util.*;

public class Football91A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputs = sc.nextLine();

        /*System.out.println(inputs);*/

        if(inputs.contains("0000000") || inputs.contains("1111111")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
