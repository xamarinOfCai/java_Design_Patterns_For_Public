package Caijingjin.Chapter30;

import java.util.Random;

/**
  *代理类
  *
  *
  * @param
  * @param
  * @param
 */

public class RunnerAgent implements IRunner{

    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random random = new Random();
        if(random.nextBoolean()){
            System.out.println("代理人同意安排运动员跑步");
        }else{
            System.out.println("代理人心情不好，不安排运动员跑步");
        }

    }
}
