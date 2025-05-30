class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;

        for( char c : s.toCharArray()){
            if (c == '1'){
                ones++;
            }
        } 
        int zeros = s.length() - ones;

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < ones-1 ; i++ ){
            result.append('1');
        }

        for(int j = 0 ; j < zeros ; j++){
            result.append('0');
        }

        result.append(1);

        String answer = new String(result);

        return answer;
    }
}