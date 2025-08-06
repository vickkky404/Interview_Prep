// create a program to get the result 6 in the string Ram 123 using user input(sum of the number by the user input)

import java.util.Scanner;
public class Str2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:  ");
        String input = sc.nextLine();

        int sum = 0;
        for(int i = 0 ; i <input.length(); i++){
            char ch = input.charAt(i);

            if(Character.isDigit(ch)){
                sum += '0';
            }

        }


        System.out.println("The sum of digit:  " + sum);
    }
        
    
    
}
