//최적의 온도 찾기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChemistryEx {
    private static void mixPotion(int[] arr){ //0에 가까운 혼합용액 구하기
        //오름차순 정렬
        Arrays.sort(arr);

        //투포인터
        int left = 0;
        int right = arr.length-1;

        int minSum = Integer.MAX_VALUE; //0에 가까운 두 용액의 합을 저장할 변수
        int result1 = 0; //첫번째 용액의 온도
        int result2 = 0; //두번째 용액의 온도
    
        while(left < right){
            int sum = arr[left] + arr[right];

            if(Math.abs(sum)<Math.abs(minSum)){
                minSum = sum;
                result1 = arr[left];
                result2 = arr[right];
            } else if(Math.abs(sum) == Math.abs(minSum)){
                if (arr[left] < result1) {
                    result1 = arr[left];
                    result2 = arr[right];
                }
            }

            if(sum > 0){
                //현재 합이 0보다 크면 오른쪽 포인터를 왼쪽으로 이동
                right--;
            }else{ //현재 합이 0보다 작거나 같으면 왼쪽 포인터를 오른쪽으로 이동
                left++;
            }
        }

        System.out.println(result1+" "+result2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트 케이스 개수 입력
        int test = Integer.parseInt(br.readLine());

        int N = 0; //용액 개수
        int[] arr; //용액의 온도 배열

        while(test > 0){
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            test--;
            mixPotion(arr);
        }
        br.close();
    }
}
