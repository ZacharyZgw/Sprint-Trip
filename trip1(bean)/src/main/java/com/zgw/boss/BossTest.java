package com.zgw.boss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zgw25 on 2016/12/6.
 */
public class BossTest {
    public static void main(String[] args){
        String[] xmlPath ={"spring-config.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        //Boss myboss = (Boss) context.getBean("boss")
        Boss myboss = (Boss) context.getBean("myboss");
        System.out.println(myboss.hashCode());
        Boss youBoss = (Boss) context.getBean("boss2");
        System.out.println(youBoss.hashCode());
    }
}
