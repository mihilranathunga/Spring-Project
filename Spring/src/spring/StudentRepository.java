/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spring;

/**
 *
 * @author 100440A
 */
public interface StudentRepository {
    public void addUser(String stunum,Student newStudent);
    public Student find(String stnum);



}
