
import java.util.Arrays;

// 1.	Write a Java program to store characters in an array and print the character in reverse order
public class Char {
    public static void main(String[] args){
        char[] character = {'C', 'U' , 'T' , 'M'};
        System.out.println("Original Array: " + Arrays.toString(character));

        for(int i = character.length -1; i >= 0 ; i--){
            System.out.print(character[i] + " ");
        }
    }
    
}
//error 1 = used println line line number 8 (fixed)
// used Arrays.toString()  method to print the original array (a method that converts an array to a string representation , present in java.util.Array ) 
