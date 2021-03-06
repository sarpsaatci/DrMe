/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drme;

import javax.swing.JOptionPane;

/**
 *
 * @author Sarp
 */
public class DoctorSignUpPanel extends javax.swing.JPanel {
String name, surname, cerNo, biography, branch;
String hospital = "Atatürk Hastanesi";
    /**
     * Creates new form DoctorSignUpPanel
     */
    public DoctorSignUpPanel() {
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

        SurnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        WorkingPlaceComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        BiographyField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cerNoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BranchField = new javax.swing.JTextField();

        SurnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Working Place : ");

        jLabel1.setText("Name : ");

        WorkingPlaceComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATATÜRK HASTANESİ" }));
        WorkingPlaceComboBox.setToolTipText("");
        WorkingPlaceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkingPlaceComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Bıography  : ");

        BiographyField.setText(" ");
        BiographyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiographyFieldActionPerformed(evt);
            }
        });

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Surname : ");

        jLabel6.setText("Certificate No :");

        cerNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerNoFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Branch :");

        BranchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitButton)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WorkingPlaceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BiographyField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NameField)
                                .addComponent(SurnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addComponent(cerNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BranchField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(153, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cerNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WorkingPlaceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(BiographyField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BranchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(SubmitButton)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
        name = NameField.getText();
    }//GEN-LAST:event_NameFieldActionPerformed

    private void SurnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurnameFieldActionPerformed
        // TODO add your handling code here:
        surname = SurnameField.getText();
    }//GEN-LAST:event_SurnameFieldActionPerformed

    private void BiographyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiographyFieldActionPerformed
        // TODO add your handling code here:
        biography = BiographyField.getText();
    }//GEN-LAST:event_BiographyFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        
        name = NameField.getText();
        surname = SurnameField.getText();
        biography = BiographyField.getText();
        cerNo = cerNoField.getText();
        branch = BranchField.getText();
        hospital =(String) WorkingPlaceComboBox.getSelectedItem();

        
        DBConnect co = new DBConnect("doctors");
        int[] arr = co.getIDs();
        int c;
        c = Integer.parseInt(cerNo);
        Doctor doc;
        if(arr.length<1)
        {
            doc = new Doctor(2000, name, surname, branch, hospital, c, biography);
            JOptionPane.showMessageDialog(null,"Your ID  is 2000");
        }
        else
        {
            doc = new Doctor(arr[arr.length-1]+1, name, surname, branch, hospital, c, biography);
            JOptionPane.showMessageDialog(null,"Your ID  is " + (arr[arr.length-1]+1));
        }
        co.addDoctor(doc);
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void cerNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerNoFieldActionPerformed
        // TODO add your handling code here:
        cerNo = cerNoField.getText();
    }//GEN-LAST:event_cerNoFieldActionPerformed

    private void BranchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchFieldActionPerformed
        // TODO add your handling code here:
        branch = BranchField.getText();
    }//GEN-LAST:event_BranchFieldActionPerformed

    private void WorkingPlaceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkingPlaceComboBoxActionPerformed
        // TODO add your handling code here:
        hospital =(String) WorkingPlaceComboBox.getSelectedItem();
    }//GEN-LAST:event_WorkingPlaceComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BiographyField;
    private javax.swing.JTextField BranchField;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField SurnameField;
    private javax.swing.JComboBox WorkingPlaceComboBox;
    private javax.swing.JTextField cerNoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
