import java.util.*;

class TwoSum {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<List<Integer>> pairs = new HashSet<>();
        
        for (int num : arr) {
            if (set.contains(-num)) {
                
                int a = Math.min(num, -num);
                int b = Math.max(num, -num);
                pairs.add(Arrays.asList(a, b));
            }
            set.add(num);
        }
        
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (List<Integer> p : pairs) {
            result.add(new ArrayList<>(p));
        }
        
        
        result.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0))) return a.get(0) - b.get(0);
            return a.get(1) - b.get(1);
        });
        
        return result;
    }
}
