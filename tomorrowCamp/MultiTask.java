public class MultiTask implements Runnable{

    private int start;
    private int end;
    private long partialSum;

    public MultiTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    public long getPartialSum(){
        return this.partialSum;
    }

    @Override
    public void run(){

        for (int i = this.start; i <= this.end; i++) {
            this.partialSum += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
