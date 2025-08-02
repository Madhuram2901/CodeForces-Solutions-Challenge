import java.util.*;


public class Team231A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int problems = sc.nextInt();
        int n_inp = 3;

        int[][] A = new int[problems][3];

        for(int i = 0; i<problems; i++){
            for(int j = 0; j<n_inp; j++){
                A[i][j] = sc.nextInt();
            }
        }
        /*for(int i = 0; i<problems; i++){
            for(int j = 0; j<n_inp; j++){
                System.out.print(A[i][j]);
            }
        }*/

        int final_count = 0;
        for(int i = 0; i < problems; i++){
            int count = 0;
            for(int j = 0; j < 3; j++){
                if(A[i][j] == 1) {
                    count += 1;
                }
            }
            if(count >= 2){
                final_count += 1;
            }
        }
        System.out.println(final_count);

    }

    /*public static int check_req(int[][] x){
        int final_count = 0;
        for(int i = 0; i < problems; i++){
            int count = 0;
            for(int j = 0; j < 3; j++){
                if(x[i][j] == 1) {
                    count += 1;
                }
            }
            if(count >= 2){
                final_count += 1;
            }
        }
        return final_count;
    }*/
}
