package caijingjin.Chapter36;

/**
 * @ClassName Client
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 17:25
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //获得事件分发中心
        EventDispatch dispatch = EventDispatch.getEventDispatch();
        //接收乞丐对事件的处理
        dispatch.registerCustomer(new Begger());
        //接收平民对事件的处理
        dispatch.registerCustomer(new Commoner());
        //接收贵族对事件的处理
        dispatch.registerCustomer(new NobleMan());
        //建立一个原子弹的生产工厂
        ProductManager productManager = new ProductManager();
        //制造一个茶品
        System.out.println("=======模拟产品的创建过程======" );
        System.out.println( "创建一个小男孩原子弹");
        Product product = productManager.createProduct("小男孩原子弹");
        //修改一个产品
        System.out.println("=======模拟产品的修改过程======" );
        System.out.println("修改小男孩的名字为胖子号" );
        productManager.editProduct(product,"胖子号原子弹");
        //再克隆一个产品
        System.out.println("=======模拟产品的克隆过程======" );
        System.out.println("克隆胖子号原子弹" );
        productManager.clone(product);
        //遗弃一个产品
        System.out.println("=======模拟遗弃胖子号原子弹======" );
        System.out.println("遗弃胖子号原子弹" );
        productManager.abandonProduct(product);

    }
}
