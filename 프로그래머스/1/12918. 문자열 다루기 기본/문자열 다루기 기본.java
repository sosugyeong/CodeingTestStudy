class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i<s.length(); i++){
                char c = s.charAt(i);
                if(c >= 'A'){
                    answer = false;
                    return answer;
                }
            }
            return answer;
        } else {
            answer = false;
            return answer;
        }
    }
}