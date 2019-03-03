package Caijingjin.Chapter12.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        IGamePlayer player = new GamePlayer("zhangsan");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);

        System.out.println("开始时间是：2019-03-03 17:16");
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);

        proxy.login("zhangsan","password");
        //杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        System.out.println("动态代理结束时间是：2019年03月03 17:13");
    }
}
