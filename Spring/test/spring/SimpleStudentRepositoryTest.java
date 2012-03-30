/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

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
        instance.save("100444N",student);
        
    }
    
    @After
    public void tearDown() {
    }

 

    /**
     * Test of find method, of class SimpleStudentRepository.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String stuNum = student.getRegNumber();
        Student result = instance.find(stuNum);
        assertEquals(student, result);

    }


  

    
}
