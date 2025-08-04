import java.util.*;

public class Bit282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ops = sc.nextInt();
        int x = 0;

        String[] inputs = new String[ops];

        for(int i = 0; i<ops; i++){
            inputs[i] = sc.next();
            if(inputs[i].contains("++")){
                x++;
            } else if (inputs[i].contains("--")) {
                x--;
            }
        }
        System.out.println(x);
    }
}
