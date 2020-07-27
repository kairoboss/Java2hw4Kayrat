package com.company;

public class Runner extends Thread {
    private Runner nextRunner;
    private String nextRunnerName;
    public Runner(String name,String nextRunnerName ,Runner nextRunner){
        super(name);
        this.nextRunner = nextRunner;
        this.nextRunnerName = nextRunnerName;
    }
    public String getNextRunnerName(){
        return nextRunnerName;
    }
    public synchronized void run(){
        System.out.println(this.getName()+" "+"берет палочку");
        System.out.println(getName()+" "+"бежит к"+ " "+ this.getNextRunnerName());
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(nextRunnerName == "Runner 5"){
            System.out.println("Runner 5 бежит к финишу");
        }else {
        nextRunner.start();}

    }
}
