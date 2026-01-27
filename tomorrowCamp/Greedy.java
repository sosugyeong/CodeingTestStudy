//한 개의 회의실에서 진행할 수 있는 최대 회의 수 구하기
import java.util.*;

public class Greedy {

    public static int maxMeetings(int[][] meetings){

        //종료시간 기준으로 오름차순 정렬
        Arrays.sort(meetings, (a, b) -> {
            return a[1] - b[1];
        });

        int count = 1; // 회의 카운트
        int lastEndTime = meetings[0][1]; //첫번째 회의 종료시간

        //이전 선택한 회의의 종료 시간보다 시작 시간이 같거나 늦을 회의중에서 가장 일찍 끝나는 회의를 선택하고 카운트 증가
        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] >= lastEndTime) {
                count++;
                lastEndTime = meetings[i][1];
            }
        }


        return count;
    }

    public static void main(String[] args) {
       // 테스트용 회의 배열 생성
        int[][] meetings = {
            {1, 4},  // 1번팀
            {3, 5},  // 2번팀
            {0, 6},  // 3번팀
            {5, 7},  // 4번팀
            {3, 8},  // 5번팀
            {5, 9},  // 6번팀
            {6, 10}, // 7번팀
            {8, 11}  // 8번팀
        };

        
       // 최대 회의 개수 구하기
        int maxCount = maxMeetings(meetings);
        System.out.println("최대 진행 가능한 회의 수: " + maxCount);
    }
}
