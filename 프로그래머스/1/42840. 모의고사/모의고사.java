import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patten = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] result = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < patten.length; j++){
                if(answers[i] == patten[j][i%patten[j].length]){
                    result[j]++;
                }
            }
        }
        
        int max = 0;
        for(int i = 0; i < result.length; i++){
            if(max < result[i]){
                max = result[i];
            }
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i <result.length; i++){
            if(max == result[i]){
                answer.add(i+1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}