import java.util.Scanner;
import java.util.Vector;
import java.util.regex.*;

public class Excercise9_14 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
            "012-3456-7890",
            "099-2456-7980",
            "188-2346-9870",
            "013-3456-7890"
        };

        Vector list = new Vector<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            String input = sc.nextLine().trim(); //입력 내용에서 공백을 제거

            if (input.equals("")) {
                continue;
            } else if(input.equalsIgnoreCase("Q")){
                System.exit(0);
            }

            String pattern = ".*"+input+".*";
            Pattern p = Pattern.compile(input);
            for (int i = 0; i < phoneNumArr.length; i++) {
                String phoneNum = phoneNumArr[i];
                String tmp = phoneNum.replace("-", "");

                Matcher m = p.matcher(tmp);

                if (m.find()) {
                    list.add(phoneNum);
                }
            }

            if(list.size()>0){
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    }
}
