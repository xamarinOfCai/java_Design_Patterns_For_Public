package Caijingjin.Chapter22;

public class Client {

    public static void main(String[] args) {
        LiSi lisi = new LiSi();

        HanFeiZi hanFeiZi = new HanFeiZi();

//        Spy watchBreakFast = new Spy(hanFeiZi,lisi,"breakfast");
//        watchBreakFast.start();
//
//        Spy watchFun = new Spy(hanFeiZi,lisi,"fun");
//        watchFun.start();
//        try {
//            Thread.sleep(1000);
//            hanFeiZi.haveBreakfast();
//            Thread.sleep(1000);
//            hanFeiZi.haveFun();
//        }catch(Exception e){
//            e.printStackTrace();
//
//        }
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
