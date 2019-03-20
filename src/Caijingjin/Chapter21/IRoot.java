package Caijingjin.Chapter21;

import java.util.ArrayList;

public interface IRoot {

    //
    public String getInfo();

    //
    public void add(IBranch banch);

    public void  add(ILeaf leaf);

    //
    public ArrayList getSubbordinateInfo();
}
