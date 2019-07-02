package jdkAndCglib;

/**
 * @Author: liqingxin
 * @Description: ${description}
 * @Date: 2019/7/1 18:55
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
//        ServiceInvocationHandler serviceInvocationHandler = new ServiceInvocationHandler(userService);
//        UserService userServiceProxy = (UserService) serviceInvocationHandler.CreatProxyedObj();
//        userServiceProxy.addUser();
        ServiceCglib proxy = new ServiceCglib();
        userService = (UserService) proxy.getInstantce(userService);
        userService.addUser();
    }
}
