public class Excercise8_9 {
    public static void main(String[] args) {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFuctionException extends RuntimeException{
    private final int ERR_CODE;

    UnsupportedFuctionException(String msg, int errCode){
        super(msg);
        ERR_CODE = errCode;
    }

    UnsupportedFuctionException(String msg){
        this(msg, 100);
    }

    public int getErrorCode(){ //에러코드 반환
        return ERR_CODE;
    }

    public String getMessage(){ //메시지의 내용을 반환
        return "["+getErrorCode()+"]"+super.getMessage();

    }
}