//두 수의 합이 target이 되는 조합을 찾기
public class BruteForce {

    public static int[] findPairs(int[] numbers, int target){

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (target == (numbers[i] + numbers[j])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
       // 테스트용 입력값 설정
        int[] numbers = {2, 11, 7, 15};
        int target = 9;  // 예상 결과: [0, 2] (2 + 7 = 9)

        // findPairs 메서드 실행
        int[] result = findPairs(numbers, target);

       // 결과 출력 및 검증
        if (result.length == 0) {
            System.out.println("합이 " + target + "이 되는 두 수를 찾을 수 없습니다.");
        } else {
            System.out.printf("찾은 인덱스: [%d, %d]\n", result[0], result[1]);
            System.out.printf("해당 값: %d + %d = %d\n", 
                numbers[result[0]], numbers[result[1]], target);
        }
    }
}
