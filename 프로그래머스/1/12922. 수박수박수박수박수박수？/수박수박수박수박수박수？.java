class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String one = "수";
        String two = "박";
        
        for(int i = 0; i < n ; i++){
            if(i % 2 == 0){
                sb.append(one);
            } else {
                sb.append(two);
            }
        }
        return sb.toString();
    }
}