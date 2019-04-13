package Caijingjin.Chapter32.StrategyVSOrders;

public interface Algorithm {

    //压缩算法
    public boolean compress(String source,String to);
    //解压算法
    public boolean unCompress(String source,String to);
}
