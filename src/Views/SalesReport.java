/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import org.knowm.xchart.*;

/**
 *
 * @author Lim Li Ping
 */
public class SalesReport extends javax.swing.JFrame {

  /**
   * Creates new form SalesReport
   */
  public SalesReport() {
    initComponents();
  }

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
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    Month = new javax.swing.JComboBox<>();
    jTextField1 = new javax.swing.JTextField();
    Title = new javax.swing.JLabel();
    MenuBut = new javax.swing.JButton();
    AdminLoginLab = new javax.swing.JLabel();
    BookingLab = new javax.swing.JLabel();
    BookingLab1 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    Month.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
    Month.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] {
          "January",
          "Febuary",
          "March",
          "April",
          "May",
          "June",
          "July",
          "August",
          "September",
          "October",
          "November",
          "December",
        }
      )
    );
    Month.addContainerListener(
      new java.awt.event.ContainerAdapter() {
        public void componentAdded(java.awt.event.ContainerEvent evt) {
          MonthComponentAdded(evt);
        }
      }
    );
    Month.addItemListener(
      new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
          MonthItemStateChanged(evt);
        }
      }
    );
    Month.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          MonthActionPerformed(evt);
        }
      }
    );

    jTextField1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jTextField1ActionPerformed(evt);
        }
      }
    );

    Title.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    Title.setForeground(new java.awt.Color(0, 51, 153));
    Title.setText("Welcome to Car Rental System");

    MenuBut.setBackground(new java.awt.Color(153, 204, 255));
    MenuBut.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    MenuBut.setForeground(new java.awt.Color(0, 102, 255));
    MenuBut.setText("Main Menu");
    MenuBut.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          MenuButActionPerformed(evt);
        }
      }
    );

    AdminLoginLab.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
    AdminLoginLab.setForeground(new java.awt.Color(0, 51, 204));
    AdminLoginLab.setText("Sales report");

    BookingLab.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    BookingLab.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab.setText("Select Month");

    BookingLab1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    BookingLab1.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab1.setText("Enter year");

    jButton1.setText("Generate");
    jButton1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton1ActionPerformed(evt);
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
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  layout
                    .createSequentialGroup()
                    .addGap(0, 14, Short.MAX_VALUE)
                    .addComponent(Title)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(MenuBut)
                    .addGap(0, 0, Short.MAX_VALUE)
                )
            )
            .addContainerGap()
        )
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addGap(67, 67, 67)
            .addComponent(BookingLab1)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addComponent(BookingLab)
            .addGap(71, 71, 71)
        )
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(
              jTextField1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              130,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addComponent(
              Month,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              130,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(44, 44, 44)
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
                    .addGap(136, 136, 136)
                    .addComponent(AdminLoginLab)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(jButton1)
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
            .addComponent(MenuBut)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Title)
            .addGap(1, 1, 1)
            .addComponent(AdminLoginLab)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      BookingLab,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      21,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(2, 2, 2)
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      BookingLab1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      21,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                )
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  Month,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  23,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  jTextField1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(50, 50, 50)
            .addComponent(jButton1)
            .addContainerGap(24, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void MonthComponentAdded(java.awt.event.ContainerEvent evt) { //GEN-FIRST:event_MonthComponentAdded
    // TODO add your handling code here:
  } //GEN-LAST:event_MonthComponentAdded

  private void MonthItemStateChanged(java.awt.event.ItemEvent evt) { //GEN-FIRST:event_MonthItemStateChanged
    // TODO add your handling code here:
  } //GEN-LAST:event_MonthItemStateChanged

  private void MonthActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_MonthActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_MonthActionPerformed

  private void MenuButActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_MenuButActionPerformed
    //Direct to main menu
    AdminMenu menu = new AdminMenu();
    menu.setCurrentAdminData(currentAdminData);
    menu.setVisible(true);
    dispose();
  } //GEN-LAST:event_MenuButActionPerformed

  private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_jTextField1ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    // generate report
    // TODO: SANITIZE INPUT

    // Create Chart
    RecordReport r = new RecordReport();
    XYChart chart = r.getAnnualChart(Integer.parseInt(jTextField1.getText()));
    JFrame frame = new JFrame("XChart Swing Demo");
    //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    // Add content to the window.
    JPanel chartPanel = new XChartPanel(chart);
    frame.add(chartPanel);

    // Display the window.
    frame.pack();
    frame.setVisible(true);
    // Create Chart
    // XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);

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
        .getLogger(SalesReport.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(SalesReport.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(SalesReport.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(SalesReport.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new SalesReport().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel AdminLoginLab;
  private javax.swing.JLabel BookingLab;
  private javax.swing.JLabel BookingLab1;
  private javax.swing.JButton MenuBut;
  private javax.swing.JComboBox<String> Month;
  private javax.swing.JLabel Title;
  private javax.swing.JButton jButton1;
  private javax.swing.JTextField jTextField1;
  // End of variables declaration//GEN-END:variables
}
