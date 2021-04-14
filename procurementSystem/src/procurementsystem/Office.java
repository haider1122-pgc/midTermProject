/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementsystem;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Haider
 */
public class Office {
   public ArrayList<Employee> emp = new ArrayList<>();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WelcomeScreen s=new WelcomeScreen();
        s.setVisible(true);
       
        
       
       
    }
    public void addEmployee(Employee e){
        
        emp.add(e);
    }
    
}
 
