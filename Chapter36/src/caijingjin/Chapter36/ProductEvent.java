package caijingjin.Chapter36;

import java.util.Observable;

/**
 * 被观察者
 * @ClassName ProductEvent
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 16:11
 * @Version 1.0
 */
public class ProductEvent extends Observable {

    private Product source;

    private ProductEventType type;

    public ProductEvent(Product source) {
        this(source,ProductEventType.NEW_PRODUCT);
    }

    public ProductEvent(Product source, ProductEventType type) {
        this.source = source;
        this.type = type;
        //事件触发
        this.notifyEventDispatch();
    }

    public Product getSource() {
        return source;
    }

    public ProductEventType getEventType() {
        return type;
    }


    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }
}
