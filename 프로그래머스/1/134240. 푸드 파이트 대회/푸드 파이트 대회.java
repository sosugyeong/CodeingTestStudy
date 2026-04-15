class Solution {
    public String solution(int[] food) {
        String answer = "";
        int sum = 0;
        
        for(int i = 1; i<food.length; i++){
            if(food[i] % 2 == 1){
                food[i]--;
            }
            sum += food[i];
        }
        
        for(int i = 1; i<food.length; i++){
            for(int j = 0; j<food[i]/2; j++){
                answer = answer + i;
            }
        }
        answer = answer + 0;
        for(int i = food.length-1; i>0; i--){
            for(int j = 0; j<food[i]/2; j++){
                answer = answer + i;
            }
        }
        
        
        return answer;
    }
}