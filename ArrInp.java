//Write a Java program to take an array of integers as input from the user and print the elements.

package BASICS;

import java.util.Scanner;
public class ArrInp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements for the Arrays: ");
        int inp = sc.nextInt();

        int[] arr = new int[inp];

        System.out.println("Enter " +  inp + "integers");
        for(int i = 0 ; i < inp ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The array element are: ");
        for(int i = 0 ; i < inp ; i++){
            System.out.println(arr[i]);
        }
        sc.close();




    }
    
}
