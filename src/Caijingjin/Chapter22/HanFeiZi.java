package Caijingjin.Chapter22;

public class HanFeiZi implements IHanFeiZi {

    private boolean isHavingBreakfast = false;

    private boolean isHavingFun = false;

    private ILiSi lisi = new LiSi();

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }

    @Override
    public void haveBreakfast() {
        System.out.println("Han Fei Zi：吃饭！");
        this.isHavingBreakfast = true;
        this.lisi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子： 开始万帅了");
        this.isHavingFun = true;
        this.lisi.update("韩非子在娱乐！哈哈哈");
    }
}
