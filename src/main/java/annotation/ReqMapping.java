package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: liqingxin
 * @Description: ${description}
 * @Date: 2019/6/28 10:43
 * @Version: 1.0
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReqMapping {
    ReqMethod[] method()  default {};
    String[] val() default "";
}
