/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spring;
import java.util.*;

/**
 *
 * @author 100440A
 */
public class SimpleStudentRepository implements StudentRepository{

    HashMap<String, Student> map;

    public SimpleStudentRepository(){
        map = new HashMap<String, Student>();
    }

    public void addUser(String stunum,Student newStudent){
        map.put(stunum, newStudent);
    }

    public Student find(String stnum){
        return map.get(stnum);
    }


}
