/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spring;
/**
 *
 * @author 100440A
 */
public class Student {
    private String firstname;
    private String lastname;
    private String regnum;
    private String address;

    Student(String inFirName,String inLasName,String regNumber,String addr){
        firstname = inFirName;
        lastname = inLasName;
        regnum   = regNumber;
        address  = addr;
    }

    public String getFirstName(){

        return firstname;
    }
    public String getLastName(){

        return lastname;
    }

    public String getRegNumber(){

        return regnum;
    }

    public String getAddress(){

        return address;
    }


}
