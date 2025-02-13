/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lim Li Ping
 */
public class BookingHistory extends javax.swing.JFrame {

  /**
   * Creates new form BookingHistory
   */
  public BookingHistory() {
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
    setTableData();
  }

  public void setTableData() {
    GeneralGetters g = new GeneralGetters();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    ArrayList<RecordBooking> allBookings = g.getAllBooking();

    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    for (RecordBooking book : allBookings) {
      if (
        book.getCustomer().getIC().equalsIgnoreCase(currentCustomerData.getIC())
      ) {
        Object[] eachBooking = {
          book.getReceiptID(),
          book.getCar().getCarNoPlate(),
          book.getCustomer().getIC(),
          book.getCustomer().getName(),
          book.getCustomer().getPhNum(),
          book.getCustomer().getEmail(),
          df.format(book.getStartDate()),
          book.getDays(),
          df.format(book.getReturnDate()),
          book.getTotalPrice(),
          book.getBank(),
          book.getAccHolder(),
        };

        model.addRow(eachBooking);
      }
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
    Title = new javax.swing.JLabel();
    MenuBut = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

    jTable1.setModel(
      new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {
          "Receipt ID",
          "Car No Plate",
          "IC",
          "Name",
          "Phone Number",
          "Email",
          "Start Date",
          "Rental Days",
          "Return Date",
          "Total Price",
          "Bank",
          "Account Holder",
        }
      ) {
        boolean[] canEdit = new boolean[] {
          false,
          false,
          false,
          false,
          false,
          false,
          false,
          false,
          false,
          false,
          false,
          false,
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
          return canEdit[columnIndex];
        }
      }
    );
    jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    jTable1.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          jTable1MouseClicked(evt);
        }
      }
    );
    jScrollPane2.setViewportView(jTable1);

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
                .addComponent(
                  jScrollPane2,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  1362,
                  Short.MAX_VALUE
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(MenuBut)
                    .addGap(436, 436, 436)
                    .addComponent(Title)
                    .addGap(0, 0, Short.MAX_VALUE)
                )
            )
            .addContainerGap()
        )
    );
    layout.setVerticalGroup(
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
                  layout
                    .createSequentialGroup()
                    .addComponent(MenuBut)
                    .addGap(39, 39, 39)
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  layout
                    .createSequentialGroup()
                    .addComponent(Title)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                )
            )
            .addComponent(
              jScrollPane2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              255,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(24, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void MenuButActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_MenuButActionPerformed
    //Direct to main menu
    MemberMenu menu = new MemberMenu();
    menu.setCurrentCustomerData(currentCustomerData);
    menu.setVisible(true);
    dispose();
  } //GEN-LAST:event_MenuButActionPerformed

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {}

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
        .getLogger(BookingHistory.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(BookingHistory.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(BookingHistory.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(BookingHistory.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new BookingHistory().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton MenuBut;
  private javax.swing.JLabel Title;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables
}
