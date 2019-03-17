package Caijingjin.Chapter16;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        //random women

        Random random = new Random();
        ArrayList<IWomen>women = new ArrayList<>();
        for(int i= 0; i < 5; i++){
            women.add(new Women(random.nextInt(4),"我要出去溜达，逛街！"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);

        //修改下测试
        for(IWomen woman : women){
            father.HandleMessage(woman);
        }
    }
}
