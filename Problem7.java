
import java.util.Scanner;

public class Problem7 {

    
    public static void generatePermutations(String s) {
        generateRecursive(s, "");
    }

    //Complexity: Factorial - O(N!)
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

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        generatePermutations(scan.nextLine());
        scan.close();
    }
}