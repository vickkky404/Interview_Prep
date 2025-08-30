import java.util.Scanner;

public class AtGivenIndex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = sc.nextLine();

        System.out.println("Enter the index to fetch:  ");
        int index = sc.nextInt();

        if(index >= 0 && index < str.length()){
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        }else{
            System.out.println("Invalid index! Must be between 0 and " + (str.length() - 1));
        }
    }
}
