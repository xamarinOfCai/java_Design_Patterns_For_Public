package Caijingjin.Chapter17.Normal;

import java.sql.SQLOutput;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component _component) {
        super(_component);
    }

    private void method2(){
        System.out.println("method2 装饰");
    }

    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
