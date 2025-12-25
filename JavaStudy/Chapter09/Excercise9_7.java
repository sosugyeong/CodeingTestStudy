public class Excercise9_7 {

    public static boolean contains(String src, String target){
        int result = src.indexOf(target);
        if (result != 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}
