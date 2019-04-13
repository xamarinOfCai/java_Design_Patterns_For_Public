package Caijingjin.Chapter32.StrategyVSOrders;

public class Context {

    Algorithm algorithm;

    public Context(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public boolean compress(String source,String to){
        return algorithm.compress(source,to);
    }

    public boolean uncompress(String source,String to){
        return algorithm.unCompress(source,to);
    }
}
