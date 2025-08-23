//Array Operations. Linear search..

import java.util.Arrays;
import java.util.Scanner;

class LinearSearch{
		public static int linearSearch(int[] arr , int target){
			for(int i = 0 ; i < arr.length ; i++){
				if(arr[i] == target){
					return i;
				}
			}
			
			return -1;
		}
		
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			
			int[] arr = {64,34,25,12,22,11,90};
			
			System.out.println("Array: " + Arrays.toString(arr));
			
			System.out.print("Enter element to search :");
			int target = sc.nextInt();
			
			int result = linearSearch(arr , target);
			
			
			if(result != -1){
				System.out.println("Element " + target);
			}else{
				System.out.println("Element " + target);
			}
			
			
			
		}
		//sc.close;
}


