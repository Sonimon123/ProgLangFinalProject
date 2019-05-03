public class CoroutineVThreads {

    class ArrWrite implements Runnable { // Writes to array

        int i;

        public ArrWrite(int index) {
            i = index;
        }

        public void run(){
            ThousArray[i] = 1;
            System.out.println("1");
        }

    }

    public int ThousArray[] = new int[10000];

    public long start(){
        Thread[] ThreadArray = new Thread[10000];
        long StartTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            ThreadArray[i] = new Thread(new ArrWrite(i));
            ThreadArray[i].start();
        }

        for (int i = 0; i < 10000; i++) {
            try {
                ThreadArray[i].join();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        long FinishTime = System.nanoTime();
        long Duration = FinishTime - StartTime;
        System.out.println("Time Elapsed: " + Duration);
        return Duration;
    }

    public static void main(String[] args) {
        CoroutineVThreads t = new CoroutineVThreads();
        long One = t.start();
        long Two = t.start();
        long Three = t.start();
        long Four = t.start();
        long Five = t.start();
        long Avg = ((One+Two+Three+Four+Five)/5);
        System.out.println("Average Time: " + Avg);
    }

}
