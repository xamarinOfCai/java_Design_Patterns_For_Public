package Caijingjin.Chapter16;

//public class Father implements IHandler {
//    @Override
//    public void HandleMessage(IWomen women) {
//        System.out.println("女儿的请求是： " + women.getRequest() + " .");
//        System.out.println("answer: yes");
//    }
//}

    public class Father extends Handler{

        public Father(){
            super(Handler.FATHER_LEVEL_REQUEST);
        }

        @Override
        protected void reponse(IWomen women) {
            System.out.println("女儿的请求是： " + women.getRequest() + " .");
            System.out.println("answer: yes");
        }
    }
