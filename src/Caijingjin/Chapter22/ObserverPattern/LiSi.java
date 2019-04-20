package Caijingjin.Chapter22.ObserverPattern;

import Caijingjin.Chapter22.ObserverPattern.Observer;

public class LiSi implements  Observer {
    @Override
    public void update(String context) {
        System.out.println("李四： 观察到韩非子在活动，报告老板：。。。。。");
        this.reportToQinShiHuang(context);
        System.out.println("李四：报告完毕。。。。\n");


    }

    private void reportToQinShiHuang(String context) {

        System.out.println("李四：报告秦老板，韩非子有活动：" + context  );
    }
}
