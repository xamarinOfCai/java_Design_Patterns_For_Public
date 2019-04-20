package Caijingjin.Chapter22.ObserverPattern;

import Caijingjin.Chapter22.ObserverPattern.Observer;

public interface Observable {

    public void addObsever(Observer obsever);

    public void deleteObserver(Observer observer);

    public void notifyObserver(String context);
}
