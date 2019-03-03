package Caijingjin.Chapter12.OrdinaryAgent;

public interface IGamePlayer {

    //登录
    public void login(String user, String password);

    //杀怪
    public void killBoss();

    //升级
    public void upgrade();
}
