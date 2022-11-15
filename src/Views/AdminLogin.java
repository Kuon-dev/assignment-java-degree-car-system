/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lim Li Ping
 */
public class AdminLogin extends javax.swing.JFrame {

  /**
   * Creates new form AdminLogin
   */
  public AdminLogin() {
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
    StaffIDLab = new javax.swing.JLabel();
    PswLab = new javax.swing.JLabel();
    StaffIDTxt = new javax.swing.JTextField();
    PswTxt = new javax.swing.JPasswordField();
    AdminLoginLab = new javax.swing.JLabel();
    Title = new javax.swing.JLabel();
    AdminIDLab1 = new javax.swing.JLabel();
    PswLab1 = new javax.swing.JLabel();
    AdminIDTxt = new javax.swing.JTextField();
    PswTxt1 = new javax.swing.JPasswordField();
    ExitBtn1 = new javax.swing.JButton();
    LoginBtn1 = new javax.swing.JButton();

    StaffIDLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    StaffIDLab.setForeground(new java.awt.Color(140, 174, 238));
    StaffIDLab.setText("Staff ID:");

    PswLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab.setForeground(new java.awt.Color(140, 174, 238));
    PswLab.setText("Password:");

    StaffIDTxt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    StaffIDTxt.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          StaffIDTxtActionPerformed(evt);
        }
      }
    );

    PswTxt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    AdminLoginLab.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
    AdminLoginLab.setForeground(new java.awt.Color(0, 51, 204));
    AdminLoginLab.setText("Admin Login");

    Title.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    Title.setForeground(new java.awt.Color(0, 51, 153));
    Title.setText("Welcome to Car Rental System");

    AdminIDLab1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    AdminIDLab1.setForeground(new java.awt.Color(140, 174, 238));
    AdminIDLab1.setText("Admin ID:");

    PswLab1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab1.setForeground(new java.awt.Color(140, 174, 238));
    PswLab1.setText("Password:");

    AdminIDTxt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    AdminIDTxt.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          AdminIDTxtActionPerformed(evt);
        }
      }
    );

    PswTxt1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    ExitBtn1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    ExitBtn1.setForeground(new java.awt.Color(0, 102, 204));
    ExitBtn1.setText("Exit");
    ExitBtn1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          ExitBtn1ActionPerformed(evt);
        }
      }
    );

    LoginBtn1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    LoginBtn1.setForeground(new java.awt.Color(0, 102, 204));
    LoginBtn1.setText("Login");
    LoginBtn1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LoginBtn1ActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(AdminIDLab1)
                        .addComponent(PswLab1)
                    )
                    .addGap(77, 77, 77)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addComponent(
                          AdminIDTxt,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          PswTxt1,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(Title)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(AdminLoginLab)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(
                      ExitBtn1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      73,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(87, 87, 87)
                    .addComponent(LoginBtn1)
                )
            )
            .addContainerGap(39, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(Title)
            .addGap(18, 18, 18)
            .addComponent(AdminLoginLab)
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  AdminIDLab1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  AdminIDTxt,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(31, 31, 31)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  PswTxt1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  PswLab1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ExitBtn1)
                .addComponent(LoginBtn1)
            )
            .addContainerGap(15, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void StaffIDTxtActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_StaffIDTxtActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_StaffIDTxtActionPerformed

  private void AdminIDTxtActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_AdminIDTxtActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_AdminIDTxtActionPerformed

  private void ExitBtn1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ExitBtn1ActionPerformed
    //Call the exit system function
    exitSystem exit = new exitSystem();
    exit.exitsystem();
  } //GEN-LAST:event_ExitBtn1ActionPerformed

  private void LoginBtn1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_LoginBtn1ActionPerformed
    String adminName, adminPassword, admin;

    //Retrieve data input
    adminName = AdminIDTxt.getText();
    adminPassword = PswTxt1.getText();

    //Set data stored in variables
    UserAdmin adminUser = new UserAdmin("001", null, null, null, null, null);
    Validator valid = new Validator();
    GeneralMutation m = new GeneralMutation();

    Boolean loginCheck = adminUser.login(adminName, adminPassword);
    if (loginCheck) {
      AdminMenu menu = new AdminMenu();
      GeneralGetters g = new GeneralGetters();
      // fetch current user data
      // pass data to admin menu
      menu.setCurrentAdminData(g.getSpecificAdmin("0")); // needs to change
      m.logLoginActivity(g.getSpecificAdmin("0"));
      menu.setVisible(true);
      dispose();
    }
    //Check if data input is empty
    else if (adminName.isEmpty() || adminPassword.isEmpty()) {
      //If data input is empty then display login failed
      JOptionPane.showMessageDialog(
        this,
        "Login Failed! \nPlease fill up all information.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
    } else {
      //Display incorrect data input message
      JOptionPane.showMessageDialog(
        this,
        "Login Failed! \nIncorrect Staff ID or Password.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      this.AdminIDTxt.setText("");
      this.PswTxt.setText("");
    }
    //Clear the JTextField
  } //GEN-LAST:event_LoginBtn1ActionPerformed

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
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger
        .getLogger(AdminLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(AdminLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(AdminLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(AdminLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new AdminLogin().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel AdminIDLab1;
  private javax.swing.JTextField AdminIDTxt;
  private javax.swing.JLabel AdminLoginLab;
  private javax.swing.JButton ExitBtn1;
  private javax.swing.JButton LoginBtn1;
  private javax.swing.JLabel PswLab;
  private javax.swing.JLabel PswLab1;
  private javax.swing.JPasswordField PswTxt;
  private javax.swing.JPasswordField PswTxt1;
  private javax.swing.JLabel StaffIDLab;
  private javax.swing.JTextField StaffIDTxt;
  private javax.swing.JLabel Title;
  // End of variables declaration//GEN-END:variables
}
