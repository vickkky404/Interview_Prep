
import java.util.Scanner;


public class StrConcat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the String: ");
        String str2 = sc.nextLine();

        String result = str1.concat(str2);
        System.out.println(result);


        }
}
