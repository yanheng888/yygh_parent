package com.atguigu.yygh.hosp;

import com.atguigu.yygh.hosp.repository.HospitalRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan("com.atguigu")
public class test1 {
    @Autowired
    private HospitalRepository hospitalRepository;

    @Test
    public void test(){
        System.out.println("sda");
    }
}
