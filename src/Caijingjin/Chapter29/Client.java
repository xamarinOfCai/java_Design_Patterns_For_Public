package Caijingjin.Chapter29;

public class Client {

    public static void main(String[] args) {
        System.out.println("-----房地站公司是这样赚钱的------------" );
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);

        houseCorp.makeMoney();
        System.out.println("------------服装公司是这样转钱的啦-----------" );
        ShanZhaiCorp shanZhaiCorp =new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();

        //ClothesCorp clothesCorp = new ClothesCorp();
//        clothesCorp.makeMoney();
    }
}
