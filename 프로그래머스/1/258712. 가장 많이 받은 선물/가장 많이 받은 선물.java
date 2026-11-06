import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        int[][] gift = new int[friends.length][friends.length];
        int[][] giftRecord = new int[friends.length][2]; //준 선물, 받은 선물
        Map<String, Integer> nameMap = new HashMap<>();
        
        for(int i = 0; i < friends.length; i++){
            nameMap.put(friends[i], i);
        }
        
        for(int i = 0; i < gifts.length; i++){
            String[] name = gifts[i].split(" ");
            int giverIdx = nameMap.get(name[0]);
            int receiverIdx = nameMap.get(name[1]);
            
            giftRecord[giverIdx][0] += 1;
            giftRecord[receiverIdx][1] += 1;       
            gift[giverIdx][receiverIdx] += 1;
        }
        
        int[] giftScore = new int[friends.length];
        for(int i = 0; i < friends.length; i++){
            giftScore[i] = giftRecord[i][0] - giftRecord[i][1];
        }
        
        int[] nextGift = new int[friends.length];
        for(int i = 0; i < friends.length; i++){
            for(int j = i+1; j < friends.length; j++){
                int giveItoJ = gift[i][j];
                int giveJtoI = gift[j][i];
                
                if(giveItoJ > giveJtoI){
                    nextGift[i]++;
                } else if (giveItoJ < giveJtoI){
                    nextGift[j]++;
                } else {
                    if(giftScore[i] > giftScore[j]){
                        nextGift[i]++;
                    } else if(giftScore[i] < giftScore[j]){
                        nextGift[j]++;
                    }
                }
            }
        }
        
        int maxGift = 0;
        for(int best : nextGift){
            maxGift = Math.max(maxGift, best);
        }
        
        return maxGift;
    }
}