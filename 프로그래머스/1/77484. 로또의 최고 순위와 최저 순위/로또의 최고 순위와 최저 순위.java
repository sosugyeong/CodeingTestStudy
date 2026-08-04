import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
            }
            
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                }
            }
        }
        answer[0] = grade(count+zero);
        answer[1] = grade(count);
        
        return answer;
    }
    
    private int grade(int n){
        switch (n) {
		case 6:	return 1;
		case 5:	return 2;
		case 4: return 3;
        case 3: return 4;
        case 2: return 5;
        case 1: return 6;
		default: return 6;
		}
    }
}