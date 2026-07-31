class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = section[0] + m;
        int i = 0;
        
        while(section.length > i){
            if(section[i] < paint){
                i++;
                
            } else if (section[i] >= paint){
                paint = section[i] + m;
                answer++;
                i++;
            }
        }
        answer++;
        
        return answer;
    }
}