class Solution {
    public long solution(long num) {
        long answer = 0;
        if(answer == 1) {
            return answer;
        }
        
        while (answer < 500 && num != 1){
            if(num % 2 == 0){
                answer++;
                num = num / 2;
            } else {
                answer++;
                num = (num * 3) + 1; 
            }
        }
        
        if(answer >= 500){
            return -1;
        }
        
        return answer;
    }
}