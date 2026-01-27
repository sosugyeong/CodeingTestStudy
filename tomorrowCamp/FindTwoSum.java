import java.util.Arrays;

//두 수의 합이 특정 값이 되는 쌍 찾기
public class FindTwoSum {

    private static boolean findTwoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if (arr[left]+arr[right] == target) {
                System.out.println("찾은 두 수: " + arr[left] + ", " + arr[right]);
                return true;
            } else if(arr[left]+arr[right] < target){
                left = left + 1;
            } else {
                right = right -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       // 테스트를 위한 예제 배열과 목표 합 설정
       int[] arr = {4, 1, 8, 7, 3, 2};  // 정렬되지 않은 배열
       int target = 10;  // 찾고자 하는 합

       // 투 포인터 탐색 수행 및 결과 출력
        System.out.println("원본 배열: " + Arrays.toString(arr));
        System.out.println("목표 합: " + target);
        boolean result = findTwoSum(arr, target);
        System.out.println("합이 " + target + "이 되는 두 수가 " + 
            (result ? "존재합니다." : "존재하지 않습니다."));
    }
}
