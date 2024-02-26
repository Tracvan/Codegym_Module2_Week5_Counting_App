public class Count implements Runnable{
    private Thread myThread;
    public Count(){
        myThread = new Thread(this, "My runnable thread");
        System.out.println("My threat is created: " + myThread.getName());
        myThread.start();
    }
    Thread getMyThread(){
        return myThread;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Printin the count: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException interruptedException){
            System.out.println("My Thread is interrupted");
        }
        System.out.println("My thread run is over");
    }

}
