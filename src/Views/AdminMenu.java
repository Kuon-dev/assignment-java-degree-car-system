/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.util.*;

/**
 *
 * @author Lim Li Ping
 */
public class AdminMenu extends javax.swing.JFrame {

  private UserAdmin adminData = new UserAdmin(
    null,
    null,
    null,
    null,
    null,
    null
  );

  /**
   * Creates new form AdminMenu
   */
  public AdminMenu() {
    initComponents();
  }

  public void setCurrentAdminData(UserAdmin data) {
    this.adminData = data;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    Title = new javax.swing.JLabel();
    AdminLoginLab = new javax.swing.JLabel();
    LoginBtn1 = new javax.swing.JButton();
    ManageCarBtn = new javax.swing.JButton();
    LoginBtn3 = new javax.swing.JButton();
    LoginBtn4 = new javax.swing.JButton();
    LoginBtn5 = new javax.swing.JButton();
    ExitBtn1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    Title.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    Title.setForeground(new java.awt.Color(0, 51, 153));
    Title.setText("Welcome to Car Rental System");

    AdminLoginLab.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
    AdminLoginLab.setForeground(new java.awt.Color(0, 51, 204));
    AdminLoginLab.setText("Admin Menu");

    LoginBtn1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    LoginBtn1.setForeground(new java.awt.Color(0, 102, 204));
    LoginBtn1.setText("Register Admin Account");
    LoginBtn1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LoginBtn1ActionPerformed(evt);
        }
      }
    );

    ManageCarBtn.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    ManageCarBtn.setForeground(new java.awt.Color(0, 102, 204));
    ManageCarBtn.setText("Manage Car");
    ManageCarBtn.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          ManageCarBtnActionPerformed(evt);
        }
      }
    );

    LoginBtn3.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    LoginBtn3.setForeground(new java.awt.Color(0, 102, 204));
    LoginBtn3.setText("Manage Customer's Booking");
    LoginBtn3.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LoginBtn3ActionPerformed(evt);
        }
      }
    );

    LoginBtn4.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    LoginBtn4.setForeground(new java.awt.Color(0, 102, 204));
    LoginBtn4.setText("Manage Personal Information");
    LoginBtn4.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LoginBtn4ActionPerformed(evt);
        }
      }
    );

    LoginBtn5.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    LoginBtn5.setForeground(new java.awt.Color(0, 102, 204));
    LoginBtn5.setText("View Sales Report");
    LoginBtn5.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LoginBtn5ActionPerformed(evt);
        }
      }
    );

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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(
                  LoginBtn4,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  275,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(LoginBtn3)
                    .addGap(11, 11, 11)
                )
            )
            .addGap(97, 97, 97)
        )
        .addGroup(
          layout
            .createSequentialGroup()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(LoginBtn1)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(LoginBtn5)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                      ExitBtn1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      73,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(Title)
                )
            )
            .addContainerGap(57, Short.MAX_VALUE)
        )
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(161, 161, 161)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AdminLoginLab)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(ManageCarBtn)
                )
            )
            .addGap(0, 0, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(ExitBtn1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Title)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addComponent(AdminLoginLab)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              13,
              Short.MAX_VALUE
            )
            .addComponent(ManageCarBtn)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addComponent(LoginBtn5)
            .addGap(13, 13, 13)
            .addComponent(LoginBtn1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(LoginBtn3)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addComponent(LoginBtn4)
            .addContainerGap()
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void LoginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO register account
    //
    System.out.println(adminData.getName());
    RegisterAdmin registerMenu = new RegisterAdmin();
    registerMenu.setVisible(true);
    dispose();
  } //GEN-FIRST:event_LoginBtn1ActionPerformed //GEN-LAST:event_LoginBtn1ActionPerformed

  private void ManageCarBtnActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ManageCarBtnActionPerformed
    // TODO add your handling code here:
    ManageCar manageCarMenu = new ManageCar();
    manageCarMenu.setVisible(true);
    dispose();
  }

  private void LoginBtn3ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_LoginBtn3ActionPerformed
    // TODO manage booking
    System.out.println("This is action 3 btn");
  }

  private void LoginBtn4ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_LoginBtn4ActionPerformed
    // TODO manage personal info
    System.out.println("This is action 4 btn");
  }

  private void LoginBtn5ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_LoginBtn5ActionPerformed
    // TODO sales report
  }

  private void ExitBtn1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ExitBtn1ActionPerformed
    //Call the exit system function
    exitSystem exit = new exitSystem();
    exit.exitsystem();
  } //GEN-LAST:event_ExitBtn1ActionPerformed

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
        .getLogger(AdminMenu.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(AdminMenu.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(AdminMenu.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(AdminMenu.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new AdminMenu().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel AdminLoginLab;
  private javax.swing.JButton ExitBtn1;
  private javax.swing.JButton LoginBtn1;
  private javax.swing.JButton LoginBtn3;
  private javax.swing.JButton LoginBtn4;
  private javax.swing.JButton LoginBtn5;
  private javax.swing.JButton ManageCarBtn;
  private javax.swing.JLabel Title;
  // End of variables declaration//GEN-END:variables
}
