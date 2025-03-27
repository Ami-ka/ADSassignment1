import java.util.Scanner;

public class Problem10 {
    //Complexity: Logarithmic - O(log(N))
    public static int gcd(int x, int y){
        
        if(x == 0){
            return y;
        }
        return gcd(y % x, x);
    
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        System.out.println(gcd(x,y));
    
    }
}
