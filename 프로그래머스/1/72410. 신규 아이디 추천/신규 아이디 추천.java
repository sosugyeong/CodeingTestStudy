import java.util.*;

class Solution {
    public String solution(String new_id) {
        
        new_id = new_id.toLowerCase();
        
        new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
        
        new_id = new_id.replaceAll("[.]{2,}", ".");
        
        if(new_id.startsWith(".")){
            new_id = new_id.substring(1);
        }
        
        if(new_id.endsWith(".")){
            new_id = new_id.substring(0, new_id.length()-1);
        }
        
        if(new_id.isEmpty()){
            new_id = "a";
        }
        
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            
            if(new_id.endsWith(".")){
                new_id = new_id.substring(0, new_id.length()-1);
            }
        }
        
        StringBuffer sb = new StringBuffer(new_id);
        if(sb.length() < 3){
            char ch = sb.charAt(sb.length()-1);
            
            while(sb.length() < 3){
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}