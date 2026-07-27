class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0;
        int min = 999999999;
        
        for(int i = 1; i <= n; i++){
            if(n%i==0 && m%i==0){
                max = i;
            }
        }
        answer[0] = max;
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(n*i == m*j){
                    if(min > n*i){
                        min = n*i;
                    }
                    break;
                }
            }
        }
        answer[1] = min;
        
        return answer;
    }
}