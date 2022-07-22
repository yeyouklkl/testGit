package com.atguigu.maven;

import org.junit.Test;

/**
 * @author yeyouklkl
 * @create 2022-07-21-14:37
 */
public class HelloTest {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }

}
