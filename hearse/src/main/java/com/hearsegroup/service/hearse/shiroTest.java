package com.hearsegroup.service.hearse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;



public class shiroTest {

    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void addUser() {
        //添加用户
        simpleAccountRealm.addAccount("huxinbo", "123456");
    }

    @Test
    public void shiroTest() {

        //1.构建SecurityManager环境
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setRealm(simpleAccountRealm);

        //2.提交认证请求
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("huxinbo", "123456");
        subject.login(token);

        if (subject.isAuthenticated()) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

        subject.logout();

        if (subject.isAuthenticated()) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }


    }
}
