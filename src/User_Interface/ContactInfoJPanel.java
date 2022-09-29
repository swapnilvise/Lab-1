/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Model.Product;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author swapn
 */
public class ContactInfoJPanel extends javax.swing.JPanel {
    
    Product product;
    private boolean errorcode_TelephoneNo;
    private boolean errorcode_AlternateTelephoneNo;
    private boolean errorcode_EmailAddress;

    /**
     * Creates new form ContactJPanel
     */
    public ContactInfoJPanel(Product product) {
        initComponents();
        this.product = product ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_LocalNo = new javax.swing.JLabel();
        lbl_FaxNo = new javax.swing.JLabel();
        lbl_EmailAddress = new javax.swing.JLabel();
        lbl_CountryCode = new javax.swing.JLabel();
        txt_CountryCode = new javax.swing.JTextField();
        txt_LocalNo = new javax.swing.JTextField();
        txt_FaxNo = new javax.swing.JTextField();
        txt_EmailAddress = new javax.swing.JTextField();
        lbl_AlternateNo = new javax.swing.JLabel();
        txt_AlternateNo = new javax.swing.JTextField();
        lbl_Contactinfo_Title = new javax.swing.JLabel();
        lbl_Save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_Warning = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_LocalNo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lbl_LocalNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_LocalNo.setText("* Local Telephone Number : ");
        lbl_LocalNo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbl_LocalNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 143, -1, -1));

        lbl_FaxNo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lbl_FaxNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FaxNo.setText("Fax Number : ");
        lbl_FaxNo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbl_FaxNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        lbl_EmailAddress.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lbl_EmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EmailAddress.setText("* Email Address : ");
        lbl_EmailAddress.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbl_EmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        lbl_CountryCode.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lbl_CountryCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_CountryCode.setText("* Country Code : ");
        lbl_CountryCode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbl_CountryCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 101, -1, -1));

        txt_CountryCode.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_CountryCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_CountryCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 98, 220, -1));

        txt_LocalNo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_LocalNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_LocalNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 140, 220, -1));

        txt_FaxNo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_FaxNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_FaxNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 218, 220, -1));

        txt_EmailAddress.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_EmailAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_EmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 257, 220, -1));

        lbl_AlternateNo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lbl_AlternateNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AlternateNo.setText("  Alternate Telephone Number : ");
        lbl_AlternateNo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbl_AlternateNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txt_AlternateNo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_AlternateNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_AlternateNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 179, 220, -1));

        lbl_Contactinfo_Title.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        lbl_Contactinfo_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Contactinfo_Title.setText("CONTACT INFORMATION");
        lbl_Contactinfo_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(lbl_Contactinfo_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 11, -1, -1));

        lbl_Save.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lbl_Save.setText("Save");
        lbl_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_SaveActionPerformed(evt);
            }
        });
        add(lbl_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 296, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_Interface/Get in touch.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        lbl_Warning.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        lbl_Warning.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Warning.setText("All fields marked with * are Mandatory.");
        add(lbl_Warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_SaveActionPerformed
        // TODO add your handling code here:
        
        errorcode_TelephoneNo = Pattern.matches("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", txt_LocalNo.getText()); 
        errorcode_AlternateTelephoneNo = Pattern.matches("{10}[0-9]", txt_LocalNo.getText());
        
        errorcode_EmailAddress = Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", txt_EmailAddress.getText());
        
        if (txt_CountryCode.getText().isBlank() || txt_LocalNo.getText().isBlank() || txt_EmailAddress.getText().isBlank()) 
            JOptionPane.showMessageDialog(this, "Mandatory fields cannot be blank.");
        else if (errorcode_TelephoneNo == false)
            JOptionPane.showMessageDialog(this, "Invalid Telephone Number.");
        else if (txt_AlternateNo.getText().isBlank() != true)
        {   errorcode_AlternateTelephoneNo = Pattern.matches("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", txt_AlternateNo.getText());
            if (errorcode_AlternateTelephoneNo == false)
                JOptionPane.showMessageDialog(this, "Invalid Alternate Number.");
        }
        else if (errorcode_EmailAddress == false)
            JOptionPane.showMessageDialog(this, "Invalid Email Address.");
        else
        {   product.setCountry_Code(txt_CountryCode.getText());
            product.setLocal_Telephone_Number(txt_LocalNo.getText());
            product.setAlternate_Telephone_Number(txt_AlternateNo.getText());
            product.setFax_Number(txt_FaxNo.getText());
            product.setEmail_Address(txt_EmailAddress.getText());
            JOptionPane.showMessageDialog(this, "Contact Information has been Saved.");
        }
    }//GEN-LAST:event_lbl_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_AlternateNo;
    private javax.swing.JLabel lbl_Contactinfo_Title;
    private javax.swing.JLabel lbl_CountryCode;
    private javax.swing.JLabel lbl_EmailAddress;
    private javax.swing.JLabel lbl_FaxNo;
    private javax.swing.JLabel lbl_LocalNo;
    private javax.swing.JButton lbl_Save;
    private javax.swing.JLabel lbl_Warning;
    private javax.swing.JTextField txt_AlternateNo;
    private javax.swing.JTextField txt_CountryCode;
    private javax.swing.JTextField txt_EmailAddress;
    private javax.swing.JTextField txt_FaxNo;
    private javax.swing.JTextField txt_LocalNo;
    // End of variables declaration//GEN-END:variables
}