package Caijingjin.Chapter12.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
    //被代理着
    Class cls = null;
    //被代理的实例
    Object object = null;

    GamePlayIH(Object _obj){
        this.object = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.object,args);
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在我的账号登录！");
        }
        return result;

    }
}
