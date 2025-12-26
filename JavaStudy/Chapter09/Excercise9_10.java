public class Excercise9_10 {
    public static String format(String str, int length, int alignment){
        if (length < str.length()) {
            return str.substring(0, length);
        }

        char[] sch = str.toCharArray();
        char[] ch = new char[length];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = ' ';
        }

        if (alignment == 0) {
            System.arraycopy(sch, 0, ch, 0, sch.length);
        } else if (alignment == 1) {
            System.arraycopy(sch, 0, ch, (length - str.length())/2, sch.length);
        } else if (alignment == 2) {
            System.arraycopy(sch, 0, ch, length - str.length(), sch.length);
        }

        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));

    }
}
