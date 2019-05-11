package caijingjin.Chapter36;

/**
 * @ClassName EventCustomType
 * @Description TODO
 * @Author cjj
 * @Date 2019-05-11 17:02
 * @Version 1.0
 */
public enum  EventCustomType {

    NEW(1),

    DEL(2),

    EDIT(3),

    CLONE(4);
    private int value = 0;

    private EventCustomType (int _value){
        this.value = _value;
    }

    public int getValue(){
        return value;
    }

}
