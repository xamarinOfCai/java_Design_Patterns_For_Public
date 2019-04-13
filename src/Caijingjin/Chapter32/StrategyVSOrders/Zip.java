package Caijingjin.Chapter32.StrategyVSOrders;

public class Zip implements Algorithm {
    @Override
    public boolean compress(String source, String to) {
        System.out.println("source = [" + source + "------>" + to + "Zip压缩成功！");
        return true;
    }

    @Override
    public boolean unCompress(String source, String to) {
        System.out.println("source = [" + source + "------>" + to + "Zip解压成功");
        return true;
    }
}
