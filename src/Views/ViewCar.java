/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lim Li Ping
 */
public class ViewCar extends javax.swing.JFrame {

  private JFrame frame;

  /**
   * Creates new form ViewCar
   */
  public ViewCar() {
    initComponents();

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    GeneralGetters g = new GeneralGetters();
    ArrayList<GeneralCar> allCars = g.getAllCar();

    for (GeneralCar car : allCars) {
      Object[] eachCar = {
        car.getCarNoPlate(),
        car.getBrand(),
        car.getModel(),
        car.getYear(),
        car.getFuelType(),
        car.getPrice(),
        car.getState(),
      };

      model.addRow(eachCar);
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    Title = new javax.swing.JLabel();
    ExitBtn1 = new javax.swing.JButton();
    BookCarBtn = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jTable1.setFont(new java.awt.Font("STZhongsong", 0, 14)); // NOI18N
    jTable1.setModel(
      new javax.swing.table.DefaultTableModel(
        new Object[][] {
          { null, null, null, null, null, null, null },
          { null, null, null, null, null, null, null },
          { null, null, null, null, null, null, null },
          { null, null, null, null, null, null, null },
        },
        new String[] {
          "Car No Plate",
          "Brand",
          "Model",
          "Year",
          "Type of Fuel",
          "Price",
          "Status",
        }
      ) {
        Class[] types = new Class[] {
          java.lang.String.class,
          java.lang.String.class,
          java.lang.String.class,
          java.lang.Integer.class,
          java.lang.String.class,
          java.lang.Double.class,
          java.lang.String.class,
        };

        public Class getColumnClass(int columnIndex) {
          return types[columnIndex];
        }
      }
    );
    jScrollPane1.setViewportView(jTable1);

    Title.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    Title.setForeground(new java.awt.Color(0, 51, 153));
    Title.setText("Welcome to Car Rental System");

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

    BookCarBtn.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
    BookCarBtn.setForeground(new java.awt.Color(0, 102, 204));
    BookCarBtn.setText("Book Car");
    BookCarBtn.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          BookCarBtnActionPerformed(evt);
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
            .addGap(109, 109, 109)
            .addComponent(
              ExitBtn1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              73,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addComponent(BookCarBtn)
            .addGap(161, 161, 161)
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
                    .addContainerGap()
                    .addComponent(
                      jScrollPane1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      902,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(249, 249, 249)
                    .addComponent(Title)
                )
            )
            .addContainerGap(14, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(Title)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addComponent(
              jScrollPane1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              228,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ExitBtn1)
                .addComponent(BookCarBtn)
            )
            .addContainerGap(17, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void ExitBtn1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ExitBtn1ActionPerformed
    //Call the exit system function
    exitSystem exit = new exitSystem();
    exit.exitsystem();
  } //GEN-LAST:event_ExitBtn1ActionPerformed

  private void BookCarBtnActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_BookCarBtnActionPerformed
    frame = new JFrame("Login");
    if (
      JOptionPane.showConfirmDialog(
        frame,
        "Only member can book a car. Confirm if you want to register or login as member?",
        "Confirm Messages",
        JOptionPane.YES_NO_OPTION
      ) ==
      JOptionPane.YES_NO_OPTION
    ) {
      LoginMenu menu = new LoginMenu();
      menu.setVisible(true);
      dispose();
    }
  } //GEN-LAST:event_BookCarBtnActionPerformed

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
        .getLogger(ViewCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(ViewCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(ViewCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(ViewCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new ViewCar().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BookCarBtn;
  private javax.swing.JButton ExitBtn1;
  private javax.swing.JLabel Title;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables
}
