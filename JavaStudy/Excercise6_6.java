public class Excercise6_6 {
    static double getDistance(int x, int y, int x1, int y1){
        double d1 = x1-x;
        double d2 = y1-y;
        double d3 = d1*d1 + d2*d2;
        return Math.sqrt(d3);
    }
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
