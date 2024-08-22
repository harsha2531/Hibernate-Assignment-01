package org.example.config;


import org.example.entity.Student;
import org.example.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private FactoryConfiguration() {
        Configuration configuration = new Configuration();
        configuration.configure().addAnnotatedClass(Student.class);
        configuration.configure().addAnnotatedClass(Teacher.class);
        sessionFactory= (SessionFactory) configuration.buildSessionFactory();

    }
    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }

    private SessionFactory sessionFactory;
    public Session getSession(){
        return sessionFactory.openSession();

    }
}
