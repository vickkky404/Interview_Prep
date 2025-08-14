// Alternates in an Array
// You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).


import java.util.*; 

class Solution {
    
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i += 2) { 
            result.add(arr[i]);
        }

        return result;
    }
}
