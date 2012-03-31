/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import java.util.Iterator;

/**
 *
 * @author 100444N Mihil Ranathunga
 */
public interface StudentRepository {

    public void saveStudent(Student newStudent);

    public void updateStudent(Student repStudent);

    public void deleteStudent(String regNum);

    public Student findStudent(String stuNum);
    
    public Iterator<Student> findAllStudents();
}
