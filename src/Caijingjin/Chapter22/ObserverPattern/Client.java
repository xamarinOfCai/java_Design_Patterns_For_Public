package Caijingjin.Chapter22.ObserverPattern;

public class Client {

    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer liuSi = new LiuSi();
        Observer wangsi = new Wangsi();

        HanFeiZi hanFeiZi =new HanFeiZi();
        hanFeiZi.addObsever(lisi);
        hanFeiZi.addObsever(wangsi);
        hanFeiZi.addObsever(liuSi);
        //Have  breakfast
        hanFeiZi.haveBreakfast();
    }
}
