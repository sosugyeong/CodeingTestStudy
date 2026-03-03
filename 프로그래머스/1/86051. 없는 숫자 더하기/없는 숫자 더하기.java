import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < 10; j++){
                if(numbers[i] == j){
                    answer += numbers[i];
                }
            }
        }
        answer = 45 - answer -1;
        return answer;
    }
}