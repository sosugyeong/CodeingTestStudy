class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number);
        int phoneSize = phone_number.length() - 4;
        
        for(int i =0; i < phoneSize; i++){
            answer.setCharAt(i, '*');
        }
        
        return answer.toString();
    }
}