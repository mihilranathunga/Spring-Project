/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

/**
 *
 * @author Mihil
 */
public class StudentManagementSystemTest {
    
    StudentManagementSystem instance;
    SimpleStudentRepository stuDb;
    Student student;
    
    public StudentManagementSystemTest() {
    }

    
    @Before
    public void setUp() {
        
        instance = new StudentManagementSystem();
        stuDb = new SimpleStudentRepository();
        instance.setStuDb(stuDb);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setStuDb method, of class StudentManagementSystem.
     */
    @Test
    public void testSetStuDb() {
        System.out.println("Testing setStuDb......");
        
        Boolean expected = (Boolean)instance.checkStudb(stuDb);
         
        assertEquals(expected,Boolean.TRUE);
    }

    /**
     * Test of registerNewStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterNewStudent() {
        System.out.println("registerNewStudent test case executing..");
        String firstName = "Mihil";
        String lastName = "Ranathunga";
        String regNumber = "100444N";
        String address = "Gampaha";
        
        instance.registerNewStudent(firstName, lastName, regNumber, address);
        student  = new Student(firstName, lastName, regNumber, address);
        
         String expected = student.getFirstName();
         String actual   = (stuDb.findStudent(regNumber)).getFirstName();
        
        
        assertEquals(actual,expected);
       
   

}
}
