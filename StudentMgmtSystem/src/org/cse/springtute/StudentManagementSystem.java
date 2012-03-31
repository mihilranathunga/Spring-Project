/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import java.util.Iterator;

/**
 *
 * @author 100444N - Mihil Ranathunga
 */
public class StudentManagementSystem {

    /**
     * @param args the command line arguments
     */
    private  StudentRepository stuDb;

    public StudentManagementSystem() {

        setStuDb(new SimpleStudentRepository());
    }

    public final void setStuDb(SimpleStudentRepository stuDb) {
        this.stuDb = stuDb;
    }


    public void registerNewStudent(String firstName, String lastName, String regNumber, String address) {

        Student newEntree = new Student(firstName, lastName, regNumber, address);

        stuDb.saveStudent(newEntree);

    }

    public void listAllStudentData() {

        Iterator<Student> stu = stuDb.findAllStudents();

        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println("Application Showing all the student Ragistrations ..........");
        System.out.println();
        while(stu.hasNext()){
            
            Student student = stu.next();
            
        System.out.println("Student Reg. Number : " + student.getRegNumber());
        System.out.println("Student Name        : " + student.getFirstName() + " " + student.getLastName());
        System.out.println();
        System.out.println("Student Address     : " + student.getAddress());
        System.out.println();
        System.out.println("           ----------------------------------------------          ");
        System.out.println();
        
        }
        System.out.println("***************************************************");
    }


    }


