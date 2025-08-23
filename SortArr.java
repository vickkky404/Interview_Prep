import java.util.Arrays;

public class SortArr {
    public static void sortAscending(int[] arr){
        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
    }  

    public static void sortDescending(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int[] desc = new int[n];
        for(int i = 0; i < n; i++) {
            desc[i] = arr[n - 1 - i];
        }
    }


    public static void main(String[] args){

        int[] arr = {9,8,4,3,1};
        sortAscending(arr.clone());
        sortDescending(arr.clone());
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
    
}
