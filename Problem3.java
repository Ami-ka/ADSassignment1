import java.util.Scanner;

public class Problem3 {

    // Comlexity: Linear - O(N)
    static String isPrime(int n){
        
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                return "Composite";
            }
        }
        return "Prime";

        
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(isPrime(n));

    }


}