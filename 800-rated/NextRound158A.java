import java.util.*;

public class NextRound158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int participants = sc.nextInt();
        int k = sc.nextInt();


        int[] inputs = new int[participants];

        int count = 0;

        for(int i = 0; i<participants; i++){
            inputs[i] = sc.nextInt();
        }
        for(int i = 0; i<participants; i++){
            if(inputs[i] >= inputs[k-1] && inputs[i] != 0){
                count++;
            }
        }


        /*for(int i = 0; i<participants; i++){
            System.out.println(inputs[i]);
        }*/

        System.out.println(count);
    }
}
