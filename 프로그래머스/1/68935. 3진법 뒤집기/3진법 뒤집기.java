import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int num = 1;
        
        while(n > 0){
            list.add(n%3);
            n = n / 3;
        }
        
        System.out.println(list);
        
        for(int i = list.size()-1; i >= 0; i--){
            answer += list.get(i) * num;
            System.out.println(num);
            num *= 3;
        }
        return answer;
    }
}