/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Lim Li Ping
 */
public class MemberLogin extends javax.swing.JFrame {

  /**
   * Creates new form MemberLogin
   */
  public MemberLogin() {
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
    StaffIDTxt = new javax.swing.JTextField();
    PswTxt = new javax.swing.JPasswordField();
    StaffIDLab = new javax.swing.JLabel();
    PswLab = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    PswTxt2 = new javax.swing.JPasswordField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    CustIDLab1 = new javax.swing.JLabel();
    PswLab2 = new javax.swing.JLabel();
    CustIDTxt = new javax.swing.JTextField();
    ExitBtn2 = new javax.swing.JButton();
    LoginBtn2 = new javax.swing.JButton();

    StaffIDTxt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    StaffIDTxt.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          StaffIDTxtActionPerformed(evt);
        }
      }
    );

    PswTxt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    StaffIDLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    StaffIDLab.setForeground(new java.awt.Color(140, 174, 238));
    StaffIDLab.setText("Staff ID:");

    PswLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab.setForeground(new java.awt.Color(140, 174, 238));
    PswLab.setText("Password:");

    jButton1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(0, 102, 204));
    jButton1.setText("Exit");
    jButton1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton1ActionPerformed(evt);
        }
      }
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    PswTxt2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 204));
    jLabel1.setText("Member Login");

    jLabel2.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 51, 153));
    jLabel2.setText("Welcome to Car Rental System");

    CustIDLab1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab1.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab1.setText("IC:");

    PswLab2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab2.setForeground(new java.awt.Color(140, 174, 238));
    PswLab2.setText("Password:");

    CustIDTxt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDTxt.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          CustIDTxtActionPerformed(evt);
        }
      }
    );

    ExitBtn2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    ExitBtn2.setForeground(new java.awt.Color(0, 102, 204));
    ExitBtn2.setText("Exit");
    ExitBtn2.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          ExitBtn2ActionPerformed(evt);
        }
      }
    );

    LoginBtn2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    LoginBtn2.setForeground(new java.awt.Color(0, 102, 204));
    LoginBtn2.setText("Login");
    LoginBtn2.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LoginBtn2ActionPerformed(evt);
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
                    .addGap(43, 43, 43)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addComponent(CustIDLab1)
                        .addComponent(PswLab2)
                    )
                    .addGap(58, 58, 58)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(
                          CustIDTxt,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          PswTxt2,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel2)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jLabel1)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(
                      ExitBtn2,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      73,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(76, 76, 76)
                    .addComponent(LoginBtn2)
                )
            )
            .addContainerGap(35, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  CustIDLab1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  CustIDTxt,
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
                  PswTxt2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  PswLab2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ExitBtn2)
                .addComponent(LoginBtn2)
            )
            .addContainerGap(15, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void StaffIDTxtActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_StaffIDTxtActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_StaffIDTxtActionPerformed

  private void CustIDTxtActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_CustIDTxtActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_CustIDTxtActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_jButton1ActionPerformed

  private void ExitBtn2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ExitBtn2ActionPerformed
    //Call the exit system function
    exitSystem exit = new exitSystem();
    exit.exitsystem();
  } //GEN-LAST:event_ExitBtn2ActionPerformed

  private void LoginBtn2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_LoginBtn2ActionPerformed
    String CustID, Password, admin;

    //Retrieve data input
    CustID = StaffIDTxt.getText();
    Password = PswTxt.getText();

    //Set data stored in variables
    String staffid = "Admin";
    String pass = "Admin123";

    //Check if the data input correct
    if (CustID.equals(staffid) && Password.equals(pass)) {
      //If data correct then go to main menu
      AdminMenu menu = new AdminMenu();
      menu.setVisible(true);
      dispose();
    }
    //Check if data input is empty
    else if (CustID.equals("") || Password.equals("")) {
      //If data input is empty then display login failed
      JOptionPane.showMessageDialog(
        this,
        "Login Failed! \nPlease fill up all information.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );

      //Clear the JTextField
      this.CustIDTxt.setText("");
      this.PswTxt.setText("");
    }
    //Check if data not found
    else {
      //Display incorrect data input message
      JOptionPane.showMessageDialog(
        this,
        "Login Failed! \nIncorrect Staff ID or Password.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );

      //Clear the JTextField
      this.CustIDTxt.setText("");
      this.PswTxt.setText("");
    }
  } //GEN-LAST:event_LoginBtn2ActionPerformed

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
        .getLogger(MemberLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(MemberLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(MemberLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(MemberLogin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new MemberLogin().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel CustIDLab1;
  private javax.swing.JTextField CustIDTxt;
  private javax.swing.JButton ExitBtn2;
  private javax.swing.JButton LoginBtn2;
  private javax.swing.JLabel PswLab;
  private javax.swing.JLabel PswLab2;
  private javax.swing.JPasswordField PswTxt;
  private javax.swing.JPasswordField PswTxt2;
  private javax.swing.JLabel StaffIDLab;
  private javax.swing.JTextField StaffIDTxt;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  // End of variables declaration//GEN-END:variables
}
