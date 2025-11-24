import java.util.Scanner;

//단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 문제.
public class Exercise5_13 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            //code
            for (int j = 0; j < question.length-2; j++) {
                if (j%2==0) {
                    char temp = question[j];
                    question[j] = question[j+1];
                    question[j+1] = temp;
                } else {
                    char tmp = question[j];
                    question[j] = question[j+2];
                    question[j+2] = tmp;
                }
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요 >> ", i+1, new String(question));

            String answer = sc.nextLine();

            if (words[i].equals(answer.trim())) {
                System.out.printf("맞았습니다.\n\n");
            } else {
                System.out.printf("틀렸습니다.\n\n");
            }
        }
    }
}
