package org.example;

import org.example.module.TavernProfileConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("quickstart-byname.xml");
//        Person person = (Person) beanFactory.getBean("person");
//        System.out.println(person);
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("quickstart-bytype.xml");
//        Person person = beanFactory.getBean(Person.class);
//        System.out.println(person);
//        DemoDao demoDao = beanFactory.getBean(DemoDao.class);
//        System.out.println(demoDao.findAll());
//        Cat cat = beanFactory.getBean(Cat.class);
//        System.out.println(cat);
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("quickstart-bytype.xml");
//        Map<String, DemoDao> beans = ctx.getBeansOfType(DemoDao.class);
//        beans.forEach((beanName, bean) -> System.out.println(beanName + " : " + bean.toString()));
//        System.out.println("准备初始化IOC容器。。。");
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("org.example.event");
//        System.out.println("IOC容器初始化完成。。。");
//        ctx.close();
//        System.out.println("IOC容器关闭。。。");
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("org.example.event");
//        RegisterService registerService = ctx.getBean(RegisterService.class);
//        registerService.register("张三");
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernProfileConfiguration.class);
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
