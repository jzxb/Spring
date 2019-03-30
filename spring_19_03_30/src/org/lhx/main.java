package org.lhx;

import org.lhx.vo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lhx
 * @date 2019/3/30 - 10:36
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = context.getBean("stu", Student.class);
        //student.setName("李泓宣");
        System.out.println(student);
    }
}
