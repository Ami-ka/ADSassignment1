import java.util.Scanner;

public class Problem8 {
    //Complexity: Linear - O(N)
    public static void isDigits(String str) {
        if (str.isEmpty()) {
            System.out.println("yes");  // пустая строка считается "yes" (как в исходном коде)
            return;
        }
        if (!Character.isDigit(str.charAt(0))) {
            System.out.println("no");
            return;
        }
        isDigits(str.substring(1));  // рекурсивно проверяем оставшуюся часть строки
    }


    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        isDigits(str);

    }
}
