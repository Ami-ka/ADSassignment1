import java.util.Scanner;

public class Problem5 {
    // Complexity: exponential - O(2^n)
    static int findFibonacci(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(findFibonacci(n));
    }
}
