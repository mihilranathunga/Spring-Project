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
        System.out.println("Student Reg. Number : " + stu.getRegNumber());
        System.out.println("Student Name        : " + stu.getFirstName() + " " + stu.getLastName());
        System.out.println();
        System.out.println("Student Address     : " + stu.getAddress());
        System.out.println("***************************************************");
    }


    }


