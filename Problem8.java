import java.util.Scanner;

public class Problem8 {
    //Complexity: Linear - O(N)
    public static void isDigits(String str){
        
        for (char ch : str.toCharArray()) {
            if(!Character.isDigit(ch)){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }


    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        isDigits(str);

    }
}
