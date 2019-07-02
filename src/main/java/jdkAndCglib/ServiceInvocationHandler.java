package jdkAndCglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: liqingxin
 * @Description: 业务接口实现类
 * @Date: 2019/7/1 18:03
 * @Version: 1.0
 */
public class ServiceInvocationHandler implements InvocationHandler {

    /**
     * 目标对象
     */
    private Object target;

    public ServiceInvocationHandler(Object target){
      this.target = target;
    }
    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("代理类方法，进行增强...");
        System.out.println("事务开始");
        result = method.invoke(target,args);
        return result;
    }

    public Object CreatProxyedObj(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
