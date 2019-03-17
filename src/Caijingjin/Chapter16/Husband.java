package Caijingjin.Chapter16;

public class Husband extends Handler {



//    @Override
//    public void HandleMessage(IWomen women) {
//        System.out.println("妻子的请求"+women.getRequest());
//        System.out.println("husband answer: yes");
//    }

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void reponse(IWomen women) {
        System.out.println("妻子的请求"+women.getRequest());
        System.out.println("husband answer: yes");
    }
}
