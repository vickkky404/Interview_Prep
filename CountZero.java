public class CountZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,3,4};

        int zeroCount = countZeros(arr);
        System.out.println("Count Zero: " + zeroCount);
    }

    public static int countZeros(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }
            

}
