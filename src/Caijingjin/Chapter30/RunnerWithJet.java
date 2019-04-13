package Caijingjin.Chapter30;

public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println("加快运动员的速度：为运动员假装喷漆装置");
        this.runner.run();
    }
}
