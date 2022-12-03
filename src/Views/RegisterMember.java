/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lim Li Ping
 */
public class RegisterMember extends javax.swing.JFrame {

  /**
   * Creates new form RegisterMember
   */
  public RegisterMember() {
    initComponents();
  }

  public UserCustomer currentCustomerData = new UserCustomer(
    null,
    null,
    null,
    null,
    null
  );

  public void setCurrentCustomerData(UserCustomer data) {
    this.currentCustomerData = data;
  }

  private Boolean sanitizeInput() {
    String pass = this.Password.getText();
    String confirmed = this.ConfPass.getText();
    String phnumEntered = this.PhNum.getText();
    String emailEntered = this.Email.getText();
    String icEntered = this.IC.getText();
    if (icEntered.length() != (12)) {
      JOptionPane.showMessageDialog(
        this,
        "Incorrect IC.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      this.IC.setText("");
      return false;
    }
    if (!emailEntered.contains("@") || !emailEntered.contains(".com")) {
      JOptionPane.showMessageDialog(
        this,
        "Incorrect Email.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      this.Email.setText("");
      return false;
    }
    if ((phnumEntered.length() != (10)) && (phnumEntered.length() != (11))) {
      JOptionPane.showMessageDialog(
        this,
        "Incorrect Phone Number.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      this.PhNum.setText("");
      return false;
    }
    if (!confirmed.equals(pass)) {
      JOptionPane.showMessageDialog(
        this,
        "Password does not matched.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      this.Password.setText("");
      this.ConfPass.setText("");
      return false;
    }
    {
      ArrayList<String> data = new ArrayList<>();
      data.add(IC.getText().replace("-", ""));
      data.add(Name.getText());
      data.add(Email.getText());
      data.add(PhNum.getText().replace("-", ""));
      data.add(Password.getText());
      data.add(ConfPass.getText());

      // if there's an empty input, return false
      for (String d : data) {
        if (d.isEmpty()) {
          JOptionPane.showMessageDialog(
            this,
            "Fill in all the inputs",
            "Information",
            JOptionPane.INFORMATION_MESSAGE
          );
          return false;
        }
      }
      return true;
    }
  }

  private Boolean isUserExist() {
    Validator v = new Validator();
    if (v.isCustomerICExist(IC.getText().replace("-", ""))) {
      JOptionPane.showMessageDialog(
        this,
        "IC Existed",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      IC.setText("");
      return false;
    }
    if (v.isCustomerPhNumExist(PhNum.getText().replace("-", ""))) {
      JOptionPane.showMessageDialog(
        this,
        "Phone Number Existed",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      PhNum.setText("");
      return false;
    }
    if (v.isCustomerEmailExist(Email.getText())) {
      JOptionPane.showMessageDialog(
        this,
        "Email Existed",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      Email.setText("");
      return false;
    }
    return true;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    CustIDLab1 = new javax.swing.JLabel();
    PswLab2 = new javax.swing.JLabel();
    IC = new javax.swing.JTextField();
    ExitBtn2 = new javax.swing.JButton();
    RegisterBtn = new javax.swing.JButton();
    PswLab3 = new javax.swing.JLabel();
    CustIDLab2 = new javax.swing.JLabel();
    CustIDLab3 = new javax.swing.JLabel();
    CustIDLab4 = new javax.swing.JLabel();
    ConfPass = new javax.swing.JPasswordField();
    Password = new javax.swing.JPasswordField();
    Email = new javax.swing.JTextField();
    Name = new javax.swing.JTextField();
    PhNum = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 204));
    jLabel1.setText("Register As Member");

    jLabel2.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 51, 153));
    jLabel2.setText("Welcome to Car Rental System");

    CustIDLab1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab1.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab1.setText("IC:");

    PswLab2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab2.setForeground(new java.awt.Color(140, 174, 238));
    PswLab2.setText("Password:");

    IC.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    IC.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          ICActionPerformed(evt);
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

    RegisterBtn.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    RegisterBtn.setForeground(new java.awt.Color(0, 102, 204));
    RegisterBtn.setText("Register");
    RegisterBtn.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          RegisterBtnActionPerformed(evt);
        }
      }
    );

    PswLab3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab3.setForeground(new java.awt.Color(140, 174, 238));
    PswLab3.setText("Confirm Password:");

    CustIDLab2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab2.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab2.setText("Email:");

    CustIDLab3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab3.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab3.setText("Phone Number:");

    CustIDLab4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab4.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab4.setText("Name:");

    ConfPass.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    Password.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    Email.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    Email.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          EmailActionPerformed(evt);
        }
      }
    );

    Name.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    Name.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          NameActionPerformed(evt);
        }
      }
    );

    PhNum.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PhNum.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          PhNumActionPerformed(evt);
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
                .createParallelGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  false
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
                    .addGap(92, 92, 92)
                    .addComponent(
                      ExitBtn2,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      73,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(78, 78, 78)
                    .addComponent(RegisterBtn)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jLabel1)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addComponent(CustIDLab3)
                        .addGroup(
                          layout
                            .createParallelGroup(
                              javax.swing.GroupLayout.Alignment.LEADING
                            )
                            .addGroup(
                              layout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.TRAILING
                                )
                                .addComponent(CustIDLab4)
                                .addComponent(CustIDLab1)
                            )
                            .addComponent(CustIDLab2)
                        )
                        .addComponent(PswLab2)
                        .addComponent(PswLab3)
                    )
                    .addGap(31, 31, 31)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(
                          IC,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          Password,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          ConfPass,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          Email,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          Name,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          PhNum,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
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
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1)
            .addGap(16, 16, 16)
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
                  IC,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  CustIDLab4,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  Name,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  CustIDLab2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  Email,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  CustIDLab3,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  PhNum,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  PswLab2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  Password,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  PswLab3,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  ConfPass,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              37,
              Short.MAX_VALUE
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ExitBtn2)
                .addComponent(RegisterBtn)
            )
            .addContainerGap()
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void ICActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ICActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_ICActionPerformed

  private void ExitBtn2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ExitBtn2ActionPerformed
    //Call the exit system function
    exitSystem exit = new exitSystem();
    exit.exitsystem();
  } //GEN-LAST:event_ExitBtn2ActionPerformed

  private void EmailActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_EmailActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_EmailActionPerformed

  private void NameActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_NameActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_NameActionPerformed

  private void PhNumActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_PhNumActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_PhNumActionPerformed

  private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {
    GeneralMutation m = new GeneralMutation();
    if (!sanitizeInput()) return;
    if (!isUserExist()) return;
    UserCustomer newCustomerData = new UserCustomer(
      IC.getText().replace("-", ""),
      Name.getText(),
      Password.getText(),
      Email.getText(),
      PhNum.getText().replace("-", "")
    );
    if (m.addNewCustomer(newCustomerData)) {
      JOptionPane.showMessageDialog(
        this,
        "Record Added Successfully",
        "Information",
        JOptionPane.INFORMATION_MESSAGE
      );
      LoginMenu main = new LoginMenu();
      main.setVisible(true);
      dispose();
    } else JOptionPane.showMessageDialog(
      this,
      "Failed to add admin data",
      "Error Message",
      JOptionPane.ERROR_MESSAGE
    );
  }

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
        .getLogger(RegisterMember.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(RegisterMember.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(RegisterMember.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(RegisterMember.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new RegisterMember().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPasswordField ConfPass;
  private javax.swing.JLabel CustIDLab1;
  private javax.swing.JLabel CustIDLab2;
  private javax.swing.JLabel CustIDLab3;
  private javax.swing.JLabel CustIDLab4;
  private javax.swing.JTextField Email;
  private javax.swing.JButton ExitBtn2;
  private javax.swing.JTextField IC;
  private javax.swing.JTextField Name;
  private javax.swing.JPasswordField Password;
  private javax.swing.JTextField PhNum;
  private javax.swing.JLabel PswLab2;
  private javax.swing.JLabel PswLab3;
  private javax.swing.JButton RegisterBtn;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  // End of variables declaration//GEN-END:variables
}
