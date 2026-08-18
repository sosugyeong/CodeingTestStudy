import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        String date = ""; //날짜
        String term = ""; //약관 종류    
        int totalDay = convertToday(today);
        
        for(int i = 0; i < privacies.length; i++){
            String[] parts = privacies[i].split(" ");
            
            date = parts[0];
            term = parts[1];
            
            for(int j = 0; j < terms.length; j++){
                String[] part = terms[j].split(" ");
                
                String type = part[0];
                String month = part[1];
                
                int totalToday = convertToday(date) + (Integer.parseInt(month) * 28);
                
                if(term.equals(type)){
                    if(totalDay >= totalToday){
                        list.add(i+1);
                    }
                    break;
                }
            }
            
        
        }
        
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
    
    public int convertToday(String dateStr){
        String[] parts = dateStr.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
    
        return (year * 12 * 28) + (month * 28) + day;
    }
}