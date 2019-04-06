package Caijingjin.Chapter29;

public  abstract class Corp {

    //produce
    protected abstract void produce();

    //sell
    protected abstract void sell();


    /**
      *
      *make money
      *
      * @param
      * @param
      * @param
     */
    public void makeMoney(){
        this.produce();
        this.sell();
    }
}
