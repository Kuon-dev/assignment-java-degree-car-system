/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.io.*;
import java.math.BigInteger;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lim Li Ping
 */
public class ManageBooking extends javax.swing.JFrame {

  /**
   * Creates new form ManageBooking
   */
  public ManageBooking() {
    initComponents();

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    setTableData();
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

  public Boolean sanitizeInput() {
    ArrayList<String> inputData = new ArrayList<>();
    inputData.add(customerIcEdit.getText());
    inputData.add(CarNoPlate.getText());
    inputData.add(startDateEdit.getText());
    inputData.add(endDateEdit.getText());

    for (String data : inputData) {
      if (data.isEmpty()) {
        JOptionPane.showMessageDialog(
          this,
          "Please fill in all the data before submitting",
          "Error Message",
          JOptionPane.ERROR_MESSAGE
        );
        return false;
      }
    }

    // check for valid inputs of car and customer
    UserCustomer newUserCustomer = new UserCustomer(
      null,
      null,
      null,
      null,
      null
    );

    if (!newUserCustomer.isUserExist()) {
      JOptionPane.showMessageDialog(
        this,
        "Car does not exist in record",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      return false;
    }

    GeneralCar newSelectedCar = new GeneralCar(
      inputData.get(3),
      null,
      null,
      null,
      0,
      0,
      null
    );

    if (!newSelectedCar.isCarExist()) {
      JOptionPane.showMessageDialog(
        this,
        "Car does not exist in record",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      return false;
    }

    return true;
  }

  private void setTableData() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    GeneralGetters g = new GeneralGetters();
    ArrayList<RecordBooking> allBookings = g.getAllBooking();

    for (RecordBooking book : allBookings) {
      Object[] eachBooking = {
        book.getReceiptID(),
        book.getCar().getCarNoPlate(),
        book.getCustomer().getIC(),
        book.getCustomer().getName(),
        book.getCustomer().getPhNum(),
        book.getStartDate(),
        book.getDays(),
        book.getReturnDate(),
        book.getTotalPrice(),
        "",
        "",
      };

      model.addRow(eachBooking);
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
    MenuBut = new javax.swing.JButton();
    search = new javax.swing.JButton();
    BookBtn = new javax.swing.JButton();
    clearBut = new javax.swing.JButton();
    viewrecords = new javax.swing.JButton();
    update = new javax.swing.JButton();
    CustDetails = new javax.swing.JPanel();
    Passport = new javax.swing.JLabel();
    searchIC = new javax.swing.JTextField();
    searchReceiptID = new javax.swing.JTextField();
    Name = new javax.swing.JLabel();
    CustDetailsLab = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    delete = new javax.swing.JButton();
    Title = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    RoomDetails = new javax.swing.JPanel();
    RoomTypeLab = new javax.swing.JLabel();
    Day = new javax.swing.JLabel();
    RoomDetailsLab = new javax.swing.JLabel();
    customerIcEdit = new javax.swing.JTextField();
    CarNoPlate = new javax.swing.JTextField();
    BookingLab = new javax.swing.JLabel();
    BookingLab2 = new javax.swing.JLabel();
    startDateEdit = new javax.swing.JTextField();
    endDateEdit = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

    search.setBackground(new java.awt.Color(153, 204, 255));
    search.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    search.setForeground(new java.awt.Color(0, 102, 255));
    search.setText("Search");
    search.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          searchActionPerformed(evt);
        }
      }
    );

    BookBtn.setBackground(new java.awt.Color(255, 255, 255));
    BookBtn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    BookBtn.setForeground(new java.awt.Color(0, 102, 255));
    BookBtn.setText("Book Car");
    BookBtn.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          BookBtnActionPerformed(evt);
        }
      }
    );

    clearBut.setBackground(new java.awt.Color(153, 204, 255));
    clearBut.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    clearBut.setForeground(new java.awt.Color(0, 102, 255));
    clearBut.setText("Clear");
    clearBut.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          clearButActionPerformed(evt);
        }
      }
    );

    viewrecords.setBackground(new java.awt.Color(153, 204, 255));
    viewrecords.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    viewrecords.setForeground(new java.awt.Color(0, 102, 255));
    viewrecords.setText("View Records");
    viewrecords.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          viewrecordsActionPerformed(evt);
        }
      }
    );

    update.setBackground(new java.awt.Color(153, 204, 255));
    update.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    update.setForeground(new java.awt.Color(0, 102, 255));
    update.setText("Update");
    update.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          updateActionPerformed(evt);
        }
      }
    );

    CustDetails.setBorder(
      javax.swing.BorderFactory.createLineBorder(
        new java.awt.Color(210, 204, 228),
        4
      )
    );

    Passport.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Passport.setForeground(new java.awt.Color(140, 174, 238));
    Passport.setText("IC/Passport:");

    Name.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Name.setForeground(new java.awt.Color(140, 174, 238));
    Name.setText("Receipt ID");

    CustDetailsLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustDetailsLab.setForeground(new java.awt.Color(66, 129, 244));
    CustDetailsLab.setText("Search record");

    jLabel1.setText("** Enter IC to search records");

    javax.swing.GroupLayout CustDetailsLayout = new javax.swing.GroupLayout(
      CustDetails
    );
    CustDetails.setLayout(CustDetailsLayout);
    CustDetailsLayout.setHorizontalGroup(
      CustDetailsLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          CustDetailsLayout
            .createSequentialGroup()
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  CustDetailsLayout
                    .createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(
                      CustDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addComponent(Passport)
                        .addComponent(Name)
                    )
                    .addGap(18, 18, 18)
                    .addGroup(
                      CustDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING,
                          false
                        )
                        .addComponent(CustDetailsLab)
                        .addComponent(
                          searchIC,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          209,
                          Short.MAX_VALUE
                        )
                        .addComponent(
                          searchReceiptID,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          209,
                          Short.MAX_VALUE
                        )
                    )
                )
                .addGroup(
                  CustDetailsLayout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );
    CustDetailsLayout.setVerticalGroup(
      CustDetailsLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          CustDetailsLayout
            .createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(CustDetailsLab)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Passport)
                .addComponent(
                  searchIC,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  22,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  searchReceiptID,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(Name)
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              141,
              Short.MAX_VALUE
            )
            .addComponent(jLabel1)
            .addContainerGap()
        )
    );

    delete.setBackground(new java.awt.Color(153, 204, 255));
    delete.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    delete.setForeground(new java.awt.Color(0, 102, 255));
    delete.setText("Delete");
    delete.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          deleteActionPerformed(evt);
        }
      }
    );

    Title.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
    Title.setForeground(new java.awt.Color(0, 51, 153));
    Title.setText("Welcome to Car Rental System");

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

    RoomDetails.setBorder(
      javax.swing.BorderFactory.createLineBorder(
        new java.awt.Color(210, 204, 228),
        4
      )
    );

    RoomTypeLab.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    RoomTypeLab.setForeground(new java.awt.Color(140, 174, 238));
    RoomTypeLab.setText("End date:");

    Day.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Day.setForeground(new java.awt.Color(140, 174, 238));
    Day.setText("Customer IC:");

    RoomDetailsLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    RoomDetailsLab.setForeground(new java.awt.Color(66, 129, 244));
    RoomDetailsLab.setText("Modify");

    customerIcEdit.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {}
      }
    );

    CarNoPlate.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          CarNoPlateActionPerformed(evt);
        }
      }
    );

    BookingLab.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    BookingLab.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab.setText("Car No. Plate:");

    BookingLab2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    BookingLab2.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab2.setText("Start date:");

    startDateEdit.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          startDateEditActionPerformed(evt);
        }
      }
    );

    endDateEdit.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          endDateEditActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout RoomDetailsLayout = new javax.swing.GroupLayout(
      RoomDetails
    );
    RoomDetails.setLayout(RoomDetailsLayout);
    RoomDetailsLayout.setHorizontalGroup(
      RoomDetailsLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          RoomDetailsLayout
            .createSequentialGroup()
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  RoomDetailsLayout
                    .createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(RoomDetailsLab)
                )
                .addGroup(
                  RoomDetailsLayout
                    .createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addComponent(BookingLab)
                            .addGap(18, 18, 18)
                            .addComponent(
                              CarNoPlate,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              110,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addComponent(Day)
                            .addGap(18, 18, 18)
                            .addComponent(
                              customerIcEdit,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              110,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.TRAILING
                                )
                                .addComponent(RoomTypeLab)
                                .addComponent(BookingLab2)
                            )
                            .addGap(18, 18, 18)
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING,
                                  false
                                )
                                .addComponent(
                                  startDateEdit,
                                  javax.swing.GroupLayout.Alignment.TRAILING,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  110,
                                  Short.MAX_VALUE
                                )
                                .addComponent(
                                  endDateEdit,
                                  javax.swing.GroupLayout.Alignment.TRAILING
                                )
                            )
                        )
                    )
                )
            )
            .addContainerGap(43, Short.MAX_VALUE)
        )
    );
    RoomDetailsLayout.setVerticalGroup(
      RoomDetailsLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          RoomDetailsLayout
            .createSequentialGroup()
            .addComponent(
              RoomDetailsLab,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              34,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  BookingLab,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  21,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  CarNoPlate,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Day)
                .addComponent(
                  customerIcEdit,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  20,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(19, 19, 19)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  startDateEdit,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  BookingLab2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  21,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RoomTypeLab)
                .addComponent(
                  endDateEdit,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(81, Short.MAX_VALUE)
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
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  layout
                    .createSequentialGroup()
                    .addComponent(MenuBut)
                    .addGap(115, 115, 115)
                    .addComponent(Title)
                    .addGap(0, 0, Short.MAX_VALUE)
                )
                .addComponent(
                  jScrollPane2,
                  javax.swing.GroupLayout.Alignment.LEADING
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      RoomDetails,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(30, 30, 30)
                    .addComponent(
                      CustDetails,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(78, 78, 78)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING,
                          false
                        )
                        .addComponent(
                          delete,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          Short.MAX_VALUE
                        )
                        .addComponent(
                          update,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          Short.MAX_VALUE
                        )
                        .addComponent(
                          search,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          Short.MAX_VALUE
                        )
                        .addComponent(
                          viewrecords,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          188,
                          Short.MAX_VALUE
                        )
                        .addComponent(
                          BookBtn,
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          Short.MAX_VALUE
                        )
                        .addComponent(
                          clearBut,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          Short.MAX_VALUE
                        )
                    )
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
                    .addGap(24, 24, 24)
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
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  RoomDetails,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(BookBtn)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(viewrecords)
                    .addGap(13, 13, 13)
                    .addComponent(search)
                    .addGap(16, 16, 16)
                    .addComponent(update)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(delete)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(clearBut)
                )
                .addComponent(
                  CustDetails,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jScrollPane2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              255,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void MenuButActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_MenuButActionPerformed
    //Direct to main menu
    AdminMenu menu = new AdminMenu();
    menu.setCurrentAdminData(currentAdminData);
    menu.setVisible(true);
    dispose();
  } //GEN-LAST:event_MenuButActionPerformed

  private void searchActionPerformed(java.awt.event.ActionEvent evt) {}

  private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {}

  private void clearButActionPerformed(java.awt.event.ActionEvent evt) {}

  private void viewrecordsActionPerformed(java.awt.event.ActionEvent evt) {}

  private void updateActionPerformed(java.awt.event.ActionEvent evt) {}

  private void deleteActionPerformed(java.awt.event.ActionEvent evt) {}

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {}

  private void CarNoPlateActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_CarNoPlateActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_CarNoPlateActionPerformed

  private void startDateEditActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_startDateEditActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_startDateEditActionPerformed

  private void endDateEditActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_endDateEditActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_endDateEditActionPerformed

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
        .getLogger(ManageBooking.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(ManageBooking.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(ManageBooking.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(ManageBooking.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new ManageBooking().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BookBtn;
  private javax.swing.JLabel BookingLab;
  private javax.swing.JLabel BookingLab2;
  private javax.swing.JTextField CarNoPlate;
  private javax.swing.JPanel CustDetails;
  private javax.swing.JLabel CustDetailsLab;
  private javax.swing.JLabel Day;
  private javax.swing.JButton MenuBut;
  private javax.swing.JLabel Name;
  private javax.swing.JLabel Passport;
  private javax.swing.JPanel RoomDetails;
  private javax.swing.JLabel RoomDetailsLab;
  private javax.swing.JLabel RoomTypeLab;
  private javax.swing.JLabel Title;
  private javax.swing.JButton clearBut;
  private javax.swing.JTextField customerIcEdit;
  private javax.swing.JButton delete;
  private javax.swing.JTextField endDateEdit;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable jTable1;
  private javax.swing.JButton search;
  private javax.swing.JTextField searchIC;
  private javax.swing.JTextField searchReceiptID;
  private javax.swing.JTextField startDateEdit;
  private javax.swing.JButton update;
  private javax.swing.JButton viewrecords;
  // End of variables declaration//GEN-END:variables
}
