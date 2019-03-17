package Caijingjin.Chapter16;

public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;

    public final static int HUSBAND_LEVEL_REQUEST = 2;

    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    ///处理请求
    public final void HandleMessage(IWomen women){
        if(women.getType() == this.level){
            this.reponse(women);
        }else{
            if(this.nextHandler != null){
                this.nextHandler.HandleMessage(women);
            }else{
                System.out.println("没有地方请示了，自己处理吧");
            }
        }
    }


    ///设置下一个请求
    public void setNextHandler(Handler _nextHandler){
        this.nextHandler = _nextHandler;
    }

    //处理方式
    protected abstract void reponse(IWomen women);
}
