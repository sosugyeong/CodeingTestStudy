import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] c = Long.toString(n).toCharArray();
        
        Arrays.sort(c);
        
        String str = new StringBuilder(new String(c)).reverse().toString();
        return Long.parseLong(str);
    }
}