package caijingjin.Chapter36;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * 事件观察者
 * @ClassName EventDispatch
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 16:17
 * @Version 1.0
 */
public class EventDispatch implements Observer {
    private EventDispatch(){

    }



    //单例模式
    private static class Holder{
        private static EventDispatch dispatch = new EventDispatch();
    }


    /**
     * 获得单例的对象
     * @return
     */
    public static EventDispatch getEventDispatch(){
        return Holder.dispatch;
    }
    //事件消费者
    private Vector<EventCustomer>customer = new Vector<EventCustomer>();

    public void registerCustomer(EventCustomer begger) {
        customer.add(begger);
    }

    @Override
    public void update(Observable o, Object arg) {
        //事件的源头
        Product product = (Product)arg;
        //事件
        ProductEvent event = (ProductEvent)o;
        //处理这里的方式，这里是中介者模式，
        for(EventCustomer e : customer){
            for(EventCustomType t : e.getCustomType()){
                if(t.getValue() == event.getEventType().getValue()){
                    e.exec(event);
                }
            }
        }
    }
}
