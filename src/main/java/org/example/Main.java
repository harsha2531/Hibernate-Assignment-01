package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Harsha","Nimeda");
        Student student = new Student();
        student.setId(6);
        student.setName(fullName);
        student.setAddress("Alubomulla");
        //open transaction
        Transaction transaction = session.beginTransaction();
        //session.save(student);
        //session.update(student);
        //-----------------------------------
        //delete,get,another table,note
        //------------Delete---------------
        //session.delete("4",student);
        //-----------Get Data---------------
        Student s1 = session.get(student.getClass(),6);
        System.out.println(s1.getId());
        System.out.println(s1.getName().getFirstName());
        System.out.println(s1.getName().getLastName());
        System.out.println(s1.getAddress());
        transaction.commit();
        session.close();
    }
}