package Caijingjin.Chapter17;

public abstract class Decorator extends SchoolReport {
    //需要知道是哪个成绩单
    private SchoolReport sr;

    //构造函数
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
