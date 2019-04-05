package Caijingjin.Chapter28.CommonUML;

//Flyweight——抽象享元角色
public abstract class Flyweight {

    //内部状态
    private String intrinsic;

    //外部共享状态
    private final String Extrinsic;

    //要求襄垣角色必须接受外部的状态
    public Flyweight(String _Extrinsic){
        this.Extrinsic = _Extrinsic;
    }


    public abstract  void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
