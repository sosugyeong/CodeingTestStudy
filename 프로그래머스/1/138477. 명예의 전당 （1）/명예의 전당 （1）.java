import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            if(list.size() < k-1){
                list.add(score[i]);
                list.sort(Comparator.reverseOrder());
                answer[i] = list.get(i);
                
            } else {
                list.add(score[i]);
                list.sort(Comparator.reverseOrder());
                answer[i] = list.get(k-1);
            }
        }
        
        return answer;
    }
}