/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author shusa
 */
public class Student {
    
    private int student_id;
    private String student_firstname;
    private String student_lastname;
    private String student_dob;
    private String student_program;
    private String student_address;
    private String student_maritalstatus;
    private String student_country;

    public Student(int student_id, String student_firstname, String student_lastname,
            String student_dob, String student_program, String student_address,
            String student_maritalstatus, String student_country) {
        this.student_id = student_id;
        this.student_firstname = student_firstname;
        this.student_lastname = student_lastname;
        this.student_dob = student_dob;
        this.student_program = student_program;
        this.student_address = student_address;
        this.student_maritalstatus = student_maritalstatus;
        this.student_country = student_country;
    }

    public Student() {
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_firstname() {
        return student_firstname;
    }

    public void setStudent_firstname(String student_firstname) {
        this.student_firstname = student_firstname;
    }

    public String getStudent_lastname() {
        return student_lastname;
    }

    public void setStudent_lastname(String student_lastname) {
        this.student_lastname = student_lastname;
    }

    public String getStudent_dob() {
        return student_dob;
    }

    public void setStudent_dob(String student_dob) {
        this.student_dob = student_dob;
    }

    public String getStudent_program() {
        return student_program;
    }

    public void setStudent_program(String student_program) {
        this.student_program = student_program;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public String getStudent_maritalstatus() {
        return student_maritalstatus;
    }

    public void setStudent_maritalstatus(String student_maritalstatus) {
        this.student_maritalstatus = student_maritalstatus;
    }

    public String getStudent_country() {
        return student_country;
    }

    public void setStudent_country(String student_country) {
        this.student_country = student_country;
    }
    
    


   
}
