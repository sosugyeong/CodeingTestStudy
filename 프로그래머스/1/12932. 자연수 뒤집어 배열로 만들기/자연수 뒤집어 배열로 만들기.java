class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int i = 0;
        
        while(n > 0){
            answer[i] = (int) (n % 10);
            n /= 10;
            i++;
        }
        return answer;
    }
}