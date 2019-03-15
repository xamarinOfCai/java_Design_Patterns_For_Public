package Caijingjin.Chapter17.Normal;

public class ConcrateDecorator1 extends Decorator {

    public ConcrateDecorator1(Component _component) {
        super(_component);
    }

    private void method1(){
        System.out.println("method1 装饰");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }


}
