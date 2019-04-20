package Caijingjin.Chapter22;

public interface Observable {

    public void addObsever(Observer obsever);

    public void deleteObserver(Observer observer);

    public void notifyObserver(String context);
}
