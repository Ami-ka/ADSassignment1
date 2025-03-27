import java.util.Scanner;

public class Problem6 {

    // Complexity: Linear - O(N)
    static int power(int a, int n) {
    
        int pow = 1;
        
        for(int i = 1; i <= n;i++){
            pow *= a;
        }
        return pow;
    
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        System.out.println(power(a, n));

    }
}
