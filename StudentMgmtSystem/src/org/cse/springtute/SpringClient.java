/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cse.springtute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 100444N - Mihil Ranathunga
 */
public class SpringClient {

    private static StudentManagementSystem sms;
    private static ApplicationContext context;

    public SpringClient() {
        context = new ClassPathXmlApplicationContext("spring-context.xml");
        sms = (StudentManagementSystem) context.getBean("sms");

    }

    private void fetchUsers() {

        sms.listAllStudentData();
    }

    public static void main(String[] args) {

        SpringClient client = new SpringClient();

        Student mihil = (Student) context.getBean("mihil");
        Student sampath = (Student) context.getBean("sampath");
        Student vimuth = (Student) context.getBean("vimuth");

        sms.registerNewStudent(mihil);
        sms.registerNewStudent(sampath);
        sms.registerNewStudent(vimuth);

        client.fetchUsers();

        sms.registerNewStudent("Isuri", "Subasinghe", "100521A", "No. 1, Cul De Sac , Katunayake");
        sms.registerNewStudent("Tharindu", "Ranasinghe", "100440A", "No : 666 , Veyangoda");
        sms.registerNewStudent("Mihiri", "Guthunga", "100167R", "17/80 , Ambalangoda");
        sms.registerNewStudent("Samiththa", "Bhashini", "100059M", "No :7 , Mathara");

        client.fetchUsers();
    }
}
