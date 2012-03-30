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
public class StudentManagementSystemTest {
    
    public StudentManagementSystemTest() {
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
     * Test of main method, of class StudentManagementSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentManagementSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class StudentManagementSystem.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String stunum = "";
        Student newStudent = null;
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.save(stunum, newStudent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class StudentManagementSystem.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String key = "";
        Student repStudent = null;
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.update(key, repStudent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class StudentManagementSystem.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        String key = "";
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.edit(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class StudentManagementSystem.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String stuNum = "";
        StudentManagementSystem instance = new StudentManagementSystem();
        Student expResult = null;
        Student result = instance.find(stuNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerNewStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterNewStudent() {
        System.out.println("registerNewStudent");
        String firstName = "";
        String lastName = "";
        String regNumber = "";
        String address = "";
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.registerNewStudent(firstName, lastName, regNumber, address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayStudentData method, of class StudentManagementSystem.
     */
    @Test
    public void testDisplayStudentData() {
        System.out.println("displayStudentData");
        String regNum = "";
        StudentManagementSystem instance = new StudentManagementSystem();
        instance.displayStudentData(regNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
