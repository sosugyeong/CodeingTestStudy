public class SingleTask {
    public long calculateSum() {
        long sum = 0;
        for (int i = 0; i<= 1000; i++) {
            sum += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }
}
