import java.util.*;


public class WayTooLongWord71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();



        int cases = sc.nextInt();
        for(int i = 0; i<cases; i++){
            String x = sc.next();
            inputs.add(x);
        }
        /*for(int i = 0; i< cases; i++){
            System.out.println(inputs.get(i));
        }*/


        for(int i = 0; i<inputs.size(); i++){
            if(inputs.get(i).length() <= 10){
                System.out.println(inputs.get(i));
            }else {
                transform(inputs.get(i));
            }
        }
    }

    public static void transform(String a){
        String first = String.valueOf(a.charAt(0));
        String last = String.valueOf(a.charAt(a.length()-1));
        int length = a.length()-2;
        System.out.println(first + length + last);
    }
}
