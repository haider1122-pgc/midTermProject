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
 public class Employee extends Person {
     private String designation;
     
     // setter and getter
     
    /**
     * getter for designation
     * @return String
     */
    public String getDesignation() {
        return designation;
    }
    /**
     * setter for designation
     * @param designation 
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }
     
    
}
