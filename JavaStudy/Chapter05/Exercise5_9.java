import java.util.*;

//주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램
public class Exercise5_9 {
    public static void main(String[] args) {
        char[][] star = {
            {'*', '*',' ',' ',' '},
            {'*', '*',' ',' ',' '},
            {'*', '*','*','*','*'},
            {'*', '*','*','*','*'}
        };

        int row = star.length;
        int col = star[0].length;
        
        char[][] result = new char[col][row];

        System.out.println("오리지널");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int k = star.length-1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < star[i].length; j++) {
                result[j][k] = star[i][j];
            }
            k--;
        }

        System.out.println("\n시계방향 90도 회전후 결과");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    
}
