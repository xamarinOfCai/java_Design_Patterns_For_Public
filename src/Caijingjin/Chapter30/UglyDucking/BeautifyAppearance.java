package Caijingjin.Chapter30.UglyDucking;

public class BeautifyAppearance extends  Decorator {
    public BeautifyAppearance(Swan swan) {
        super(swan);
    }

    @Override
    public void desAppearance() {
        System.out.println("外表是纯白色的，非常惹人喜欢");
    }

//    @Override
//    public void fly() {
//        System.out.println("外表累里面的飞行");
//    }
}
