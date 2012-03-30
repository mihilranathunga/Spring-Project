/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

import java.util.Iterator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 100444N - Mihil Ranathunga
 */
public class SpringClient {

    private static StudentManagementSystem sms;

    public SpringClient() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
         sms = (StudentManagementSystem) context.getBean("sms");
 
    }
    
       private void fetchUsers()
    {

            sms.fetchUsers();
    }
       
       public static void main(String [] args){
           
           SpringClient client = new SpringClient();
           
           
           sms.registerNewStudent("Mihil","Ranathunga","100444N","21/180 , Rathmal Gardens , Imbulgoda");
           sms.registerNewStudent("Sampath","Liyanage","100476M","No. 90 , Mawanella");
           sms.registerNewStudent("Mihiri","Guthunga","100217","17/80 , Boralasgamuwa");
           
           client.fetchUsers();
           
       }


    
    
}
