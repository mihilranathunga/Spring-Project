/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Mihil
 */
public class SimpleStudentRepositoryTest {
    
    SimpleStudentRepository instance;
    Student student;
    
    public SimpleStudentRepositoryTest() {
    }
    
    @Before
    public void setUp() {
        
        instance = new SimpleStudentRepository();
        student = new Student("Mihil", "Ranathunga", "100444N", "Gampaha");
        instance.saveStudent(student);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindStudent() {
        System.out.println("findStudent test case testing ....");
        
        String stuNum = student.getRegNumber();
        Student result = instance.findStudent(stuNum);
        assertEquals(student, result);
    }

    /**
     * Test of findAllStudents method, of class SimpleStudentRepository.
     */
    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents test case testing");
        List<Student> expResult = new ArrayList<Student>();
        expResult.add(student);
        List<Student> result = instance.findAllStudents();
        
        assertEquals(expResult, result);
    }
}
