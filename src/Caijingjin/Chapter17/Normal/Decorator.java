package Caijingjin.Chapter17.Normal;

public abstract class Decorator extends Component {

    private  Component component = null;

    public Decorator(Component _component) {
        this.component = _component;
    }

    //委托被装饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }

}
