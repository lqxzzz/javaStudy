package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: liqingxin
 * @Description: ${description}
 * @Date: 2019/6/28 11:40
 * @Version: 1.0
 */
public class TestAnnotation {
    public static void main(String[] args) {
        Class<User> clazz = User.class;
        Method[] methods = clazz.getDeclaredMethods();
        Field[] declaredFields = clazz.getDeclaredFields();


        for(Method method : methods){

        }


    }
}
