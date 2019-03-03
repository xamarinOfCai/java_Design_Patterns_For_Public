package Caijingjin.Chapter12.OrdinaryAgent;

public class Client {

    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");

        //记录开始打游戏的时间
        System.out.println("开始打游戏的时间：2019-03-03" );

        //登录
        proxy.login("zhangsan","password");
        //杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录游戏结束时间
        System.out.println("打游戏的结束时间：2019-03-04 16:39" );
    }
}
