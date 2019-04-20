package Caijingjin.Chapter22.ObserverPattern;

import Caijingjin.Chapter22.IHanFeiZi;
import Caijingjin.Chapter22.ObserverPattern.Observable;
import Caijingjin.Chapter22.ObserverPattern.Observer;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi, Observable {

    private boolean isHavingBreakfast = false;

    private boolean isHavingFun = false;


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
//        this.isHavingBreakfast = true;
//        this.lisi.update("韩非子在吃饭");
        this.notifyObserver("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子： 开始万帅了");
        this.isHavingFun = true;
        this.notifyObserver("韩非子在娱乐！哈哈哈");
    }

    //用来存放观察者们
    private ArrayList<Observer>observerArrayList = new ArrayList<Observer>();


    @Override
    public void addObsever(Observer obsever) {
        observerArrayList.add(obsever);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for(Observer observer : observerArrayList){
            observer.update(context);
        }
    }
}
