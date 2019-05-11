package caijingjin.Chapter36;

/**
 * @ClassName Product
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 15:53
 * @Version 1.0
 */
public class Product implements Cloneable {
    //产品名称
    private String name;
    //是否可以改变产品的属性
    private boolean canChanged = false;

    public Product(ProductManager productManager,String name) {
        if(productManager.isCreateProduct()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Product clone() {
        Product pr = null;
        try {
            pr = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pr;
    }
}
