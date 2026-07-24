class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        String[] strArry = Integer.toString(x).split("");
        for(int i = 0; i<strArry.length; i++){
            sum += Integer.parseInt(strArry[i]);
        }
        
        if(x % sum == 0){
            return true;
        } else {
            return false;
        }
    
    }
}