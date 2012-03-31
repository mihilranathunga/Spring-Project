/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import org.cse.springtute.SimpleStudentRepository;
import org.cse.springtute.Student;
import java.util.HashMap;
import java.util.Iterator;
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
        student = new Student("Mihil","Ranathunga","100444N","Gampaha");  
        instance.saveStudent("100444N",student);
        
    }
    
    @After
    public void tearDown() {
    }

 

    /**
     * Test of findStudent method, of class SimpleStudentRepository.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String stuNum = student.getRegNumber();
        Student result = instance.findStudent(stuNum);
        assertEquals(student, result);

    }


  

    
}
