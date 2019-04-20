package Caijingjin.Chapter22.JavaSpecialVersion;

import java.util.Observable;
import java.util.Observer;

public class Wangsi implements Observer {

    private void cry(){
        System.out.println("网司：因为有活动，就cry");
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("observable = [" + observable + "], o = [" + o + "往死开始介绍啦");
        System.out.println("内容是：" + o.toString() + "], o = [" + o + "]");
        System.out.println("网司：observable = [" + observable + "], o = [" + o + "game over!");
    }
}
