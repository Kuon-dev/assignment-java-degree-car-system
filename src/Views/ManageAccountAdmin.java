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
public class ManageAccountAdmin extends javax.swing.JFrame {

  public UserAdmin currentAdminData = new UserAdmin(
    null,
    null,
    null,
    null,
    null,
    null
  );

  public void setCurrentAdminData(UserAdmin data) {
    this.currentAdminData = data;
  }

  /**
   * Creates new form ManageAccountAdmin
   */
  public ManageAccountAdmin() {
    initComponents();
  }

  private Boolean sanitizeInput() {
    ArrayList<String> data = new ArrayList<>();
    data.add(ID.getText());
    data.add(Name.getText());
    data.add(Email.getText());
    data.add(PhNum.getText());
    data.add(Position.getSelectedItem().toString());
    data.add(Password.getText());
    data.add(ConfPass.getText());

    // if there's an empty input, return false
    for (String d : data) {
      if (d.isEmpty()) return false;
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
    LoginBtn2 = new javax.swing.JButton();
    CustIDLab1 = new javax.swing.JLabel();
    CustIDLab4 = new javax.swing.JLabel();
    CustIDLab2 = new javax.swing.JLabel();
    CustIDLab3 = new javax.swing.JLabel();
    PswLab4 = new javax.swing.JLabel();
    PswLab2 = new javax.swing.JLabel();
    PswLab3 = new javax.swing.JLabel();
    ID = new javax.swing.JTextField();
    Name = new javax.swing.JTextField();
    Email = new javax.swing.JTextField();
    PhNum = new javax.swing.JTextField();
    Position = new javax.swing.JComboBox<>();
    Password = new javax.swing.JPasswordField();
    ConfPass = new javax.swing.JPasswordField();
    MenuBut = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 204));
    jLabel1.setText("Manage Account");

    jLabel2.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 51, 153));
    jLabel2.setText("Welcome to Car Rental System");

    LoginBtn2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    LoginBtn2.setForeground(new java.awt.Color(0, 102, 204));
    LoginBtn2.setText("Save Changes");
    LoginBtn2.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LoginBtn2ActionPerformed(evt);
        }
      }
    );

    CustIDLab1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab1.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab1.setText("Admin ID:");

    CustIDLab4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab4.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab4.setText("Name:");

    CustIDLab2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab2.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab2.setText("Email:");

    CustIDLab3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab3.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab3.setText("Phone Number:");

    PswLab4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab4.setForeground(new java.awt.Color(140, 174, 238));
    PswLab4.setText("Position:");

    PswLab2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab2.setForeground(new java.awt.Color(140, 174, 238));
    PswLab2.setText("Password:");

    PswLab3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab3.setForeground(new java.awt.Color(140, 174, 238));
    PswLab3.setText("Confirm Password:");

    ID.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    ID.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          IDActionPerformed(evt);
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

    Email.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    Email.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          EmailActionPerformed(evt);
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

    Position.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Manager", "Receiptionist", " " }
      )
    );

    Password.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    ConfPass.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    MenuBut.setBackground(new java.awt.Color(153, 204, 255));
    MenuBut.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    MenuBut.setForeground(new java.awt.Color(0, 102, 255));
    MenuBut.setText("Main Menu");

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
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
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
                                .addComponent(CustIDLab4)
                                .addComponent(CustIDLab1)
                                .addComponent(PswLab2)
                                .addComponent(PswLab3)
                                .addComponent(CustIDLab2)
                                .addComponent(PswLab4)
                            )
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                              javax.swing.GroupLayout.DEFAULT_SIZE,
                              Short.MAX_VALUE
                            )
                        )
                        .addGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          layout
                            .createSequentialGroup()
                            .addContainerGap(
                              javax.swing.GroupLayout.DEFAULT_SIZE,
                              Short.MAX_VALUE
                            )
                            .addComponent(MenuBut)
                            .addGap(18, 18, 18)
                        )
                    )
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          layout
                            .createParallelGroup(
                              javax.swing.GroupLayout.Alignment.LEADING
                            )
                            .addComponent(LoginBtn2)
                            .addGroup(
                              layout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING
                                )
                                .addComponent(
                                  Position,
                                  javax.swing.GroupLayout.Alignment.TRAILING,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  192,
                                  javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                                .addComponent(
                                  Password,
                                  javax.swing.GroupLayout.Alignment.TRAILING,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  192,
                                  javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                            )
                        )
                        .addComponent(
                          Email,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          PhNum,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          ConfPass,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          ID,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          Name,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          192,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
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
                            .addGap(106, 106, 106)
                            .addComponent(jLabel1)
                        )
                    )
                    .addGap(0, 0, Short.MAX_VALUE)
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
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
                  ID,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  32,
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
                  32,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
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
                  32,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
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
                  32,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  PswLab4,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(
                      Position,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      30,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  PswLab2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  Password,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  35,
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
                  35,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(19, 19, 19)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(LoginBtn2)
                .addComponent(MenuBut)
            )
            .addContainerGap()
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void LoginBtn2ActionPerformed(java.awt.event.ActionEvent evt) {}

  private void EmailActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_EmailActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_EmailActionPerformed

  private void IDActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_IDActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_IDActionPerformed

  private void NameActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_NameActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_NameActionPerformed

  private void PhNumActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_PhNumActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_PhNumActionPerformed

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
        .getLogger(ManageAccountAdmin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(ManageAccountAdmin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(ManageAccountAdmin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(ManageAccountAdmin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new ManageAccountAdmin().setVisible(true);
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
  private javax.swing.JTextField ID;
  private javax.swing.JButton LoginBtn2;
  private javax.swing.JButton MenuBut;
  private javax.swing.JTextField Name;
  private javax.swing.JPasswordField Password;
  private javax.swing.JTextField PhNum;
  private javax.swing.JComboBox<String> Position;
  private javax.swing.JLabel PswLab2;
  private javax.swing.JLabel PswLab3;
  private javax.swing.JLabel PswLab4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  // End of variables declaration//GEN-END:variables
}
