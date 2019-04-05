package Caijingjin.Chapter22;

public class Spy extends Thread {

    private HanFeiZi hanFeiZi;

    private LiSi liSi;

    private String type;

    public Spy(HanFeiZi _hanFeiZi,LiSi _lisi,String _type){
        this.hanFeiZi = _hanFeiZi;
        this.liSi = _lisi;
        this.type = _type;
    }

    @Override
    public void run() {
//        super.run();

        while(true){
            if(this.type.equals("breakfast")){
                this.liSi.update("韩非子在吃饭！");
                this.hanFeiZi.setHavingBreakfast(false);
            }else{//
                if(this.hanFeiZi.isHavingFun()){
                    this.liSi.update("韩非子在活动，娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }
}
