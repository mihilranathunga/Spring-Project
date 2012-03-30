/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Mihil
 */
public class SimpleStudentRepositoryTest {
    
    public SimpleStudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class SimpleStudentRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String stuNum = "";
        Student newStudent = null;
        SimpleStudentRepository instance = new SimpleStudentRepository();
        instance.save(stuNum, newStudent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class SimpleStudentRepository.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String stuNum = "";
        SimpleStudentRepository instance = new SimpleStudentRepository();
        Student expResult = null;
        Student result = instance.find(stuNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class SimpleStudentRepository.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String key = "";
        Student repStudent = null;
        SimpleStudentRepository instance = new SimpleStudentRepository();
        instance.update(key, repStudent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class SimpleStudentRepository.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        String key = "";
        SimpleStudentRepository instance = new SimpleStudentRepository();
        instance.edit(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
