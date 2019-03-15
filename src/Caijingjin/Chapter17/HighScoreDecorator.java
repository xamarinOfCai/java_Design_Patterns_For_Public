package Caijingjin.Chapter17;

public class HighScoreDecorator extends  Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //装饰要汇报的成绩
    private void reportHighScore(){
        System.out.println("本次考试语文的最高分：75分，数学是：78分 自然的最高分：80");
    }

    //要在家长看到成绩单之前告诉他最高成绩，否则就得挨揍


    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
