
import java.util.*;

public class Twins160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_coins = sc.nextInt();
        int[] inputs = new int[n_coins];

        for(int i = 0; i<n_coins; i++){
            inputs[i] = sc.nextInt();
        }

        Arrays.sort(inputs);
        /*for(int i = 0; i<inputs.length; i++){
            System.out.println(inputs[i]);
        }*/



        int sum = 0;
        int coins = 0;
        int my_sum = 0;

        for(int i = 0; i<inputs.length; i++){
            sum += inputs[i];
        }
        /*System.out.println(sum);*/
        int i = 0;
        while(my_sum<=sum){

            coins++;
            my_sum += inputs[inputs.length - 1 - i];
            sum = sum - inputs[inputs.length - 1 - i];
            i++;
        }
        System.out.println(coins);
    }
}
