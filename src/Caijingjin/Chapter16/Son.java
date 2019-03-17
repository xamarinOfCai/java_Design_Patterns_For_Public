package Caijingjin.Chapter16;

public class Son extends Handler {


//    @Override
//    public void HandleMessage(IWomen women) {
//
//        System.out.println("母亲的请求是："+women.getRequest());
//        System.out.println("son answer:I agree!");
//
//    }

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void reponse(IWomen women) {
        System.out.println("母亲的请求是："+women.getRequest());
        System.out.println("son answer:I agree!");
    }


}
