//array operations Traversal

import java.util.Arrays;
public class Traversal{
	public static void main(String[] args){
		int[] arr = {10 , 20 , 30 , 40 , 50};
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		//traditional way for loop..
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println( );
		
		
		//Enhanced for loop i.e for-each loop..
		System.out.println("\nEnhanced For loop/for-each Loop");
		for(int element : arr ){
			System.out.print(element + " " );
		}
		System.out.println( );
		
		//Backward Traversal...
		System.out.println("\nBackward Traversal");
		for(int i = arr.length - 1 ; i >= 0 ; i--){
			System.out.print(arr[i] + " ");
		}
		System.out.println( );
		
		//using while loop..
		System.out.println("\nUsing while loop");
		int i = 0;
		while(i < arr.length){
			System.out.print(arr[i] + " ");
			i++;
		}
		System.out.println();
		
		
		
		
		
		
		
		
	}
	
}