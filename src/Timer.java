public class Timer extends Thread
{
    private int threadNumber;

    public Timer(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run()
    {
        for(;;) {
            System.out.println(threadNumber);
        }
    }
}