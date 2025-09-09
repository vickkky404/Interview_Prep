
import java.util.Scanner;

public class CharAtExample2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Emter the string: ");
        String str = sc.nextLine();

        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println(str.charAt(index));

    }
}
