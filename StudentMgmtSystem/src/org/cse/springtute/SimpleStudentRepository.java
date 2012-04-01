/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 100444N - Mihil Ranathunga
 */
public class SimpleStudentRepository implements StudentRepository {

    private HashMap<String, Student> map;


    public SimpleStudentRepository() {
        map = new HashMap<String, Student>();
    }

    public void saveStudent(Student newStudent) {
        map.put(newStudent.getRegNumber(), newStudent);
    }

    public Student findStudent(String stuNum) {
        return map.get(stuNum);
    }

    public void updateStudent(Student repStudent) {
        
        String key = repStudent.getRegNumber();

        map.remove(key);
        map.put(key, repStudent);
    }

    public void deleteStudent(String regNum) {
        
        map.remove(regNum);
    }

    public List<Student> findAllStudents() {
        return (List)(new ArrayList(map.values()));
    }

  
}
