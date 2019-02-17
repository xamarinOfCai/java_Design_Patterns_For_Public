package Caijingjin.Chapter8;

public class Test {

    public static void main(String[] args) {



        AbstractHumanFactory YinYangLu = new HumanFactory();

        //first create human
        System.out.println("-----造出来第一批白色人种----");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //second create human
        System.out.println("\n----造出第二批黑色人中------");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("\n----造出第三批黄色人中------");

        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
