package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Git205ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("我是一只只");

        int a = 10;
        int b = 20;
        System.out.println(a+b);
        
        int ccc = 456;

        int dev = 12;

        for (int i = 0; i < 15; i++) {
            System.out.println(i);
        }
    }

}
