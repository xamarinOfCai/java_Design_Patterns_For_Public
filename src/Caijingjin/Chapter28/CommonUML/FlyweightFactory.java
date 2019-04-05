package Caijingjin.Chapter28.CommonUML;

import java.awt.geom.FlatteningPathIterator;
import java.util.HashMap;

public class FlyweightFactory {

    private static HashMap<String,Flyweight>pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic){

        Flyweight flyweight = null;

        if(pool.containsKey(extrinsic)){
            flyweight = pool.get(extrinsic);

        }else{
            flyweight = new ConcreteFlyweight1(extrinsic);
            pool.put(extrinsic,flyweight);
        }
        return flyweight;
    }
}
