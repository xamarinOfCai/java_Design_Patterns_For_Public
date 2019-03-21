package Caijingjin.Chapter21;

import java.util.ArrayList;

public interface IBranch extends ICorp{

//    //
//    public String getInfo();
//
//    //
//    public void add(IBranch branch);
//
//    public void  add(ILeaf leaf);

    //获取子件的信息
    public ArrayList getSubordinateInfo();

    //添加子件
    public void addSubordinate(ICorp corp);


}
