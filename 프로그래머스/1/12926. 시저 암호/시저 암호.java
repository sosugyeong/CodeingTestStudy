class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char c = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(c == ' ') {
                answer.append(c);
            } else if(c >= 'A' && c <= 'Z'){
                char shift = (char)('A' + (c - 'A' + n) % 26);
                answer.append(shift);
            } else if (c >= 'a' && c <= 'z'){
                char shift = (char)('a' + (c - 'a' + n) % 26);
                answer.append(shift);
            }
        }
        
        return answer.toString();
    }
}