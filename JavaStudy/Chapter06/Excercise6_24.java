public class Excercise6_24 {

    public static int abs(int value){
        if (value > 0) {
            return value;
        } else {
            int result = 0;
            for(int i = 0; i>value; i--){
                result++;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절댓값: "+abs(value));

        value = -10;
        System.out.println(value+"의 절댓값: "+abs(value));
    }
}
