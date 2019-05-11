package caijingjin.Chapter36;

/**
 * @ClassName NobleMan
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 17:21
 * @Version 1.0
 */
public class NobleMan extends EventCustomer {
    public NobleMan() {
        super(EventCustomType.EDIT);
        super.addCustomType(EventCustomType.CLONE);
    }

    @Override
    public void exec(ProductEvent e) {
        Product product = e.getSource();

        ProductEventType type = e.getEventType();
        if(type.getValue() == EventCustomType.CLONE.getValue()){
            System.out.println("贵族的处理事件" + product.getName() + "克隆，事件类型是"+type);
        }else{
            System.out.println("贵族的处理事件"+product.getName()+"修改，事件类型是："+type);
        }
    }
}
