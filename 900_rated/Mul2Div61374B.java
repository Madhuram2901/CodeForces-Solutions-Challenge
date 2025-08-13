
import java.util.*;
public class Mul2Div61374B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        int[] inputs = new int[cases];

        for(int i = 0; i<cases; i++){
            inputs[i] = sc.nextInt();
        }
        /*for(int i = 0; i<cases; i++){
            System.out.println(inputs[i]);
        }*/

        int[] outputs = new int[cases];
        for(int i = 0; i<cases; i++){
            outputs[i] = steps_count(inputs[i]);
        }

        for(int i = 0; i<cases; i++){
            System.out.println(outputs[i]);
        }

    }

    public static int steps_count(int n){

        int n2 = 0;
        int n6 = 0;
        if(n == 1) return 0;
        while(n>1){
            if(n%6 == 0){
                n6++;
                n /= 6;
            }else{
                n *= 2;
                n2++;
            }
        }
        if(n!=1){
            return -1;
        }

        return n2+n6;

    }
}
