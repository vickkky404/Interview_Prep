// find the frequency of the element or number in a array 
// the array is [1,1,1,2,2,9,9,3,3]

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,9,9,3,3};
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the element");
        int x = sc.nextInt();

        int frequency = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                frequency++;
            }
        }

        System.out.println("Frequency of " + x + " is " + frequency);
        sc.close();
    }
}
