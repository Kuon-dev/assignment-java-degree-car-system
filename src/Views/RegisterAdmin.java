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
public class RegisterAdmin extends javax.swing.JFrame {

  private ArrayList<String> currentAdminData;

  /**
   * Creates new form RegisterAdmin
   */
  public RegisterAdmin() {
    initComponents();
  }

  public void setCurrentAdminData(ArrayList<String> data) {
    this.currentAdminData = data;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    ExitBtn2 = new javax.swing.JButton();
    LoginBtn2 = new javax.swing.JButton();
    PswLab3 = new javax.swing.JLabel();
    PswTxt3 = new javax.swing.JPasswordField();
    CustIDLab2 = new javax.swing.JLabel();
    PswTxt2 = new javax.swing.JPasswordField();
    CustIDLab3 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    CustIDLab4 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    PswTxt4 = new javax.swing.JPasswordField();
    CustIDLab1 = new javax.swing.JLabel();
    PswTxt5 = new javax.swing.JPasswordField();
    PswLab2 = new javax.swing.JLabel();
    PswTxt6 = new javax.swing.JPasswordField();
    CustIDTxt = new javax.swing.JTextField();
    PswLab4 = new javax.swing.JLabel();
    jComboBox1 = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
    LoginBtn2.setText("Register");
    LoginBtn2.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LoginBtn2ActionPerformed(evt);
        }
      }
    );

    PswLab3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab3.setForeground(new java.awt.Color(140, 174, 238));
    PswLab3.setText("Confirm Password:");

    PswTxt3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    CustIDLab2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab2.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab2.setText("Email:");

    PswTxt2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    CustIDLab3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab3.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab3.setText("Phone Number:");

    jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 204));
    jLabel1.setText("Register Admin");

    CustIDLab4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab4.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab4.setText("Name:");

    jLabel2.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 51, 153));
    jLabel2.setText("Welcome to Car Rental System");

    PswTxt4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    CustIDLab1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDLab1.setForeground(new java.awt.Color(140, 174, 238));
    CustIDLab1.setText("Admin ID:");

    PswTxt5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    PswLab2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab2.setForeground(new java.awt.Color(140, 174, 238));
    PswLab2.setText("Password:");

    PswTxt6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

    CustIDTxt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustIDTxt.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          CustIDTxtActionPerformed(evt);
        }
      }
    );

    PswLab4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    PswLab4.setForeground(new java.awt.Color(140, 174, 238));
    PswLab4.setText("Position:");

    jComboBox1.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }
      )
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
                    .addComponent(LoginBtn2)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          layout
                            .createSequentialGroup()
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
                            .addGroup(
                              layout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING
                                )
                                .addGroup(
                                  layout
                                    .createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(
                                      layout
                                        .createParallelGroup(
                                          javax.swing.GroupLayout.Alignment.LEADING
                                        )
                                        .addComponent(
                                          PswTxt2,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          192,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                        .addComponent(
                                          CustIDTxt,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          192,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                        .addComponent(
                                          PswTxt3,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          192,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                        .addComponent(
                                          PswTxt5,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          192,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                    )
                                )
                                .addGroup(
                                  javax.swing.GroupLayout.Alignment.TRAILING,
                                  layout
                                    .createSequentialGroup()
                                    .addPreferredGap(
                                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                                    )
                                    .addGroup(
                                      layout
                                        .createParallelGroup(
                                          javax.swing.GroupLayout.Alignment.LEADING
                                        )
                                        .addComponent(
                                          PswTxt4,
                                          javax.swing.GroupLayout.Alignment.TRAILING,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          192,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                        .addComponent(
                                          jComboBox1,
                                          javax.swing.GroupLayout.Alignment.TRAILING,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          192,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                        .addComponent(
                                          PswTxt6,
                                          javax.swing.GroupLayout.Alignment.TRAILING,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          192,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                    )
                                )
                            )
                        )
                        .addGroup(
                          layout
                            .createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(jLabel1)
                        )
                    )
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
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  CustIDLab1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  CustIDTxt,
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
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  CustIDLab4,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  PswTxt2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  35,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  CustIDLab2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  PswTxt3,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  35,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  CustIDLab3,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  39,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  PswTxt5,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  37,
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
                      jComboBox1,
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
                  PswTxt6,
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
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  PswLab3,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(
                      PswTxt4,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      42,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ExitBtn2)
                .addComponent(LoginBtn2)
            )
            .addContainerGap()
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void ExitBtn2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ExitBtn2ActionPerformed
    //Call the exit system function
    exitSystem exit = new exitSystem();
    exit.exitsystem();
  } //GEN-LAST:event_ExitBtn2ActionPerformed

  private void LoginBtn2ActionPerformed(java.awt.event.ActionEvent evt) {} //GEN-FIRST:event_LoginBtn2ActionPerformed //GEN-LAST:event_LoginBtn2ActionPerformed

  private void CustIDTxtActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_CustIDTxtActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_CustIDTxtActionPerformed

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
        .getLogger(RegisterAdmin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(RegisterAdmin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(RegisterAdmin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(RegisterAdmin.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new RegisterAdmin().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel CustIDLab1;
  private javax.swing.JLabel CustIDLab2;
  private javax.swing.JLabel CustIDLab3;
  private javax.swing.JLabel CustIDLab4;
  private javax.swing.JTextField CustIDTxt;
  private javax.swing.JButton ExitBtn2;
  private javax.swing.JButton LoginBtn2;
  private javax.swing.JLabel PswLab2;
  private javax.swing.JLabel PswLab3;
  private javax.swing.JLabel PswLab4;
  private javax.swing.JPasswordField PswTxt2;
  private javax.swing.JPasswordField PswTxt3;
  private javax.swing.JPasswordField PswTxt4;
  private javax.swing.JPasswordField PswTxt5;
  private javax.swing.JPasswordField PswTxt6;
  private javax.swing.JComboBox<String> jComboBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  // End of variables declaration//GEN-END:variables
}
