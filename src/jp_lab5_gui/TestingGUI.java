/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jp_lab5_gui;

/**
 *
 * @author Lim Li Ping
 */
public class TestingGUI extends javax.swing.JFrame {

  /**
   * Creates new form TestingGUI
   */
  public TestingGUI() {
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
    WelcomeLab = new javax.swing.JLabel();
    EnterLab = new javax.swing.JLabel();
    ViewTxt = new javax.swing.JTextField();
    ClickBut = new javax.swing.JButton();
    ViewLab = new javax.swing.JLabel();
    EnterTxt = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    WelcomeLab.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
    WelcomeLab.setForeground(new java.awt.Color(204, 204, 255));
    WelcomeLab.setText("Welcome to My First Form");

    EnterLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    EnterLab.setForeground(new java.awt.Color(153, 204, 255));
    EnterLab.setText("Enter your name:");

    ClickBut.setBackground(new java.awt.Color(102, 153, 255));
    ClickBut.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
    ClickBut.setForeground(new java.awt.Color(255, 255, 255));
    ClickBut.setText("Submit");
    ClickBut.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          ClickButActionPerformed(evt);
        }
      }
    );

    ViewLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    ViewLab.setForeground(new java.awt.Color(153, 204, 255));
    ViewLab.setText("Your Name is:");

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
            .addGap(54, 54, 54)
            .addComponent(
              WelcomeLab,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addContainerGap()
        )
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(121, 121, 121)
            .addComponent(
              ClickBut,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              137,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addContainerGap(46, Short.MAX_VALUE)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      EnterLab,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      159,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(
                      EnterTxt,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      165,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      ViewLab,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      126,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(35, 35, 35)
                    .addComponent(
                      ViewTxt,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      165,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addGap(25, 25, 25)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(
              WelcomeLab,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              43,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  EnterLab,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  33,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  EnterTxt,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  33,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addComponent(ClickBut)
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  ViewLab,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  34,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  ViewTxt,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  33,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(66, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void ClickButActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ClickButActionPerformed
    String name;
    name = EnterTxt.getText();
    ViewTxt.setText(name);


  } //GEN-LAST:event_ClickButActionPerformed

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
        .getLogger(TestingGUI.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(TestingGUI.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(TestingGUI.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(TestingGUI.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new TestingGUI().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton ClickBut;
  private javax.swing.JLabel EnterLab;
  private javax.swing.JTextField EnterTxt;
  private javax.swing.JLabel ViewLab;
  private javax.swing.JTextField ViewTxt;
  private javax.swing.JLabel WelcomeLab;
  // End of variables declaration//GEN-END:variables
}
