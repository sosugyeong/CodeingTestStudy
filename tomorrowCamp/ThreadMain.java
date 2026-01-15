public class ThreadMain {
    public static void main(String[] args) {
        //싱글 쓰레드 방식
        long singleStartTime = System.currentTimeMillis();
        SingleTask singleTask = new SingleTask();
        long singleSum = singleTask.calculateSum();
        long singleEndTime = System.currentTimeMillis();
        long singleDuration = singleEndTime - singleStartTime;
        System.out.println("싱글 쓰레드 합계: " + singleSum);
        System.out.println("싱글 쓰레드 소요시간: " + singleDuration + "ms");

        //멀티 쓰레드 방식
        long multiStartTime = System.currentTimeMillis();
        MultiTask task0 = new MultiTask(1, 250);
        MultiTask task1 = new MultiTask(251, 500);
        MultiTask task2 = new MultiTask(501, 750);
        MultiTask task3 = new MultiTask(751, 1000);

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long partialSum0 = task0.getPartialSum();
        long partialSum1 = task1.getPartialSum();
        long partialSum2 = task2.getPartialSum();
        long partialSum3 = task3.getPartialSum();
        long multiSum = partialSum0 + partialSum1 + partialSum2 + partialSum3;
        long multiEndTime = System.currentTimeMillis();
        long multiDuration = multiEndTime - multiStartTime;
        System.out.println("멀티 쓰레드 합계: " + multiSum);
        System.out.println("멀티 쓰레드 소요시간: " + multiDuration + "ms");
    }
    
}
