/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        //loading data
        Office of=Office.getInstance();
       of.loadEmployee();
       of.loadProduct();
       of.loadRequests();
       of.loadAdmin();
      
      
       
       
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
   // this data member is used to access id entered in employee login screen in employee welcome screen
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
    //////////////////////////////////////////////////////////////////////////

    /**
     * function to load employee data
     */
    public  void loadEmployee(){
         
     try {
         try (FileReader fr = new FileReader("Employee.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 Employee e = new Employee();
                 String[] str = line.split(",");
                 e.setName(str[0]);
                 e.setEmployeeID(str[1]);
                 e.setPassword(str[2]);
                 e.setGender(str[3].charAt(0));
                 e.setPhone(str[4]);
                 e.setEmail(str[5]);
                 e.setDesignation(str[6]);
                 e.setCountry(str[7]);
                 e.setCnic(str[8]);
                 e.setDob(str[9]);
                 
                 emp.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
    public void loadProduct(){
        try {
         try (FileReader fr = new FileReader("Products.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 Products e = new Products();
                 String[] str = line.split(",");
                 e.setName(str[0]);
                 e.setQuantity(Integer.parseInt(str[1]));
                 e.setPrice(Integer.parseInt(str[2]));
                 
                 
                 pro.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
    public void loadRequests(){
        try {
         try (FileReader fr = new FileReader("Requests.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                 Requests e = new Requests();
                 String[] str = line.split(",");
                 e.setEmployeeID(str[0]);
                 e.setNameEmployee(str[1]);
                 e.setNameProduct(str[2]);
                 e.setQuantity(Integer.parseInt(str[3]));
                 e.setEmail(str[4]);
                 e.setPhone(str[5]);
                 e.setDateTime(str[6]);
                 
                 
                 
                 req.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
    public void loadAssign(){
        try {
         try (FileReader fr = new FileReader("Assigned.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            int i=0;
            
             while(line != null)
             {
                 
                 Requests e = new Requests();
                 String[] str = line.split(",");
                 ass.get(i).setEmployeeID(str[0]);
                 ass.get(i).setNameEmployee(str[1]);
                 ass.get(i).setNameProduct(str[2]);
                 ass.get(i).setQuantity(Integer.parseInt(str[3]));
                 ass.get(i).setDateTime(str[4]);
                 
                 
                 
                  //ass.add(i, e);
                  line = br.readLine();
                  i++;
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
    
    public  void loadAdmin(){
         
     try {
         try (FileReader fr = new FileReader("Manager.txt"); BufferedReader br = new BufferedReader(fr)) {
             
             String line= br.readLine();
             
            
            
             while(line != null)
             {
                 
                accessoryManager e = new accessoryManager();
                 String[] str = line.split(",");
                 e.setName(str[0]);
                 e.setManagerID(str[1]);
                 e.setPassword(str[2]);
                 e.setGender(str[3].charAt(0));
                 e.setPhone(str[4]);
                 e.setEmail(str[5]);
                 e.setCountry(str[6]);
                 e.setCnic(str[7]);
                 e.setDob(str[8]);
                 
                 man.add(e);
                  line = br.readLine();
                 
             }
             
             
             br.close();
             fr.close();
             
         }
        } catch (IOException ex) {
           
        }
    }
    
             
             
            
}
 
