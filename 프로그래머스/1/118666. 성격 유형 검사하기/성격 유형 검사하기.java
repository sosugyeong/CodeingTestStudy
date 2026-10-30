import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> scores = new HashMap<>();

        for(int i = 0; i < survey.length; i++){
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            int choice = choices[i];
            
            if(choice < 4){
                int score = 4 - choice;
                scores.put(disagree, scores.getOrDefault(disagree, 0) + score);
            } else if (choice > 4){
                int score = choice - 4;
                scores.put(agree, scores.getOrDefault(agree, 0) + score);
            }
        }
        
        String[][] sheet = {{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        for(String[] str : sheet){
            char c1 = str[0].charAt(0);
            char c2 = str[1].charAt(0);
            
            int score1 = scores.getOrDefault(c1, 0);
            int score2 = scores.getOrDefault(c2, 0);
            
            if(score1 > score2){
                answer += c1;
            } else if(score1 < score2){
                answer += c2;
            } else {
                answer += c1;
            }
        }
        
        return answer;
    }
}