package Caijingjin.Chapter28;

import java.sql.SQLOutput;
import java.util.HashMap;

public class SignInfoFactory {

    //池容器
    private static HashMap<String ,SignInfo>pool = new HashMap<>();


    /**
      *
      *获取对象（这个对象过时）
      *
      * @param
      * @param
      * @param
     */
    @Deprecated
    public static SignInfo getSignInfo(){


        return new SignInfo();

    }

    /**
      *
      * 从吃中获取对象
      *
      * @param
      * @param
      * @param
     */
    public static SignInfo getSignInfo(String key){
        SignInfo result = null;

        if(!pool.containsKey(key)){
            System.out.println( key + "-----建立对象放入到吃中");
            result = new SignInfoForPool(key);
            pool.put(key,result);

        }else{
            result = pool.get(key);
            System.out.println(  key + "----直接从池中直接取出来");
        }
        return result;
    }
}
