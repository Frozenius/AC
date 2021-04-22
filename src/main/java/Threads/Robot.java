package Threads;

public class Robot {

    public Robot() throws Exception{
        HorizontalThread horizontalThread = new HorizontalThread();
        VerticalThread verticalThread = new VerticalThread();
        Thread threadHorizontal = new Thread(horizontalThread);
        Thread threadVertikal = new Thread(verticalThread);
        threadHorizontal.start();
        threadVertikal.start();
        Thread.sleep(10000);
        horizontalThread.stop();
        verticalThread.stop();
    }
}

class HorizontalThread implements Runnable {

    private boolean running = true;

    public void run(){
        while(running){
            random();
            try {
                Thread.sleep((long) Math.random()*2000+1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void random(){
        if (Math.random() < 0.5) {
            left();
        } else {
            right();
        }
    }

    private void left(){
        System.out.println("left...");
    }

    private void right(){
        System.out.println("right...");
    }

    public void stop(){
        this.running = false;
    }
}

class VerticalThread implements Runnable {
    private boolean running = true;

    public void run(){
        while(running){
            random();
            try {
                Thread.sleep((long) Math.random()*2000+1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void random(){
        if (Math.random() < 0.5) {
            forward();
        } else {
            backward();
        }
    }

    private void forward(){
        System.out.println("forward...");
    }

    private void backward(){
        System.out.println("backward...");
    }

    public void stop(){
        this.running = false;
    }
}