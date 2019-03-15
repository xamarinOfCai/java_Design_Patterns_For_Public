package Caijingjin.Chapter17;

public abstract  class SchoolReport {
    //成绩单主要展示的就是你的成绩
    public abstract void report();

    //成绩单需要家长签字
    public abstract void sign(String name);
}
