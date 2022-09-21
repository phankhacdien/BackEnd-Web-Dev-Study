package com.sherlock.springbeanexample;


//import com.sherlock.springbeanexample.Config.IoCConfig;
import com.sherlock.springbeanexample.Controller.Man;
import com.sherlock.springbeanexample.Entity.Coat;
import com.sherlock.springbeanexample.Entity.Outfit;
import com.sherlock.springbeanexample.Entity.Shirt;
import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBeanExampleApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBeanExampleApplication.class, args);    //this command itSelf return An application Context Container

        // Java based Configuration
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IoCConfig.class);
//        Man man = (Man) context.getBean("createBeanMan");
//        System.out.println(man);

//         XML configuration
//        ApplicationContext xml_context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Man xml_man = (Man) xml_context.getBean("man");
//        System.out.println(xml_man);

//         Annotation Configuration
        ConfigurableApplicationContext anno_context = SpringApplication.run(SpringBeanExampleApplication.class, args);

        Outfit coat = anno_context.getBean(Coat.class);
        Outfit shirt = anno_context.getBean(Shirt.class);
        System.out.println("Instance: "+coat);
        coat.wear();
        System.out.println("Instance: "+shirt);
        shirt.wear();

        Man anno_man = anno_context.getBean(Man.class);
        System.out.println("Man instance: "+anno_man);
        System.out.println("Man outfit: "+anno_man.getOutfit());
        anno_man.getOutfit().wear();

        anno_context.getBeanFactory().destroyBean(shirt);
    }
}
