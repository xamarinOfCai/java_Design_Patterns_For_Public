package Caijingjin.Chapter22.ObserverPattern;

public class Wangsi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("网司：观察到韩非子有活动："+"context = [" + context + "]");
    }

    private void cry(){
        System.out.println("网司：因为有活动，就cry");
    }
}
