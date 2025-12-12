class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int count = 0;
        if(t.length() == 0 && s.length() != 0){
            return false;
        }
        if(s.length() == 0 && t.length() != 0){
            return true;
        }
        if(s.length() == 0 && t.length() == 0){
            return true;
        }
        for(int j = 0 ; j < t.length() ; j++){
            if( s.charAt(i) == t.charAt(j)){
                i++;
                count++;
                if(count == s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}