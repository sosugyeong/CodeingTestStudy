class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        
        if(len % 2 == 1){
            len /= 2;
            answer = s.substring(len, len+1);
        } else {
            len /= 2;
            answer = s.substring(len-1, len+1);
        }
        return answer;
    }
}