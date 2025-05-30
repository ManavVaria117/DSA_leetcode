class Solution {
    public char findTheDifference(String s, String t) {
        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();

        Arrays.sort(strS);
        Arrays.sort(strT);

        int i = 0;
        int j = 0;

        while(i < strS.length && j < strT.length){
            if(strS[i] == strT[j]){
                i++;
                j++;
            }
            else{
                return strT[i];
            }
        }
        return strT[strT.length -1];
    }
}