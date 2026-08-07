import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";        
        char[] charArr = skip.toCharArray();
        Arrays.sort(charArr);
        
        List<String> alphabet = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            boolean isSkip = false;
            
            for(int j = 0; j < charArr.length; j++){
                if(ch == charArr[j]){
                    isSkip = true;
                    break;
                }
            }
            
            if(!isSkip){
                alphabet.add(String.valueOf(ch));
            }
        }
        
        int validSize = alphabet.size();
        for(int i = 0; i < s.length(); i++){
            String target = String.valueOf(s.charAt(i));  
            int currentIndex = alphabet.indexOf(target);
            int targetIndex = (currentIndex + index) % validSize;
            
            answer += alphabet.get(targetIndex);
        }
        
        return answer;
    }
}