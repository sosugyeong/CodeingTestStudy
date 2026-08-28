class Solution {
    public long solution(long n) {
        long answer = 0;
        long f1 = 0;
        long f2 = 1;
        
        if(n <= 1) return n;
        
        for(int i = 2; i <= n; i++){
            answer = (f1 + f2) % 1234567;
            
            f1 = f2;
            f2 = answer;
        }
        
        return answer;
    }
}