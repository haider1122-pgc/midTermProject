/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementsystem;

import java.util.ArrayList;

/**
 *
 * @author Haider
 */
public class Office {
    
   public ArrayList<Employee> emp = new ArrayList<>();
   public ArrayList<accessoryManager> man = new ArrayList<>();
   public ArrayList<Products> pro = new ArrayList<>();
   public ArrayList<Requests> req = new ArrayList<>();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WelcomeScreen s=new WelcomeScreen();
        s.setVisible(true);
       
        
       
       
    }
    /**
     * function to add employee data to list
     * @param e 
     */
    public void addEmployee(Employee e){
        
        emp.add(e);
    }
    /**
     * adding product
     * @param p 
     */
    public void addProduct(Products p){
        
        pro.add(p);
    }
    
    public void removeEmployee(int i){
        
        emp.remove(i);
    }
    
    
}
 
