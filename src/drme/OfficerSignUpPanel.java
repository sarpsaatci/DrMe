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
public class OfficerSignUpPanel extends javax.swing.JPanel {
String name, surname, ssn, ID, hospital;
    /**
     * Creates new form OfficerSignUpPanel
     */
    public OfficerSignUpPanel() {
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

        WorkingPlaceComboBox = new javax.swing.JComboBox();
        NameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SurnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SSNField = new javax.swing.JTextField();

        WorkingPlaceComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATATÜRK HASTANESİ" }));
        WorkingPlaceComboBox.setToolTipText("");
        WorkingPlaceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkingPlaceComboBoxActionPerformed(evt);
            }
        });

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Surname : ");

        SurnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurnameFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Working Place : ");

        jLabel1.setText("Name : ");

        jLabel2.setText("SSN : ");

        SSNField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WorkingPlaceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NameField)
                        .addComponent(SurnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addComponent(SSNField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SSNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(WorkingPlaceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void WorkingPlaceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkingPlaceComboBoxActionPerformed
        // TODO add your handling code here:
        hospital =(String) WorkingPlaceComboBox.getSelectedItem();
    }//GEN-LAST:event_WorkingPlaceComboBoxActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
        name = NameField.getText();
    }//GEN-LAST:event_NameFieldActionPerformed

    private void SurnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurnameFieldActionPerformed
        // TODO add your handling code here:
        surname = SurnameField.getText();
    }//GEN-LAST:event_SurnameFieldActionPerformed

    private void SSNFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNFieldActionPerformed
        // TODO add your handling code here:
        ssn = SSNField.getText();
    }//GEN-LAST:event_SSNFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField NameField;
    public javax.swing.JTextField SSNField;
    public javax.swing.JTextField SurnameField;
    public javax.swing.JComboBox WorkingPlaceComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
