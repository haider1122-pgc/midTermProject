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
public class Products {
    private String name;
    private int quantity;
    private int price;
    boolean t1,t2,t3;
    
    //getter and setter
    
    /**
     * getter for name
     * @return string
     */
    public String getName() {
        return name;
    }
    
    /**
     * getter for quantity
     * @return integer
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * getter for price
     * @return integer
     */
    public int getPrice() {
        return price;
    }
    //setters
    
    /**
     * setter for name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
        t1=true;
    }
    
    /**
     * setter for quantity
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        t2=true;
    }
    
    /**
     * setter for price
     * @param price 
     */
    public void setPrice(int price) {
        this.price = price;
        t3=true;

        
        
    }
    ///////////////////////////////////////////////////////////////////////////////
    public boolean validation(){
        //JOptionPane.showMessageDialog(null,t1+"\n"+t2+"\n"+t3+"\n"+t4+"\n"+t5+"\n");
        return t2==true && t3==true && t1==true;
        
    }
    
    
    
    
    
}
