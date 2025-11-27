public class Excercise6_5 {
    public static void main(String[] args) {
        Student2 s = new Student2("박문대", 1, 1, 100, 96, 96);

        System.out.println(s.info());
    }
}

class Student2{
    String name;
    int ban; //반
    int no; //번호
    int kor; //국어점수
    int eng; //영어점수
    int math; //수학점수

    Student2(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int)(getTotal()/3f*10+0.5f)/10f;
        //return (float)getTotal()/3f;
    }

    String info(){
        return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+getTotal()+", "+getAverage();
    }
}
