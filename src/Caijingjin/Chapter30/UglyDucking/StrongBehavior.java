package Caijingjin.Chapter30.UglyDucking;

public class StrongBehavior extends  Decorator {
    public StrongBehavior(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("会飞行了");
    }

//    @Override
//    public void desAppearance() {
//        System.out.println("外表开始变漂亮");
//    }
}
