package org.example;

import org.example.bean.Cat;
import org.example.bean.Person;
import org.example.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("quickstart-bytype.xml");
        Map<String, DemoDao> beans = ctx.getBeansOfType(DemoDao.class);
        beans.forEach((beanName, bean) -> System.out.println(beanName + " : " + bean.toString()));
    }
}
