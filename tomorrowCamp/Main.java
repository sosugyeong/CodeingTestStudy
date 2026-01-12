import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CampService camp = new CampService();

        System.out.print("찾고싶은 수강생의 이름을 입력하세요: ");
        String name = sc.next();

        Optional<Student> studentOptional = camp.findStudentByName(name);

        boolean flag = studentOptional.isPresent();
        if (flag) {
            Student student = studentOptional.get();
            System.out.println("캠프에 "+student.getName()+"수강생이 존재합니다.");
        } else {
            System.out.println("학생이 없습니다.");
        }
    }
}
