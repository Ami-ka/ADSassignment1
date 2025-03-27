import java.util.Scanner;

public class Problem2 {

    //Complexity: Linear -- O(N)
    static float average(int[] arr, int n) {
        float avg = 0;
        for (int i : arr) {
            avg += i;
        }

        return avg/n; 
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        System.out.println(average(arr, n));
    }
}
