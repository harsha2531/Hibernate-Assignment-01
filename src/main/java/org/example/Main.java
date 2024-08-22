package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        //----------Student Table------------------------//
      /*  FullName fullName = new FullName("Harsha","Nimeda");
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
        session.close();*/

        //---------------Teacher Table----------------------//
        FullName fullname = new FullName("Udara","San");
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName(fullname);
        teacher.setAddress("Colombo");
        Transaction transaction = session.beginTransaction();
        //session.save(teacher);
       //session.update(teacher);
        //session.delete("1",teacher);
        //-----------Get Data---------------
        Teacher t1 = session.get(teacher.getClass(),1);
        System.out.println(t1.getId());
        System.out.println(t1.getName().getFirstName());
        System.out.println(t1.getName().getLastName());
        System.out.println(t1.getAddress());

        transaction.commit();
        session.close();
    }
}