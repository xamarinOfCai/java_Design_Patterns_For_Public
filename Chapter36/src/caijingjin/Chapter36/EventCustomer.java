package caijingjin.Chapter36;

import java.util.Vector;

/**
 * @ClassName EventCustomer
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 17:00
 * @Version 1.0
 */
public abstract class EventCustomer {

    private Vector<EventCustomType>customTypes = new Vector<EventCustomType>();

    public EventCustomer(EventCustomType _type) {
        this.addCustomType(_type);
    }

    protected  void addCustomType(EventCustomType type){
        customTypes.add(type);
    }

    public Vector<EventCustomType> getCustomType() {
        return customTypes;
    }

    public abstract void exec(ProductEvent e);
}
