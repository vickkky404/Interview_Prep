public class EvenElementSum {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};

        int evenSum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                evenSum += arr[i];
            }
        }

        System.out.println("Sum of even element: " + evenSum);
    }

}


