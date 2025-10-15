import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while(num > 0){
            int digit = num %  10;
            sum = sum + (digit * digit * digit);
            num = num /10;
        }

        if(sum == original){
            System.out.println(original + " is an Armstrong Number");
        }else {
            System.out.println(original + " is NOT an Armstrong Number");
        }
    }
}