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
import java.sql.Timestamp;
public class Office {
    
   public ArrayList<Employee> emp = new ArrayList<>();
   public ArrayList<accessoryManager> man = new ArrayList<>();
   public ArrayList<Products> pro = new ArrayList<>();
   public ArrayList<Requests> req = new ArrayList<>();
   public ArrayList<Requests>ass=new ArrayList<>();
   static Office o=null;
  
   //////////////////////////////////////////////////////////////////////////
         /**
          * to let the office class behaves singleton behavior
          * @return Office 
          */
         public static Office getInstance(){
             if(o==null){
                 o=new Office();
                 return o;
                 
             }
             return o;
             
         }
   //////////////////////////////////////////////////////////////////////////
         //make the Office constructor private
        private Office (){
            
        }
    

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
    /**
     * removing employee
     * @param i 
     */
    public void removeEmployee(int i){
        
        emp.remove(i);
    }
    /**
     * removing product
     * @param i 
     */
    public void removeProducts(int i){
        
        pro.remove(i);
    }
    /**
     * editing employee data
     * @param x
     * @param y 
     */
    public void editEmployee(int x, Employee y){
        emp.set(x,y);
        
    }
    /**
     * editing products
     * @param x
     * @param y 
     */
    public void editProduct(int x, Products y){
        pro.set(x,y);
        
    }
    /**
     * function for current date and time
     * @return String
     */
    public String Time() {
        Timestamp time1=new Timestamp(System.currentTimeMillis());
     String str=time1.toString();
     return str;
    }
    ///////////////////////////////////////////////////////////////////////////
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
    
    
}
 
