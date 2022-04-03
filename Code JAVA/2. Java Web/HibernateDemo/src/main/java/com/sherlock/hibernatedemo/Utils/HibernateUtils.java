package com.sherlock.hibernatedemo.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class HibernateUtils {
    private static SessionFactory sessionFactory;

    public static SessionFactory buildSessionFactory() throws IOException {
        Properties properties = new Properties();
        properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("application.properties"));
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").mergeProperties(properties);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() throws IOException {
        return sessionFactory = buildSessionFactory();
    }

    public static void close() {
        sessionFactory.close();
    }
}
