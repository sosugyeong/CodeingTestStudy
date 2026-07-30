import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int count = score.length - m;
        
        for(int i = score.length-1; i >= score.length % m; i--){
            if(i == count){
                answer += (score[i] * m);
                
                if(score.length%m < count){
                    count -= m;
                }
            }
        }
        
        return answer;
    }
}