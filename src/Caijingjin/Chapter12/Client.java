package Caijingjin.Chapter12;

public class Client {

    public static void main(String[] args) {
        //定义一个用户
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);

        //记录游戏开始时间
        System.out.println("游戏开始时间：2019年03月03日");
        //开始带游戏
//        player.login("zhangsan","password");
        proxy.login("zhangsan","password");
        //开始杀怪
//        player.killBoss();
        proxy.killBoss();
        //升级
//        player.upgrade();
        proxy.upgrade();
        //记录游戏结束时间
        System.out.println("游戏结束时间是：2019年03月03日 10:21");
    }
}
