package Caijingjin.Chapter21;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));

    }
    public static Branch compositeCorpTree(){

        Branch ceo = new Branch("网大码子","totalManager",100000);

        IBranch developDep = new Branch("liu da que zi","developer manager",10000);
        IBranch financeDep = new Branch("zhao san tuo zi","finiance ",30000);
        IBranch saleDep = new Branch("ma er guai zi","sale manager",20000);

        IBranch firstDevGroup = new Branch("yang san ye xie","first Dev leader",5000);
        IBranch secondDevGroup = new Branch("wu da bang zi","second Dev leader",6000);

        ILeaf a = new Leaf("a" ,"developer",2000);
        ILeaf b = new Leaf("b" ,"developer",2000);
        ILeaf c = new Leaf("c" ,"developer",2000);
        ILeaf d = new Leaf("d" ,"developer",2000);
        ILeaf e = new Leaf("e" ,"developer",2000);
        ILeaf f = new Leaf("f" ,"developer",2000);
        ILeaf g = new Leaf("g" ,"developer",2000);
        ILeaf h = new Leaf("h" ,"saleman",5000);
        ILeaf i = new Leaf("i" ,"saleman",4000);
        ILeaf j = new Leaf("j" ,"financeMan",5000);
        ILeaf k = new Leaf("k" ,"CEO secre",8000);
        ILeaf l = new Leaf("zheng loa liu" ,"developer leader",20000);
        ILeaf m = new Leaf("m" ,"developer",2000);
        ceo.addSubordinate(developDep);
        ceo.addSubordinate(financeDep);
        ceo.addSubordinate(saleDep);

        ceo.addSubordinate(k);

        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        developDep.addSubordinate(l);

        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);

        saleDep.addSubordinate(h);
        saleDep.addSubordinate(i);
        //fin
        financeDep.addSubordinate(j);

//        System.out.println(ceo.getInfo());

//        getAllSubordinateInfo(ceo.getSubbordinateInfo());
        return ceo;


    }

    private static void getAllSubordinateInfo(ArrayList subbordinateInfo) {
        int length = subbordinateInfo.size();
        for(int i =0; i < length; i++){
            Object s = subbordinateInfo.get(i);
            if(s instanceof Leaf){
                ILeaf emplyee = (ILeaf)s;
                System.out.println(((Leaf) s).getInfo());
            }else{
                IBranch branch =(IBranch)s;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }

    private static String getTreeInfo(Branch root){
        ArrayList<ICorp>subOrdinateList = root.getSubordinateInfo();
        String info = "";
        for(ICorp s : subOrdinateList){
            if(s instanceof Leaf){
                info = info +s.getInfo()+"\n";
            }else{
                info = info + s.getInfo() +"\n"+getTreeInfo((Branch) s);
            }
        }
        return info;
    }
}
