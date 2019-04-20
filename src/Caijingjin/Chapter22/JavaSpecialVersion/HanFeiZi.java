package Caijingjin.Chapter22.JavaSpecialVersion;

import Caijingjin.Chapter22.IHanFeiZi;
import Caijingjin.Chapter22.ObserverPattern.Observer;

import java.util.ArrayList;
import java.util.Observable;

public class HanFeiZi extends Observable implements IHanFeiZi {

    private boolean isHavingBreakfast = false;

    private boolean isHavingFun = false;


    @Override
    public void haveBreakfast() {
        System.out.println("Han Fei Zi：吃饭！");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子： 开始万帅了");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐！哈哈哈");
    }



}
