/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

import DAO.Student;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author shusa
 */
public class StudentDLL extends DB{
    
    public ArrayList<Student> getAllStudent(){
        
        ArrayList<Student> students = new ArrayList<>();
        
        try {
            this.setConnection();
            
            String qurey = "SELECT * FROM StudentRecord";
            this.statement = this.connection.prepareStatement(qurey);
            this.resultSet = this.statement.executeQuery();
            while(this.resultSet.next()){
                Student aStudent = new Student();
                aStudent.setStudent_id(this.resultSet.getInt(1));
                aStudent.setStudent_firstname(this.resultSet.getString(2));
                aStudent.setStudent_lastname(this.resultSet.getString(3));
                aStudent.setStudent_dob(this.resultSet.getString(4));
                aStudent.setStudent_program(this.resultSet.getString(5));
                aStudent.setStudent_address(this.resultSet.getString(6));
                aStudent.setStudent_maritalstatus(this.resultSet.getString(7));
                aStudent.setStudent_country(this.resultSet.getString(8));
                students.add(aStudent);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            this.DisconnectFromDb();
        }
        return students;
    }
    
    public boolean saveStudent(Student aStudent){
        this.setConnection();
        int count = 0 ;
        try {
            String qurey = "INSERT INTO studentrecord(student_firstname,student_lastname,student_dob,student_program,"
                    + "student_address,student_maritalstatus,student_country) VALUES(?,?,?,?,?,?,?)";
            this.statement = this.connection.prepareStatement(qurey);
            this.statement.setString(1, aStudent.getStudent_firstname());
            this.statement.setString(2, aStudent.getStudent_lastname());
            this.statement.setString(3,aStudent.getStudent_dob());
            this.statement.setString(4, aStudent.getStudent_program());
            this.statement.setString(5, aStudent.getStudent_address());
            this.statement.setString(6, aStudent.getStudent_maritalstatus());
            this.statement.setString(7, aStudent.getStudent_country());
            count = this.statement.executeUpdate();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            this.DisconnectFromDb();
        }
        if(count>0){
            return true;
        }
        return false;
    }
}
