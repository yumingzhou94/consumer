package com.yu.service;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yu.service.TestService;
/**
 * Created by ymz_pc on 2017/7/11.
 */
public class ConsumerServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "application.xml" });
        context.start();
        TestService testService = (TestService) context.getBean("testService");
        System.out.println(testService.getName());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
