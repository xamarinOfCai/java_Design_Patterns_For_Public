package Caijingjin.Chapter21;

import java.util.ArrayList;

public class Root implements IRoot {
    //
    private ArrayList subordinateList = new ArrayList();

    //
    private String name ="";
    //
    private int salary = 0;

    //
    private String position = "";

    public Root(String name, String position,int salary) {
        this.subordinateList = subordinateList;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info ="name: "+this.name;
        info = info +"\t position: "+this.position;
        info = info +"\t salary: "+this.salary;
        return info;
    }

    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    public void add(ILeaf leaf){
        this.subordinateList.add(leaf);
    }

    @Override
    public ArrayList getSubbordinateInfo() {
        return this.subordinateList;
    }
}
