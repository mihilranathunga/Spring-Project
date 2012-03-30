/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spring;
/**
 *
 * @author 100444N - Mihil Ranathunga
 */
public class Student {
    private String firstName;
    private String lastName;
    private String regNum;
    private String address;

    Student(String inFirName,String inLasName,String regNumber,String addr){
        firstName = inFirName;
        lastName = inLasName;
        regNum   = regNumber;
        address  = addr;
    }

    public String getFirstName(){

        return firstName;
    }
    public String getLastName(){

        return lastName;
    }

    public String getRegNumber(){

        return regNum;
    }

    public String getAddress(){

        return address;
    }


}
