package Caijingjin.Chapter29;

public class IPod extends Product {
    @Override
    public void beProduced() {
        System.out.println("生产出来的IPod是这样的啊-----");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的IPod卖出去了--------");
    }
}
