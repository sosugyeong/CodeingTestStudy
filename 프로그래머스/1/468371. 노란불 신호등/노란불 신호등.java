import java.util.*;

class Solution {
    public int solution(int[][] signals) {
        int answer = 0;
        int n = signals.length;
        int[] c = new int[n];
        
        for(int i = 0; i < n; i++){
            c[i] = signals[i][0] + signals[i][1] + signals[i][2];
        }
        
        int maxTime = c[0];
        for(int i = 1; i < n; i++){
            maxTime = lcm(maxTime, c[i]);
        }
        
        for(int t = 1; t <= maxTime; t++){
            boolean allYellow = true;
            
            for(int i = 0; i < n; i++){
                int greenTime = signals[i][0];
                int yellowTime = signals[i][1];
                
                int pos = (t - 1) % c[i] + 1;
                
                if(!(pos > greenTime && pos <= greenTime + yellowTime)){
                    allYellow = false;
                    break;
                }
            }
            
            if(allYellow){
                return t;
            }
        }
        
        return -1;
    }
    
    // 최대공약수 (GCD)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    // 최소공배수 (LCM)
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}