//Write a Java program to declare and initialize an array of 5 integers and print them.

package BASICS;
public class Initialize {
    public static void main(String[] args){
        int[] arr = {27,55,75,81,40};

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println((i + 1 ) + "." + arr[i]);
        }

    }
    
}
