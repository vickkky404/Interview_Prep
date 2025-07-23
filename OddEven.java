public class OddEven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int evenSum = 0 ;
        int  oddSum = 0;


        for(int i = 0; i<arr.length; i++){
            if(i % 2 == 0){
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.err.println("The sum of elements at even indices is: " + evenSum);
        System.err.println("The sum of elements at odd indices is: " + oddSum);
    }
}
