package Caijingjin.Chapter17.Normal;

public class Client {

    public static void main(String[] args) {
        //需要装饰的组件
        Component component =  new ConcreteComponent();
        //第一次装饰
        component = new ConcrateDecorator1(component);
        //第二次装饰
        component = new ConcreteDecorator2(component);
        //所有的装饰完之后运行
        component.operate();
    }
}
