package Caijingjin.Chapter32.StrategyVSOrders;

public class Client {


    public static void main(String[] args) {
        //定义角色环境
        Algorithm algorithm = new Gzip();
        //对文件执行解压缩
        System.out.println("=========执行算法=========" );
        Context context = new Context(algorithm);

        context.compress("c:\\windows","d\\windows.gzip");
        context.uncompress("c:\\windows","d\\windows.gzip");

        //替换算法
        context = new Context(new Zip());


        context.compress("c:\\windows","d\\windows.zip");
        context.uncompress("c:\\windows","d\\windows.zip");

    }
}
