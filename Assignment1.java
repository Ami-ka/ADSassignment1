import java.util.Scanner;

class Assignment1 {
    public static void main(String[] args) {
        task1();
    }

    // task1
    // Complexity: Linear - O(N)
    static int minimum(int[] arr) {
        return minimumRec(arr, 0, arr[0]);
    }

    static int minimumRec(int[] arr, int index, int currentMin) {
        if (index == arr.length) {
            return currentMin;
        }
        int newMin = arr[index] < currentMin ? arr[index] : currentMin;
        return minimumRec(arr, index + 1, newMin);
    }

    public static void task1() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        System.out.println(minimum(arr));

    }

    // task2
    // Complexity: Linear -- O(N)
    static float average(int[] arr, int n) {
        float sum = sumRecursive(arr, 0);
        return sum / n;
    }

    static float sumRecursive(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumRecursive(arr, index + 1);
    }

    public static void task2() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        System.out.println(average(arr, n));
    }

    // task3
    // Comlexity: Linear - O(N)
    static String isPrime(int n) {

        return isPrimeRecursive(n, 2) ? "Prime" : "Composite";

    }

    static boolean isPrimeRecursive(int n, int i) {
        if (i >= n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrimeRecursive(n, i + 1);
    }

    public static void task3() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(isPrime(n));

    }

    // task4
    // Complexity:Linear - O(N)
    static long factiorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factiorial(n - 1);

    }

    public static void task4() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(factiorial(n));
    }

    // task5
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

    public static void task5() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(findFibonacci(n));
    }

    // task6
    // Complexity: Linear - O(N)
    static int power(int a, int n) {

        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);

    }

    public static void task6() {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        System.out.println(power(a, n));

    }

    // task7
    public static void generatePermutations(String s) {
        generateRecursive(s, "");
    }

    // Complexity: Factorial - O(N!)
    private static void generateRecursive(String remaining, String current) {
        if (remaining.isEmpty()) {
            System.out.println(current);
        }

        for (int i = 0; i < remaining.length(); i++) {
            char fixedChar = remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generateRecursive(newRemaining, current + fixedChar);
        }
    }

    public static void task7() {
        Scanner scan = new Scanner(System.in);
        generatePermutations(scan.nextLine());
        scan.close();
    }

    // task8

    // Complexity: Linear - O(N)
    public static void isDigits(String str) {

        if (str.isEmpty()) {
            System.out.println("yes");
            return;
        }
        if (!Character.isDigit(str.charAt(0))) {
            System.out.println("no");
            return;
        }
        isDigits(str.substring(1));

    }

    public static void task8() {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        isDigits(str);

    }

    // task9

    // Complexity: exponential - O(2^N)
    public static int findBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return findBinomial(n - 1, k - 1) + findBinomial(n-1, k);

    }

    public static void task9() {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        System.out.println(findBinomial(k, n));
    }

    // task10
    // Complexity: Logarithmic - O(log(N))
    public static int gcd(int x, int y) {

        if (x == 0) {
            return y;
        }
        return gcd(y % x, x);

    }

    public static void task10() {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        System.out.println(gcd(x, y));

    }
}