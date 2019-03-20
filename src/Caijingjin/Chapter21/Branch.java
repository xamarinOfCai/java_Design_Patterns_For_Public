package Caijingjin.Chapter21;

import java.util.ArrayList;

public class Branch implements IBranch {

    //
    private ArrayList subordinateList = new ArrayList();

    //
    private String name ="";

    //
    private String position = "";

    //
    private int salary = 0;


    public Branch(String name, String position, int salary) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String getInfo() {
        String info = "";
        info ="name: "+this.name;
        info = info +"\t position: "+this.position;
        info = info +"\t salary: "+this.salary;
        return info;
    }

//    @Override
//    public void add(IBranch branch) {
//        this.subordinateList.add(branch);
//    }

    public void add(ILeaf leaf){
        this.subordinateList.add(leaf);
    }

    @Override
    public ArrayList<ICorp> getSubordinateInfo() {
        return this.subordinateList;
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }
}
