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
    boolean t1, t2, t3, t4, t5, t6, t7, t8;
    //creating getters for all data members

    /**
     * getter for name
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * getter for employee id
     *
     * @return String
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * getter for email
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * getter for phone number
     *
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /**
     * getter for country
     *
     * @return String
     */
    public String getCountry() {
        return country;
    }

    /**
     * getter for date of birth
     *
     * @return String
     */
    public String getDob() {
        return dob;
    }

    /**
     * getter for gender
     *
     * @return char
     */
    public char getGender() {
        return gender;
    }

    /**
     * getter for password
     *
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * getter for CNIC
     *
     * @return String
     */
    public String getCnic() {
        return cnic;
    }

    //////////////////////////////////////////////////////////////////////////////creating setters for data members
    /**
     * setter for name
     *
     * @param name
     */
    public void setName(String name) {
        boolean flag = true;
        if (name.length() <= 50) {
            for (int i = 0; i < name.length(); i++) {
                if (!((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) == ' '))) {
                    flag = false;
                }

            }
        }
        if (flag == true) {
            this.name = name;
            t1 = true;

        } else {

            t1 = false;
        }
    }

    /**
     * setter for employee id
     *
     * @param employeeID
     */
    public void setEmployeeID(String employeeID) {
        boolean check1 = false, check = false;
        int size = employeeID.length();
        if (employeeID.charAt(0) == 'E') {
            if (employeeID.charAt(1) == 'm') {
                if (employeeID.charAt(2) == 'p') {
                    if (employeeID.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((employeeID.charAt(i) >= 'a' && employeeID.charAt(i) <= 'z') || (employeeID.charAt(i) >= 'A' && employeeID.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
        if (check == true) {
            this.employeeID = employeeID;
            t2 = true;

        } else {

            t2 = false;

        }
    }

    /**
     * setter for email
     *
     * @param email
     */
    public void setEmail(String email) {
        int size = email.length();
        int index = 0;
        boolean check = true;
        if (email.charAt(0) == '@') {
            check = false;
        } else {
            for (int i = 1; i < size; i++) {
                if (email.charAt(i) == '@') {
                    index = i;
                    break;
                }
            }
            if (email.charAt(index) == '.') {
                check = false;
            }
        }
        if (check == true) {
            this.email = email;
            t3 = true;
        } else {
            t3 = false;

        }
    }

    /**
     * setter for phone number
     *
     * @param phone
     */
    public void setPhone(String phone) {
        int size = phone.length();

        boolean check = true;
        if (size == 11) {
            for (int i = 0; i <= size; i++) {
                if (!(phone.charAt(i) >= '0' && phone.charAt(i) <= '9')) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                this.phone = phone;
                t4 = true;
            }
            else {
                t4 = false;
            }

        }
        else {
             t4 = false;
        }
    }

    /**
     * setter for country
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * setter for dob
     *
     * @param dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * setter for gender
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * setter for password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * setter for CNIC
     *
     * @param cnic
     */
    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

}
