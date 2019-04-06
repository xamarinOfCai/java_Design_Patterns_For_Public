package Caijingjin.Chapter29;

public class House extends Product {
    @Override
    public void beProduced() {
        System.out.println("生产出来的房子是这样的------");
    }

    @Override
    public void beSelled() {
        System.out.println("生产的房子卖出去了----------啦啦");
    }
}
