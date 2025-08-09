
import java.util.*;


public class EvenOdds318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();


        /*for (int i = 1; i <= n; i += 2) {
            count++;
            if (count == k) {
                System.out.println(i);
                return;
            }
        }



        for (int i = 2; i <= n; i += 2) {
            count++;
            if (count == k) {
                System.out.println(i);
                return;
            }
        }*/
        long mid =0;
        if(n%2 != 0){
            mid = (n/2)+1;
        }else{
            mid = (n/2);
        }

        if(k <= mid){
            System.out.println((2*k) - 1);
        }else{
            System.out.println(2*(k-mid));
        }

    }
}
