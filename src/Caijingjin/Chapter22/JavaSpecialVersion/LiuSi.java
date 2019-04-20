package Caijingjin.Chapter22.JavaSpecialVersion;

import java.util.Observable;
import java.util.Observer;

public class LiuSi implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("劉幫開始介紹：" + "], o = [" + o + "]");
        System.out.println(o.toString() );
        System.out.println("劉幫開始介紹 ：observable = [" + observable + "], o = [" + o + "介绍完毕！");
    }
}
