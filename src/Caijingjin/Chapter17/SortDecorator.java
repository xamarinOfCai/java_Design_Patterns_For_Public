package Caijingjin.Chapter17;

public class SortDecorator extends Decorator {


    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    //需要装饰的方法，展示排名
    private void reportSort(){
        System.out.println("我的排名是38名。。。。。。");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }


}
