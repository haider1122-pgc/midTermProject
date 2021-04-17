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
public class accessoryManager extends Person {

    private String managerID;
    boolean check0 = false;

    /**
     * getter for manager ID
     *
     * @return
     */
    public String getManagerID() {
        return managerID;
    }

    /**
     * setter for manager id
     *
     * @param managerID
     */
    public void setManagerID(String managerID) {
        boolean check1 = false, check = true;
        int size = managerID.length();
        if (managerID.charAt(0) == 'M') {
            if (managerID.charAt(1) == 'g') {
                if (managerID.charAt(2) == 'r') {
                    if (managerID.charAt(3) == '-') {
                        check1 = true;
                    }
                }
            }
        }
        if (check1 == true) {
            for (int i = 4; i <= size - 4; i++) {
                if ((managerID.charAt(i) >= 'a' && managerID.charAt(i) <= 'z') || (managerID.charAt(i) >= 'A' && managerID.charAt(i) <= 'Z')) {
                    check = false;
                    break;
                }
            }
        }
        if (check1 == true && check == true) {
            this.managerID = managerID;
            check0 = true;
            t2 = true;

        } else {

            t2 = false;

        }
    }
    /**
     * check validation of manager id
     * @return Boolean
     */
    public boolean validateID() {
        return check0;

    }

}
