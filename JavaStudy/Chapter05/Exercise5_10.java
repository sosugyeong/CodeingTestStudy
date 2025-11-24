public class Exercise5_10 {
    public static void main(String[] args) {
        char[] abcCode = {'`','~','!','@','#','$','%','^','&','*',
            '(',')','-','_','+','=','|','[',']','{',
            '}',';',':',',','.','/'};
        
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
        String src = "abc123";
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (ch>=97 && ch <= 122) {
                result += abcCode[ch-'a'];
            } else {
                result += numCode[ch-'0'];
            }

            //code
        }

        System.out.println("src: "+src);
        System.out.println("result: "+result);
    }
}
