package Caijingjin.Chapter22.ObserverPattern;

public class LiuSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("刘邦：观察到韩非子有活动" + "high a!");
    }
}
