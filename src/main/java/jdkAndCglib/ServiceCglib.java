package jdkAndCglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: liqingxin
 * @Description: ${description}
 * @Date: 2019/7/1 19:43
 * @Version: 1.0
 */
public class ServiceCglib implements MethodInterceptor {

    private Object target;
    public Object getInstantce(Object target){
        this.target = target;//给业务对象赋值
        Enhancer enhancer = new Enhancer();//创建加强器，用来创建动态代理类
        enhancer.setSuperclass(this.target.getClass());//为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        //设置回调:对于代理类上所有方法的调用，都会调用CallBack,而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        //创建动态代理对象并返回
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("预处理---------");
        return methodProxy.invokeSuper(o,objects);
    }
}
