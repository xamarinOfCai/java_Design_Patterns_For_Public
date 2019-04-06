package Caijingjin.Chapter29;

public class Client {

    public static void main(String[] args) {
        System.out.println("-----房地站公司是这样赚钱的------------" );

        HouseCorp houseCorp = new HouseCorp();

        houseCorp.makeMoney();
        System.out.println("------------服装公司是这样转钱的啦-----------" );
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
