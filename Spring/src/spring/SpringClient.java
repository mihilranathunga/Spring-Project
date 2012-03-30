/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

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

            sms.displayAllUsers();
    }
       
       public static void main(String [] args){
           
           SpringClient client = new SpringClient();
           
           
           sms.registerNewStudent("Mihil","Ranathunga","100444N","21/180 , Rathmal Gardens , Imbulgoda");
           sms.registerNewStudent("Sampath","Liyanage","100476M","No. 90 , Mawanella");
           sms.registerNewStudent("Mihiri","Guthunga","100167R","17/80 , Ambalangoda");
           sms.registerNewStudent("Samiththa","Bhashini","100059M","No :7 , Mathara");
           sms.registerNewStudent("Tharindu","Ranasinghe","100440A","No : 666 , Veyangoda");
           
           System.out.println();
           System.out.println("Application Showing all the student Ragistrations ..........");
           
           client.fetchUsers();
           
       }


    
    
}
