package com.sherlock.hibernatedemo;

import com.sherlock.hibernatedemo.Entity.Address;
import com.sherlock.hibernatedemo.Entity.Course;
import com.sherlock.hibernatedemo.Entity.Fresher;
import com.sherlock.hibernatedemo.Entity.Shirt;
import com.sherlock.hibernatedemo.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


@SpringBootApplication
public class HibernateDemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(HibernateDemoApplication.class, args);

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

//            Shirt shirt = new Shirt("Gray", "XL", "Linen");
//            session.save(shirt);

            Fresher fresher1 = new Fresher("Nguyen Van A");
            Fresher fresher2 = new Fresher("Tran Huu B");
            List<Fresher> freshers = new ArrayList<>();
            freshers.add(fresher1);
            freshers.add(fresher2);
//
            Course java_course = new Course("Java");
            Course hibernate_course = new Course("Hibernate");
            List<Course> courses = new ArrayList<>();
            courses.add(java_course);
            courses.add(hibernate_course);
//
            fresher1.setCourses(courses);
            fresher2.setCourses(courses);
            java_course.setFreshers(freshers);
            hibernate_course.setFreshers(freshers);

//            Address address = new Address("Duy Tan", "HN", "VN");
//            Fresher fresher = new Fresher("Nguyen Van A", courses);
//            courses.setFresher(fresher);

//            session.save(address);
//            session.save(fresher);
            for(Course course:courses) {
                session.save(course);
            }
//
            for(Fresher fresher:freshers) {
                session.save(fresher);
            }

            session.getTransaction().commit();

//            Shirt get_shirt = session.get(Shirt.class,1);
//            System.out.println(get_shirt);

        } catch(Exception e) {
            System.out.println(e.toString());
        }
        HibernateUtils.close();
    }
}
