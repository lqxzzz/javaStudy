package jdkAndCglib;

/**
 * @Author: liqingxin
 * @Description: ${description}
 * @Date: 2019/7/1 18:00
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService{


    @Override
    public void addUser() {
        System.out.println("增加一个用户。。。");
    }

    @Override
    public void editUser() {
        System.out.println("编辑一个用户。。。");
    }
}
