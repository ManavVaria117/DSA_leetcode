class Solution {
    public String reverseVowels(String s) {
        int n = s.length(); 
        char[] cArray = s.toCharArray();
        int i = 0;
        int j = n - 1;

        while (i < j) {
            while (i < j && !isVowel(cArray[i])) {
                i++;
            }
            while (i < j && !isVowel(cArray[j])) {
                j--;
            }
            // Swap vowels
            char temp = cArray[i];
            cArray[i] = cArray[j];
            cArray[j] = temp;

            i++;
            j--;
        }

        return new String(cArray);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
