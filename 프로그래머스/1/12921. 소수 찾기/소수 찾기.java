
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = false;
        
        for(int i = 2; i <= n; i++){
            check = sol(i);
            if(check == true) answer++;
        }
        
        return answer;
    }
    
    public boolean sol(int n){
        if(n < 2) return false;
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        
        return true;
    }
}