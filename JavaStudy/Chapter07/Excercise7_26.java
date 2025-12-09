class Outer2 {
    static class Inner2 {
        int iv = 200;
    }
}
public class Excercise7_26 {
    public static void main(String[] args) {
        Outer2.Inner2 i2 = new Outer2.Inner2();
        System.out.println(i2.iv);
    }
}
