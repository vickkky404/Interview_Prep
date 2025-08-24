public class TwoPointers {
    
    // Problem 1: Two Sum in Sorted Array
    public static int[] twoSumSorted(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;  // Need bigger sum
            } else {
                right--; // Need smaller sum
            }
        }
        
        return new int[]{-1, -1}; // Not found
    }
    
    // Problem 2: Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        
        int slow = 0; // Points to position of unique elements
        
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        
        return slow + 1; // Length of unique elements
    }
    
    // Problem 3: Reverse Array using Two Pointers
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
    
    // Problem 4: Check if Array is Palindrome
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}