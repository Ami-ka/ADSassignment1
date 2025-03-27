import java.util.Scanner;

public class Problem1 {

    // Complexity: Linear - O(N)
    static int minimum(int[] arr) {
      
        int min = arr[0];
        for (int i : arr) {
            min = min >= i ? i : min;
        }
        return min;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        System.out.println(Problem1.minimum(arr));

    }
}