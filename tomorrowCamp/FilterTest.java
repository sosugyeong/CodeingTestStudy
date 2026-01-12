import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        /* 
        List<Integer> ret6 = arrayList.stream() // 1. 데이터 준비: 스트림 생성
        .filter(num -> num % 2 == 0)    // 2. 중간 연산: 짝수만 필터링
        .map(num -> num * 10)           // 3. 중간 연산: 10배로 변환
        .collect(Collectors.toList());
         */

        //1. 익명클래스를 변수에 담아 전달
        Predicate<Integer> function = new Predicate<>() {
            @Override
            public boolean test(Integer integer){
                return (integer%2) == 0;
            }
        };

        //2. 람다식을 변수에 담아 전달
        Predicate<Integer> pre = integer -> (integer % 2)==0;

        //3. 람다식 직접 활용
        List<Integer> list = al.stream().filter(integer -> integer % 2 == 0)
                                        .collect(Collectors.toList());
    }
}
