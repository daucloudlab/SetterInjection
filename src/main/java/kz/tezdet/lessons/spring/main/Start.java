package kz.tezdet.lessons.spring.main;


import kz.tezdet.lessons.spring.impl.robot.ModelT1000;
import kz.tezdet.lessons.spring.interfaces.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml") ;

        Robot robot1 = (ModelT1000)context.getBean("t1000") ;
        robot1.action();
        robot1.dance();
    }
}
