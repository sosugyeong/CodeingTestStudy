class Solution {
    public int solution(int n) {
        int answer = 9999999;
        
        for(int i = 1; i<n; i++){
            if(n % i == 1 && answer > i){
                answer = i;
            }
        }
        
        return answer;
    }
}