public class OddElementSum {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};
        int oddSum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 != 0){
                oddSum += arr[i];
            }
        }

        System.out.print("The sum of  Odd elements in the array is: "  + oddSum);
    }
}
