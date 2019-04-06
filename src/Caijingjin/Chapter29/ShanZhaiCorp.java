package Caijingjin.Chapter29;

public class ShanZhaiCorp extends Corp{

    public ShanZhaiCorp(Product product) {
        super(product);
    }


    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱啦，等着pQQ来交钱");
    }
}
