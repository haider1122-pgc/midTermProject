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
public class Requests {
    private String nameEmployee;
    private String nameProduct;
    private String employeeID;
    private String dateTime;
    private int quantity;
    private String decision;
    private String email;
    private String phone;
    
    //getters
    
    /**
     * getter for employee name
     * @return String
     */
    public String getNameEmployee() {
        return nameEmployee;
    }
    
    /**
     * getter for product name
     * @return String
     */
    public String getNameProduct() {
        return nameProduct;
    }
    
    /**
     * getter for employee id
     * @return String
     */
    public String getEmployeeID() {
        return employeeID;
    }
    
    /**
     * getter for Date time
     * @return String
     */
    public String getDateTime() {
        return dateTime;
    }
    
    /**
     * getter for quantity
     * @return integer
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * getter for decision
     * @return String
     */
    public String getDecision() {
        return decision;
    }
    
    //setters
    
    /**
     * setter for employee name
     * @param nameEmployee 
     */
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }
    
    /**
     * setter for name of product
     * @param nameProduct 
     */
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    
    /**
     * setter for employee id
     * @param employeeID 
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    /**
     * setter for date and time
     * @param dateTime 
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    /**
     * setter for quantity
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    /**
     * setter for decision
     * @param decision 
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }
    /**
     * getter for email
     * @return String
     */
    public String getEmail() {
        return email;
    }
    /**
     * getter for phone
     * @return String
     */
    public String getPhone() {
        return phone;
    }
    /**
     * setter for email
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * setter for phone
     * @param phone 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    
    
    
    
}
