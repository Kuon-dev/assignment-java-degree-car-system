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
public class ManageCar extends javax.swing.JFrame {

  /**
   * Creates new form ManageCar
   */
  public ManageCar() {
    initComponents();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    GeneralGetters g = new GeneralGetters();
    ArrayList<GeneralCar> allCars = g.getAllCar();
    System.out.println(allCars);

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
    MenuBut = new javax.swing.JButton();
    search = new javax.swing.JButton();
    BookBtn = new javax.swing.JButton();
    clearBut = new javax.swing.JButton();
    WelLab = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    RoomDetails = new javax.swing.JPanel();
    RoomTypeLab = new javax.swing.JLabel();
    Room = new javax.swing.JLabel();
    Day = new javax.swing.JLabel();
    RoomDetailsLab = new javax.swing.JLabel();
    DayStay = new javax.swing.JTextField();
    CarNoPlate = new javax.swing.JTextField();
    RoomID = new javax.swing.JComboBox<>();
    BookingLab = new javax.swing.JLabel();
    BookingLab2 = new javax.swing.JLabel();
    EndDate = new javax.swing.JTextField();
    EndDate1 = new javax.swing.JTextField();
    Room1 = new javax.swing.JLabel();
    EndDate2 = new javax.swing.JTextField();
    Room2 = new javax.swing.JLabel();
    RoomID1 = new javax.swing.JComboBox<>();
    viewrecords = new javax.swing.JButton();
    update = new javax.swing.JButton();
    delete = new javax.swing.JButton();

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

    search.setBackground(new java.awt.Color(255, 255, 255));
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
    BookBtn.setText("Add");
    BookBtn.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          BookBtnActionPerformed(evt);
        }
      }
    );

    clearBut.setBackground(new java.awt.Color(255, 255, 255));
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

    WelLab.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
    WelLab.setForeground(new java.awt.Color(63, 114, 244));
    WelLab.setText("Welcome to Room Booking System");

    jTable1.setModel(
      new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {
          "Car No. Plate",
          "Brand",
          "Model",
          "Year",
          "Type of Fuel",
          "Price",
          "Status",
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
    RoomTypeLab.setText("Year:");

    Room.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Room.setForeground(new java.awt.Color(140, 174, 238));
    Room.setText("Type of Fuel:");

    Day.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Day.setForeground(new java.awt.Color(140, 174, 238));
    Day.setText("Brand:");

    RoomDetailsLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    RoomDetailsLab.setForeground(new java.awt.Color(66, 129, 244));
    RoomDetailsLab.setText("Car Details");

    DayStay.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          DayStayActionPerformed(evt);
        }
      }
    );

    CarNoPlate.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          CarNoPlateActionPerformed(evt);
        }
      }
    );

    RoomID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
    RoomID.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Petron", "Diesel" }
      )
    );
    RoomID.addContainerListener(
      new java.awt.event.ContainerAdapter() {
        public void componentAdded(java.awt.event.ContainerEvent evt) {
          RoomIDComponentAdded(evt);
        }
      }
    );
    RoomID.addItemListener(
      new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
          RoomIDItemStateChanged(evt);
        }
      }
    );
    RoomID.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          RoomIDActionPerformed(evt);
        }
      }
    );

    BookingLab.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    BookingLab.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab.setText("Car No. Plate:");

    BookingLab2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    BookingLab2.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab2.setText("Model:");

    EndDate.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          EndDateActionPerformed(evt);
        }
      }
    );

    EndDate1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          EndDate1ActionPerformed(evt);
        }
      }
    );

    Room1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Room1.setForeground(new java.awt.Color(140, 174, 238));
    Room1.setText("Price:");

    EndDate2.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          EndDate2ActionPerformed(evt);
        }
      }
    );

    Room2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Room2.setForeground(new java.awt.Color(140, 174, 238));
    Room2.setText("Status:");

    RoomID1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
    RoomID1.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Available", "Not Available" }
      )
    );
    RoomID1.addContainerListener(
      new java.awt.event.ContainerAdapter() {
        public void componentAdded(java.awt.event.ContainerEvent evt) {
          RoomID1ComponentAdded(evt);
        }
      }
    );
    RoomID1.addItemListener(
      new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
          RoomID1ItemStateChanged(evt);
        }
      }
    );
    RoomID1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          RoomID1ActionPerformed(evt);
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
                    .addGap(143, 143, 143)
                    .addComponent(RoomDetailsLab)
                )
                .addGroup(
                  RoomDetailsLayout
                    .createSequentialGroup()
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addComponent(Day)
                        .addComponent(RoomTypeLab)
                        .addComponent(BookingLab)
                        .addComponent(BookingLab2)
                        .addComponent(Room)
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(
                          CarNoPlate,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          110,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          DayStay,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          110,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          EndDate,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          110,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          EndDate1,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          110,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          RoomID,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          108,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      47,
                      Short.MAX_VALUE
                    )
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING,
                          false
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addComponent(Room1)
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                            )
                            .addComponent(
                              EndDate2,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              110,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addComponent(Room2)
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                              javax.swing.GroupLayout.DEFAULT_SIZE,
                              Short.MAX_VALUE
                            )
                            .addComponent(
                              RoomID1,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              108,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                        )
                    )
                )
            )
            .addContainerGap()
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
                .addComponent(
                  EndDate2,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(Room1)
            )
            .addGap(18, 18, 18)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Day)
                .addGroup(
                  RoomDetailsLayout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.BASELINE
                    )
                    .addComponent(
                      DayStay,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      20,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addComponent(Room2)
                    .addComponent(
                      RoomID1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      23,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  EndDate,
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
                  EndDate1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Room)
                .addComponent(
                  RoomID,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  23,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );

    viewrecords.setBackground(new java.awt.Color(255, 255, 255));
    viewrecords.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    viewrecords.setForeground(new java.awt.Color(0, 102, 255));
    viewrecords.setText("View Car");
    viewrecords.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          viewrecordsActionPerformed(evt);
        }
      }
    );

    update.setBackground(new java.awt.Color(255, 255, 255));
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

    delete.setBackground(new java.awt.Color(255, 255, 255));
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
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(
              layout
                .createParallelGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  false
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(MenuBut)
                    .addGap(92, 92, 92)
                    .addComponent(WelLab)
                    .addGap(130, 130, 130)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      jScrollPane2,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      637,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addContainerGap()
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(
                      RoomDetails,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING,
                          false
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
                          javax.swing.GroupLayout.DEFAULT_SIZE,
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
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          188,
                          Short.MAX_VALUE
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
                    )
                    .addContainerGap()
                )
            )
        )
    );
    layout.setVerticalGroup(
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
                    .addContainerGap()
                    .addComponent(MenuBut)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(WelLab)
                )
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(viewrecords)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(BookBtn)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(search)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(update)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(delete)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(clearBut)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      21,
                      Short.MAX_VALUE
                    )
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  layout
                    .createSequentialGroup()
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      RoomDetails,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
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
            .addContainerGap(12, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void MenuButActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_MenuButActionPerformed
    //Direct to main menu
    AdminMenu menu = new AdminMenu();
    menu.setVisible(true);
    dispose();
  } //GEN-LAST:event_MenuButActionPerformed

  private void searchActionPerformed(java.awt.event.ActionEvent evt) {
    // search
    System.out.println("Search btn clicked");
  } //GEN-FIRST:event_searchActionPerformed //GEN-LAST:event_searchActionPerformed

  private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {
    // add btn
    System.out.println("book btn clicked");
  } //GEN-FIRST:event_BookBtnActionPerformed //GEN-LAST:event_BookBtnActionPerformed

  //

  private void clearButActionPerformed(java.awt.event.ActionEvent evt) {
    // clear
    System.out.println("clear btn clicked");
  } //GEN-FIRST:event_clearButActionPerformed //GEN-LAST:event_clearButActionPerformed

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
    System.out.println("table btn clicked");
  } //GEN-FIRST:event_jTable1MouseClicked //GEN-LAST:event_jTable1MouseClicked

  private void DayStayActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("day stay btn clicked");
  } //GEN-FIRST:event_DayStayActionPerformed //GEN-LAST:event_DayStayActionPerformed

  private void CarNoPlateActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_CarNoPlateActionPerformed
    // TODO add your handling code here:
    //
    System.out.println("car plate btn clicked");
  } //GEN-LAST:event_CarNoPlateActionPerformed

  private void RoomIDComponentAdded(java.awt.event.ContainerEvent evt) {} //GEN-FIRST:event_RoomIDComponentAdded //GEN-LAST:event_RoomIDComponentAdded

  private void RoomIDItemStateChanged(java.awt.event.ItemEvent evt) {} //GEN-FIRST:event_RoomIDItemStateChanged //GEN-LAST:event_RoomIDItemStateChanged

  private void RoomIDActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("room id clicked");
  } //GEN-FIRST:event_RoomIDActionPerformed //GEN-LAST:event_RoomIDActionPerformed

  private void EndDateActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_EndDateActionPerformed
    // TODO add your handling code here:
    //
    System.out.println("end date clicked");
  } //GEN-LAST:event_EndDateActionPerformed

  private void viewrecordsActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("view record action clicked");
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    GeneralGetters g = new GeneralGetters();
    ArrayList<GeneralCar> allCars = g.getAllCar();
    System.out.println(allCars);

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
  } //GEN-FIRST:event_viewrecordsActionPerformed //GEN-LAST:event_viewrecordsActionPerformed

  private void updateActionPerformed(java.awt.event.ActionEvent evt) {} //GEN-FIRST:event_updateActionPerformed //GEN-LAST:event_updateActionPerformed

  private void deleteActionPerformed(java.awt.event.ActionEvent evt) {} //GEN-FIRST:event_deleteActionPerformed //GEN-LAST:event_deleteActionPerformed

  private void EndDate1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_EndDate1ActionPerformed
    // TODO add your handling code here:
    System.out.println("end date 1 btn click");
  } //GEN-LAST:event_EndDate1ActionPerformed

  private void EndDate2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_EndDate2ActionPerformed
    // TODO add your handling code here:
    //
    System.out.println("end date 2 btn click");
  } //GEN-LAST:event_EndDate2ActionPerformed

  private void RoomID1ComponentAdded(java.awt.event.ContainerEvent evt) { //GEN-FIRST:event_RoomID1ComponentAdded
    // TODO add your handling code here:
  } //GEN-LAST:event_RoomID1ComponentAdded

  private void RoomID1ItemStateChanged(java.awt.event.ItemEvent evt) { //GEN-FIRST:event_RoomID1ItemStateChanged
    // TODO add your handling code here:
  } //GEN-LAST:event_RoomID1ItemStateChanged

  private void RoomID1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_RoomID1ActionPerformed
    // TODO add your handling code here:
    //
    System.out.println("room id 1 btn click");
  } //GEN-LAST:event_RoomID1ActionPerformed

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
        .getLogger(ManageCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(ManageCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(ManageCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(ManageCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new ManageCar().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BookBtn;
  private javax.swing.JLabel BookingLab;
  private javax.swing.JLabel BookingLab2;
  private javax.swing.JTextField CarNoPlate;
  private javax.swing.JLabel Day;
  private javax.swing.JTextField DayStay;
  private javax.swing.JTextField EndDate;
  private javax.swing.JTextField EndDate1;
  private javax.swing.JTextField EndDate2;
  private javax.swing.JButton MenuBut;
  private javax.swing.JLabel Room;
  private javax.swing.JLabel Room1;
  private javax.swing.JLabel Room2;
  private javax.swing.JPanel RoomDetails;
  private javax.swing.JLabel RoomDetailsLab;
  private javax.swing.JComboBox<String> RoomID;
  private javax.swing.JComboBox<String> RoomID1;
  private javax.swing.JLabel RoomTypeLab;
  private javax.swing.JLabel WelLab;
  private javax.swing.JButton clearBut;
  private javax.swing.JButton delete;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable jTable1;
  private javax.swing.JButton search;
  private javax.swing.JButton update;
  private javax.swing.JButton viewrecords;
  // End of variables declaration//GEN-END:variables
}
