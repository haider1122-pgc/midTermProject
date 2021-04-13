/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementsystem;

/**
 *
 * @author Haider
 */
public class Person {
    //declearing datamembers
    private String name;
    private String employeeID;
    private String email;
    private String phone;
    private String country;
    private String dob;
    private char gender;
    private String password;
    private String cnic;
    //creating getters for all data members
    
    /**
     * getter for name
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /**
     * getter for employee id
     * @return String
     */
    public String getEmployeeID() {
        return employeeID;
    }
    
    /**
     * getter for email
     * @return String
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * getter for phone number
     * @return String
     */
    public String getPhone() {
        return phone;
    }
    
    /**
     * getter for country
     * @return String
     */
    public String getCountry() {
        return country;
    }
    
    /**
     * getter for date of birth
     * @return String
     */
    public String getDob() {
        return dob;
    }
    
    /**
     * getter for gender
     * @return char
     */
    public char getGender() {
        return gender;
    }
    
    /**
     * getter for password
     * @return String
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * getter for CNIC
     * @return String
     */
    public String getCnic() {
        return cnic;
    }
    
    //creating setters for data members
    
    /**
     * setter for name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * setter for employee id
     * @param employeeID 
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    /**
     * setter for email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * setter for phone number
     * @param phone 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     * setter for country
     * @param country 
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    /**
     * setter for dob
     * @param dob 
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    /**
     * setter for gender
     * @param gender 
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    /**
     * setter for password
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * setter for CNIC
     * @param cnic 
     */
    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
    
    
    
    
    
}
