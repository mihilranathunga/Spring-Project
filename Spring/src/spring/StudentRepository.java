/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

/**
 *
 * @author 100444N Mihil Ranathunga
 */
public interface StudentRepository {

    public void save(String stunum, Student newStudent);

    public void update(String key, Student repStudent);

    public void edit(String key);

    public Student find(String stuNum);
}
