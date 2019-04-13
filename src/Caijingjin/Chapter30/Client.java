package Caijingjin.Chapter30;

public class Client {

    public static void main(String[] args) {
//        IRunner runner = new Runner();
//        IRunner agent = new RunnerAgent(runner);
//        System.out.println("客户要求运动元来跑步");
//        agent.run();

        IRunner liu = new Runner();
        liu = new RunnerWithJet(liu);
        System.out.println("=======增强后的运动员的功能======" );
        liu.run();
    }
}
