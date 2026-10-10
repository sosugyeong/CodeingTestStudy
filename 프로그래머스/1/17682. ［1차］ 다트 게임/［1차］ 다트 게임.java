import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Deque<Integer> score = new ArrayDeque<>();
        
        for(int i = 0; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            
            if(ch == '1' && dartResult.charAt(i+1) == '0'){
                score.push(10);
                i++;
            } else if(ch >= '0' && ch <= '9'){
                score.push(ch - '0');
            }
            else if(ch >= 'A' && ch <= 'Z'){
                int sc = score.pop();
                if(ch == 'S'){
                    sc *= 1;
                    score.push(sc);
                } else if(ch == 'D'){
                    sc = (int) Math.pow(sc, 2);
                    score.push(sc);
                } else if(ch == 'T'){
                    sc = (int) Math.pow(sc, 3);
                    score.push(sc);
                }
            } else {
                int first = score.pop(); //현재
                if(ch == '*' && !score.isEmpty()){
                    int sc = score.pop(); //이전
                    sc = sc * 2;
                    first = first * 2;
                    score.push(sc);
                    score.push(first);
                } else if(ch == '*' && score.isEmpty()) {
                    first = first * 2;
                    score.push(first);
                }else if(ch == '#'){
                    first = first * -1;
                    score.push(first);
                }
            }
        }
        
        while(!score.isEmpty()){
            answer += score.pop();
        }
        return answer;
    }
}