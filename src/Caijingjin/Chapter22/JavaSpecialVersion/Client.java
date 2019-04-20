package Caijingjin.Chapter22.JavaSpecialVersion;

import Caijingjin.Chapter22.ObserverPattern.*;

public class Client {

    public static void main(String[] args) {
        java.util.Observer lisi = new LiSi();
        java.util.Observer liuSi = new LiuSi();
        java.util.Observer wangsi = new Wangsi();

        HanFeiZi hanFeiZi =new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(liuSi);
        hanFeiZi.addObserver(wangsi);
        //Have  breakfast
        hanFeiZi.haveBreakfast();
    }
}
