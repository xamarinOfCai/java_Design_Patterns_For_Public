package caijingjin.Chapter36;

/**
 * @ClassName Commoner
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 17:19
 * @Version 1.0
 */
public class Commoner extends EventCustomer {
    public Commoner() {
        super(EventCustomType.NEW);
    }

    @Override
    public void exec(ProductEvent e) {
        //事件源头
        Product product = e.getSource();

        //事件类型
        ProductEventType eventType = e.getEventType();
        System.out.println("平民的处理事件：" +product.getName()+  " 诞生记，事件类型是："+eventType);
    }
}
