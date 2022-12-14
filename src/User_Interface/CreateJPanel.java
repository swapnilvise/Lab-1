/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Model.Product;

/**
 *
 * @author swapn
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    Product product;

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(Product product) {
        initComponents();
        this.product = product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btn_Contact_Info = new javax.swing.JButton();
        btn_Health_Records = new javax.swing.JButton();
        btn_Bank_Records = new javax.swing.JButton();
        btn_Vehicle_Device_info = new javax.swing.JButton();
        btn_ProfessionalNetwork_info = new javax.swing.JButton();
        btn_Personal_Info = new javax.swing.JButton();
        btn_Address = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 346));

        btn_Contact_Info.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btn_Contact_Info.setText("Contact Info");
        btn_Contact_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Contact_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Contact_InfoActionPerformed(evt);
            }
        });

        btn_Health_Records.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btn_Health_Records.setText("Health Records");
        btn_Health_Records.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Health_Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Health_RecordsActionPerformed(evt);
            }
        });

        btn_Bank_Records.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btn_Bank_Records.setText("Bank Records");
        btn_Bank_Records.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Bank_Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bank_RecordsActionPerformed(evt);
            }
        });

        btn_Vehicle_Device_info.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btn_Vehicle_Device_info.setText("Vehicle / Device Info");
        btn_Vehicle_Device_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Vehicle_Device_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Vehicle_Device_infoActionPerformed(evt);
            }
        });

        btn_ProfessionalNetwork_info.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btn_ProfessionalNetwork_info.setText("Professional Network Info");
        btn_ProfessionalNetwork_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProfessionalNetwork_infoActionPerformed(evt);
            }
        });

        btn_Personal_Info.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btn_Personal_Info.setText("Personal Info");
        btn_Personal_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Personal_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Personal_InfoActionPerformed(evt);
            }
        });

        btn_Address.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btn_Address.setText("Address Info");
        btn_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ProfessionalNetwork_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Vehicle_Device_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Bank_Records, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Health_Records, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Contact_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Personal_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btn_Personal_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Address)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Contact_Info)
                .addGap(16, 16, 16)
                .addComponent(btn_Health_Records)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Bank_Records)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Vehicle_Device_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ProfessionalNetwork_info)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Personal_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Personal_InfoActionPerformed
        PersonalInfoJPanel personalinfopanel = new PersonalInfoJPanel(product);
        splitPane.setRightComponent(personalinfopanel);

    }//GEN-LAST:event_btn_Personal_InfoActionPerformed

    private void btn_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddressActionPerformed
        // TODO add your handling code here:
        AddressJPanel addressinfopanel = new AddressJPanel(product);
        splitPane.setRightComponent(addressinfopanel);
    }//GEN-LAST:event_btn_AddressActionPerformed

    private void btn_Contact_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Contact_InfoActionPerformed
        // TODO add your handling code here:
        ContactInfoJPanel contactinfopanel = new ContactInfoJPanel(product);
        splitPane.setRightComponent(contactinfopanel);
    }//GEN-LAST:event_btn_Contact_InfoActionPerformed

    private void btn_Health_RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Health_RecordsActionPerformed
        // TODO add your handling code here:
        HealthRecordJPanel healthrecordpanel = new HealthRecordJPanel(product);
        splitPane.setRightComponent(healthrecordpanel);
    }//GEN-LAST:event_btn_Health_RecordsActionPerformed

    private void btn_Vehicle_Device_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Vehicle_Device_infoActionPerformed
        // TODO add your handling code here:
        VehicleInfoJPanel vehicleinfopanel = new VehicleInfoJPanel(product);
        splitPane.setRightComponent(vehicleinfopanel);
    }//GEN-LAST:event_btn_Vehicle_Device_infoActionPerformed

    private void btn_Bank_RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bank_RecordsActionPerformed
        // TODO add your handling code here:
        BankRecordsJPanel bankrecordspanel = new BankRecordsJPanel(product);
        splitPane.setRightComponent(bankrecordspanel);
    }//GEN-LAST:event_btn_Bank_RecordsActionPerformed

    private void btn_ProfessionalNetwork_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProfessionalNetwork_infoActionPerformed
        // TODO add your handling code here:
        ProfessionalNetworkInfoJPanel professionalnetworkpanel = new ProfessionalNetworkInfoJPanel(product);
        splitPane.setRightComponent(professionalnetworkpanel);
    }//GEN-LAST:event_btn_ProfessionalNetwork_infoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Address;
    private javax.swing.JButton btn_Bank_Records;
    private javax.swing.JButton btn_Contact_Info;
    private javax.swing.JButton btn_Health_Records;
    private javax.swing.JButton btn_Personal_Info;
    private javax.swing.JButton btn_ProfessionalNetwork_info;
    private javax.swing.JButton btn_Vehicle_Device_info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
