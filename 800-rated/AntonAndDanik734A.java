import java.util.*;

public class AntonAndDanik734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        String input= sc.next();
        int A = 0;
        int D = 0;
        if(input.contains("A")){
            for(int i = 0; i<games; i++){
                if(input.charAt(i) == 'A'){
                    A++;
                }
            }
        }
        if(input.contains("D")){
            for(int i = 0; i<games; i++){
                if(input.charAt(i) == 'D'){
                    D++;
                }
            }
        }

        if(A > D){
            System.out.println("Anton");
        }
        else if(D>A){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
