import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hash = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            hash.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++){
            String calledPlayer = callings[i];
            
            int currentIdx = hash.get(calledPlayer); 

            int frontIdx = currentIdx - 1;
            String frontPlayer = players[frontIdx];
            
            players[frontIdx] = calledPlayer;
            players[currentIdx] = frontPlayer;
            
            hash.put(calledPlayer, frontIdx);
            hash.put(frontPlayer, currentIdx);
        }
        
        return players;
    }
}