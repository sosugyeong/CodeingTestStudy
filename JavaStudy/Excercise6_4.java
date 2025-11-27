public class Excercise6_4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "박문대";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 96;
        s.math = 96;

        System.out.println("이름: "+s.name);
        System.out.println("총점: "+s.getTotal());
        System.out.println("평균: "+s.getAverage());
    }
}

class Student{
    String name;
    int ban; //반
    int no; //번호
    int kor; //국어점수
    int eng; //영어점수
    int math; //수학점수

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int)(getTotal()/3f*10+0.5f)/10f;
        //return (float)getTotal()/3f;
    }
}
