package Caijingjin.Chapter17;

public class FourthGradeSchoolReport extends SchoolReport {
    //我的成绩单
    @Override
    public void report() {
        System.out.println("尊敬的qq家长:");
        System.out.println(".......babalalala");
        System.out.println("语文 62 数学 65 体育 98 自然 63");
        System.out.println("...........");
        System.out.println("                    家长签名：    ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名： "+name);
    }
}
