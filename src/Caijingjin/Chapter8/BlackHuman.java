package Caijingjin.Chapter8;

public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人中皮肤都是黑色的 ！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，但一般人听不懂！");
    }
}
