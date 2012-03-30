/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spring;

/**
 *
 * @author 100444N - Mihil Ranathunga
 */
public class StudentManagementSystem implements StudentRepository{

    /**
     * @param args the command line arguments
     */
    private SimpleStudentRepository stuDb;

    public StudentManagementSystem() {
        
        this.stuDb = new SimpleStudentRepository();
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void save(String stunum, Student newStudent) {
        
        stuDb.save(stunum, newStudent);
    }

    public void update(String key, Student repStudent) {
        
       stuDb.update(key, repStudent);
    }

    public void edit(String key) {
       
        stuDb.edit(key);
    }

    public Student find(String stuNum) {
        
       return stuDb.find(stuNum);
    }
    public void registerNewStudent(String firstName,String lastName,String regNumber,String address){
        
        Student newEntree = new Student(firstName, lastName, regNumber, address);
        
        save(regNumber, newEntree);
        
    }
    public void displayStudentData(String regNum){
        
        Student stu = find(regNum);
        
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println("Student Reg. Number : "+stu.getRegNumber());
        System.out.println("Student Name        : "+stu.getFirstName()+" "+stu.getLastName());
        System.out.println();
        System.out.println("Student Address     : "+stu.getAddress());
        System.out.println("***************************************************");
    }

}
