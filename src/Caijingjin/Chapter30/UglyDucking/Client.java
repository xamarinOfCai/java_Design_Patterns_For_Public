package Caijingjin.Chapter30.UglyDucking;

public class Client {

    public static void main(String [] args) {
        System.out.println("======很久很久以前  这里有一只丑小鸭");
        Swan ducking = new UglyDucking();
        ducking.desAppearance();
        ducking.fly();
        ducking.cry();

        System.out.println("\n=====丑小鸭终于发现自己是一个天鹅==========");
        ducking = new BeautifyAppearance(ducking);
        ducking = new StrongBehavior(ducking);
        ducking.desAppearance();
        ducking.cry();
        ducking.fly();
    }
}
