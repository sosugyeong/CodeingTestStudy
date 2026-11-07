class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i = 0; i < schedules.length; i++){
            int day = startday;
            int score = 0;
            int limit = timeCal(schedules[i]);
            
            for(int j = 0; j < timelogs[i].length; j++){
                if(day%7 != 0 && day%7 != 6){
                    if(timelogs[i][j] <= limit){
                        score++;
                    }
                }
                
                day++;
            }
            
            if(score == 5){
                answer++;
            }
        }
        return answer;
    }
    
    private int timeCal(int time){
        int hour = time / 100;
        int min = time % 100;
        
        min = min + 10;
        if(min >= 60){
            hour++;
            min = min - 60;
        }
        
        return (hour*100)+min;
    }
}