import java.util.Scanner;

public class Problem9 {
    // Complexity: exponential - O(2^N)
    public static int findBinomial(int k, int n){
        if(k == 0 || k==n){
            return 1;
        }

        return findBinomial(k-1, n-1) + findBinomial(k, n-1);


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        System.out.println(findBinomial(k,n));
    }
}
