/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Haider
 */
public class editManager extends javax.swing.JFrame {
      Office o = Office.getInstance();
    /**
     * Creates new form editManager
     */
    public editManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        epassword = new javax.swing.JTextField();
        eid = new javax.swing.JTextField();
        eemail = new javax.swing.JTextField();
        ephone = new javax.swing.JTextField();
        ecnic = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        f = new javax.swing.JRadioButton();
        m = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        edob = new javax.swing.JTextField();
        ecity = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        mgr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(230, 230, 230));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 28)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 51));
        jLabel23.setText("Edit Manager");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurementsystem/icons8_360_degrees_50px.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurementsystem/icons8_360_degrees_50px_1.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurementsystem/icons8_360_degrees_50px_2.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText("City :");

        ename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setText("Manager ID :");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setText("Email :");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setText("CNIC :");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel25.setText("Password :");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel30.setText("Ph# :");

        epassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        epassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epasswordActionPerformed(evt);
            }
        });

        eid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eid.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                eidMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                eidMouseMoved(evt);
            }
        });
        eid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eidMouseExited(evt);
            }
        });
        eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidActionPerformed(evt);
            }
        });

        eemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eemailActionPerformed(evt);
            }
        });

        ephone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ephoneActionPerformed(evt);
            }
        });

        ecnic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ecnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecnicActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel22.setText("Gender :");

        f.setBackground(new java.awt.Color(230, 230, 230));
        buttonGroup1.add(f);
        f.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        f.setText("Female");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        m.setBackground(new java.awt.Color(230, 230, 230));
        buttonGroup1.add(m);
        m.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        m.setText("Male");
        m.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurementsystem/edit_account_30px.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setText("Update");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel73.setText("DOB :");

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel74.setText("Name :");

        edob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edobActionPerformed(evt);
            }
        });

        ecity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ecity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecityActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setText("Auto Fill");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurementsystem/ball_point_pen_30px.png"))); // NOI18N

        jButton5.setBackground(new java.awt.Color(230, 230, 230));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Exit");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurementsystem/exit_30px.png"))); // NOI18N

        mgr.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        mgr.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ephone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(epassword, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(eemail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ecnic, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel19)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel74))
                                        .addGap(19, 19, 19)
                                        .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(edob, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(m)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(f))
                                        .addComponent(ecity, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mgr, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(280, 280, 280))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel24))
                .addGap(11, 11, 11)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel74)
                        .addComponent(jLabel17)
                        .addComponent(eemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ename, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mgr, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(epassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(edob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(ephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ecnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(ecity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m)
                            .addComponent(f))))
                .addGap(83, 83, 83)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enameActionPerformed

    private void epasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epasswordActionPerformed

    private void eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_eidActionPerformed

    private void eemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eemailActionPerformed

    private void ephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ephoneActionPerformed

    private void ecnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecnicActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        accessoryManager a=new accessoryManager();
        int i=0;
       o.man.add(a);
       
        o.man.get(i).setName(ename.getText());
        o.man.get(i).setCnic(ecnic.getText());
        o.man.get(i).setCountry(ecity.getText());
        o.man.get(i).setDob(edob.getText());
        o.man.get(i).setManagerID(eid.getText());
        o.man.get(i).setEmail(eemail.getText());
        o.man.get(i).setPassword(epassword.getText());
        o.man.get(i).setPhone(ephone.getText());
            char e10;
        m.setActionCommand("M");
        f.setActionCommand("F");
        String g = buttonGroup1.getSelection().getActionCommand();
        String gnd = g;
        e10 = gnd.charAt(0);
        o.man.get(i).setGender(e10);
        
        boolean check=o.man.get(i).validateID();
        if(check==true){
        JOptionPane.showMessageDialog(null,"Updated Successfully...");
       ename.setText("");
       ecnic.setText("");
       ecity.setText("");
       edob.setText("");
       eid.setText("");
       eemail.setText("");
       epassword.setText("");
       ephone.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid Manager ID...");
            o.man.remove(i);
        }
        
//        String e1,e2,e3,e4,e5,e6,e7,e8;
        
//        e1=ename.getText();
//        e2=ecnic.getText();
//        e3=ecity.getText();
//        e4=edob.getText();
//        e5=eid.getText();
//        e6=eemail.getText();
//        e7=epassword.getText();
//        e8=ephone.getText();
//        m.setActionCommand("M");
//        f.setActionCommand("F");
//        String g = buttonGroup1.getSelection().getActionCommand();
//        String gnd = g;
//         e10 = gnd.charAt(0);
//       
//        a.setName(e1);
//        a.setCnic(e2);
//        a.setCountry(e3);
//        a.setEmail(e6);
//        a.setEmployeeID(e5);
//        a.setGender(e10);
//        a.setPhone(e8);
//        a.setDob(e4);
//        a.setPassword(e7);
//        
//        o.man.add(a);
        

        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void edobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edobActionPerformed

    private void ecityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecityActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int i=0;
        ename.setText(o.man.get(i).getName());
       ecnic.setText(o.man.get(i).getCnic() );
       ecity.setText(o.man.get(i).getCountry());
       edob.setText(o.man.get(i).getDob());
       eid.setText(o.man.get(i).getManagerID());
       eemail.setText(o.man.get(i).getEmail());
       epassword.setText(o.man.get(i).getPassword());
       ephone.setText(o.man.get(i).getPhone());

    }//GEN-LAST:event_jButton6ActionPerformed

    private void eidMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eidMouseDragged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_eidMouseDragged

    private void eidMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eidMouseMoved
        // TODO add your handling code here:
         mgr.setText("( Mgr-*** )");
    }//GEN-LAST:event_eidMouseMoved

    private void eidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eidMouseExited
        // TODO add your handling code here:
        mgr.setText("");
    }//GEN-LAST:event_eidMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new editManager().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ecity;
    private javax.swing.JTextField ecnic;
    private javax.swing.JTextField edob;
    private javax.swing.JTextField eemail;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField epassword;
    private javax.swing.JTextField ephone;
    private javax.swing.JRadioButton f;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton m;
    private javax.swing.JLabel mgr;
    // End of variables declaration//GEN-END:variables
}
