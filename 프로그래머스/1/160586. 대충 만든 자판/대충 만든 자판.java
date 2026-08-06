import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char ch = keymap[i].charAt(j);
                int idx = j + 1;
                
                map.put(ch, Math.min(idx, map.getOrDefault(ch, 999)));
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            for(int j = 0; j < targets[i].length(); j++){
                char ch = targets[i].charAt(j);
                
                if(map.containsKey(ch)){
                    sum += map.get(ch);
                } else {
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        
        System.out.println(map); 
        
        return answer;
    }
}