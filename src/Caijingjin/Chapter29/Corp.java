package Caijingjin.Chapter29;

public  abstract class Corp {

//    //produce
//    protected abstract void produce();
//
//    //sell
//    protected abstract void sell();
//
//
//    /**
//      *
//      *make money
//      *
//      * @param
//      * @param
//      * @param
//     */
//    public void makeMoney(){
//        this.produce();
//        this.sell();
//    }
//

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney(){
        //没加公司生产出来的产品
        this.product.beProduced();
        //然后销售
        this.product.beSelled();
    }
}
