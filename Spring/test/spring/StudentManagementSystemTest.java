/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Mihil
 */
public class StudentManagementSystemTest {
    
    public StudentManagementSystemTest() {
    }
    
    Student student;
    SimpleStudentRepository instance;
    StudentManagementSystem sys;


    
    @Before
    public void setUp() {
        
        student = new Student("Mihil","Ranathunga","100444N","Gampaha");
        
        instance = new SimpleStudentRepository();
        instance.save("100444N",student);
  
        sys =  new StudentManagementSystem();
        sys.setStuDb(instance);
    }
    
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of find method, of class StudentManagementSystem.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String stuNum = student.getRegNumber();
        
        Student expResult = instance.find(stuNum);
        Student result = sys.find(stuNum);
        assertEquals(expResult, result);
   
    }
}

  