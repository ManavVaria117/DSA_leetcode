class Solution {
    public void reverseString(char[] s) {
        int count = 0;
        int first = 0;
        int last = s.length - 1;
        while(first != s.length/2){
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
    }
}