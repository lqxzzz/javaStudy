package annotation;

/**
 * @Author: liqingxin
 * @Description: ${description}
 * @Date: 2019/6/28 11:27
 * @Version: 1.0
 */
@ReqMapping(method = ReqMethod.POST,val = "类")
public class User {
    @ReqValue(value1="张三")
    private String userName;
    @ReqValue(value2="密码")
    private String pswd;
}
