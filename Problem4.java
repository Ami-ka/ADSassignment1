import java.util.Scanner;

public class Problem4 {
    // Complexity:Linear - O(N)
    static long factiorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factiorial(n - 1);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factiorial(n));
    }

}
