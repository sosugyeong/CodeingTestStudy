public class Excercise9_6 {
    public static String fillZero(String src, int length){
        if (src == null || src.length() == length) {return src;}
        if (length <= 0) {return "";}
        if (src.length() > length) { //src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환.
            return src.substring(0, length);
        }

        char[] ch = new char[length];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = '0';
        }

        System.arraycopy(src.toCharArray(), 0, ch, length-src.length(), src.length());

        return new String(ch);
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}
