package Caijingjin.Chapter17;

public class Father {

    public static void main(String[] args) {
        //学校成绩单
        SchoolReport sr;
        //原装的成绩单
        sr = new FourthGradeSchoolReport();
        //装饰了最高分的说明
        sr = new HighScoreDecorator(sr);
        //装饰了排名的说明
        sr = new SortDecorator(sr);
        //看成绩单
        sr.report();
        //签名
        sr.sign("father");
    }
}
