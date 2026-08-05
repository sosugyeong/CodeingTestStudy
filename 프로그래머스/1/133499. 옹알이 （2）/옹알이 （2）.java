class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] wrongWords = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i<babbling.length; i++){
            String str = babbling[i];
            
            boolean hasWrong = false;
            for(int j = 0; j < wrongWords.length; j++){
                if(str.contains(wrongWords[j])){
                    hasWrong = true;
                    break;
                }
            }
            
            if(hasWrong){
                continue;
            }
            
            for(int j = 0; j < words.length; j++){
                str = str.replace(words[j], " ");
            }
            System.out.println(str);
            
            str = str.trim();
            if(str.equals("")){
                answer++;
            }
        }
        
        return answer;
    }
}