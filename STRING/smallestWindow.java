import java.util.HashMap;

class Solution {
    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) return "";

        
        HashMap<Character, Integer> mapP = new HashMap<>();
        for (char c : p.toCharArray()) {
            mapP.put(c, mapP.getOrDefault(c, 0) + 1);
        }

        
        int start = 0, minLength = Integer.MAX_VALUE, minStart = 0;
        int matchedCount = 0;
        HashMap<Character, Integer> windowMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);

            windowMap.put(endChar, windowMap.getOrDefault(endChar, 0) + 1);

            if (mapP.containsKey(endChar) && windowMap.get(endChar).intValue() <= mapP.get(endChar).intValue()) {
                matchedCount++;
            }

            while (matchedCount == p.length()) {
                int windowLen = end - start + 1;

                if (windowLen < minLength) {
                    minLength = windowLen;
                    minStart = start;
                }

               
                char startChar = s.charAt(start);
                windowMap.put(startChar, windowMap.get(startChar) - 1);

                if (mapP.containsKey(startChar) && windowMap.get(startChar).intValue() < mapP.get(startChar).intValue()) {
                    matchedCount--;
                }

                start++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? "" : s.substring(minStart, minStart + minLength);
    }
}
