/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.Student;
import DLL.StudentDLL;
import java.util.ArrayList;

/**
 *
 * @author shusa
 */
public class StudentBLL {
    
    private final StudentDLL studentDLL;
    
    public StudentBLL(){
        this.studentDLL = new StudentDLL();
    }
    
     public ArrayList<Student> getAllStudent(){
         return  studentDLL.getAllStudent();
     }
     
    public String saveStudent(Student aStudent){
     
        if(this.studentDLL.saveStudent(aStudent)){
            return "Student save done";
        }
        return "Something wrong";
    }
    
    
}
