package caijingjin.Chapter36;

/**
 * 将产品和产品的事件联系起来了
 *
 * @ClassName ProductManager
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 16:00
 * @Version 1.0
 */
public class ProductManager {

    protected boolean isPermittedCreate = false;

    public Product createProduct(String name){
        //首先修改权限允许创建
        this.isPermittedCreate = true;
        Product p = new Product(this,name);
        //创建一个创建事件
        new ProductEvent(p,ProductEventType.NEW_PRODUCT);

        return p;
    }

    /**
     * 废弃一个产品
     * @param product
     */
    public void abandonProduct(Product product){
        //产品删除事件
        new ProductEvent(product,ProductEventType.DEL_PRODCUT);
        product = null;
    }

    /**
     * 修改产品的名称
     * @param p
     * @param name
     */
    public void editProduct(Product p ,String name){
        p.setName(name);
        new ProductEvent(p,ProductEventType.EDIT_PRODUCT);
    }

    /**
     *
     * @return
     */
    public boolean isCreateProduct() {
        return  this.isPermittedCreate;
    }

    /**
     * clone 产品
     * @param product
     * @return
     */
    public Product clone(Product product){
        //产品克隆事件
        new ProductEvent(product, ProductEventType.CLONE_PRODUCT);
        return product.clone();
    }
}
