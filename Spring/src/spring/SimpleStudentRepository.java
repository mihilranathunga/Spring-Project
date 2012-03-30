/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spring;
import java.util.*;

/**
 *
 * @author 100444N - Mihil Ranathunga
 */
public class SimpleStudentRepository implements StudentRepository{

    HashMap<String, Student> map;

    public SimpleStudentRepository(){
        map = new HashMap<String, Student>();
    }

    public void save(String stuNum,Student newStudent){
        map.put(stuNum, newStudent);
    }

    public Student find(String stuNum){
        return map.get(stuNum);
    }

    public void update(String key, Student repStudent) {
        
        map.remove(key);
        map.put(key, repStudent);
    }

    public void edit(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterator<Student> fetchUsers() {
        return (map.values()).iterator();
    }


}
