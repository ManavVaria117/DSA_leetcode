class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Edge case: handle empty string
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character,Integer> map = new HashMap<>();

        int maxLength = 0;
        int j = 0;
        char[] array = s.toCharArray();
        for(int i = 0; i < s.length(); i++){

            if(map.containsKey(array[i])){
                j = Math.max(j ,map.get(array[i]) + 1);
            }

            map.put(array[i], i);
            int currentLength = i - j + 1; 
            maxLength = Math.max(maxLength , currentLength);  
        }
        return maxLength;
    }
}