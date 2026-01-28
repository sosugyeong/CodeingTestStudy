import java.util.Scanner;

public class MatrixTraversal3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.1. 격자 크기 N과 N x N 배열을 입력 받음
        int N = sc.nextInt();
        int[][] grid = new int[N][N];
        
        // N x N 격자 입력 받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int hang = sc.nextInt();
        int yoel = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(grid[i][j] == grid[hang][yoel]){
                    sum = (grid[i+1][j]+grid[i-1][j])+(grid[i][j+1]+grid[i][j-1]);
                }
            }
        }

        /* 
        int[] dy = {-1, 1, 0, 0}; // 상하좌우 행 방향
        int[] dx = {0, 0, -1, 1}; // 상하좌우 열 방향

        // 2.1. 4방향 순회
        for (int i = 0; i < 4; i++) {
            // 2.1.1. 새로운 좌표 계산
            int nx = hang + dx[i];
            int ny = yoel + dy[i];

            // 2.1.2. 격자 범위 체크를 수행
            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                sum += grid[ny][nx];
            }
        }*/

        System.out.println(sum);
    }
}
