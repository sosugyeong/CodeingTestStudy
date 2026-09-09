class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] number = new int[str.length];
        
        for(int i=0; i<str.length; i++){
            Integer num = Integer.parseInt(str[i]);
            number[i] = num;    
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < number.length; i++){
            if(max < number[i]){
                max = number[i];
            }
            
            if(min > number[i]){
                min = number[i];
            }
        }
        
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer; 
    }
}