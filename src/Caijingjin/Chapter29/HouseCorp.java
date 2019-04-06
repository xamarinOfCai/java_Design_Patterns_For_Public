package Caijingjin.Chapter29;

public class HouseCorp extends Corp {
    public HouseCorp(House house) {
        super(house);
    }

//    public HouseCorp(Product product) {
//        super(product);
//    }
//    @Override
//    protected void produce() {
//        System.out.println("房地产公司盖房子");
//    }
//
//    @Override
//    protected void sell() {
//        System.out.println("房地产公司出售房子");
//    }
//
//    public void makeMoney(){
//        super.makeMoney();
//        System.out.println("房地产公司赚大钱！");
//    }

    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司转了大钱了");
    }
}
