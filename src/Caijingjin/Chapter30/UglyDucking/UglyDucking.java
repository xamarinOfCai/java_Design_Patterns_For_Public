package Caijingjin.Chapter30.UglyDucking;

public class UglyDucking implements Swan {
    @Override
    public void fly() {
        System.out.println("丑小鸭暂时不能飞行");
    }

    @Override
    public void cry() {
        System.out.println("叫声是刻录刻苦刻录");
    }

    @Override
    public void desAppearance() {
        System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
    }
}
