package Caijingjin.Chapter22.JavaSpecialVersion;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {


    private void reportToQinShiHuang(String context) {

        System.out.println("李四：报告秦老板，韩非子有活动：" + context  );
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("李四： 观察到韩非子在活动，报告老板：。。。。。");
        this.reportToQinShiHuang(o.toString());
        System.out.println("李四汇报完毕！" );
    }
}
