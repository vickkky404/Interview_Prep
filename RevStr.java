// use loop or stringBuilder
//package String

import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        // stringBuilder
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed: " + reversed);

    }
    
}

