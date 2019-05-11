package caijingjin.Chapter36;

/**
 * @ClassName Begger
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 17:16
 * @Version 1.0
 */
public class Begger extends EventCustomer {


    public Begger() {
        super(EventCustomType.DEL);
    }

    @Override
    public void exec(ProductEvent e) {
        Product p = e.getSource();

        ProductEventType productEventType = e.getEventType();
        System.out.println("乞丐的处理的事件是：" + p.getName() + "销毁，事件类型是="+productEventType);
    }
}
