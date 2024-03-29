package Caijingjin.Chapter21;

public class Leaf implements ILeaf {


    //名称
    private String name ="";

    //置为
    private String position = "";

    //薪水
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
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
}
