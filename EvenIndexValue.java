// 2.	Write a Java program to print even index values of an array. Input-{1,2,3,4,5,6}
// Output-{1,3,5,}

public class EvenIndexValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Values at even indices: " );
         for(int i = 0; i< arr.length ; i += 2){
            System.out.println(arr[i] + " ");
         }
    }
}
