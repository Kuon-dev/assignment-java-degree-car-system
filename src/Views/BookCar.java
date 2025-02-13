/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.awt.Dimension;
import java.io.*;
import java.math.BigInteger;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lim Li Ping
 */
public class BookCar extends javax.swing.JFrame {

  /**
   * Creates new form BookCar
   */
  public BookCar() {
    initComponents();
    clear();
    setTable();
  }

  public GeneralCar tableSelectedCar = new GeneralCar(
    null,
    null,
    null,
    null,
    null,
    0,
    0,
    null
  );

  public UserCustomer currentCustomerData = new UserCustomer(
    null,
    null,
    null,
    null,
    null
  );

  public void setCurrentCustomerData(UserCustomer data) {
    this.currentCustomerData = data;
    IC.setText(currentCustomerData.getIC());
    Email.setText(currentCustomerData.getEmail());
    PhNum.setText(currentCustomerData.getPhNum());
  }

  public void setTable() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

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
      if (car.getState().equals("AVAILABLE")) model.addRow(eachCar);
    }
  }

  public void updateTableInformation(ArrayList<GeneralCar> data) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    // temporary array so it will not push duplicated data on the table
    ArrayList<String> tempArr = new ArrayList<>();
    for (GeneralCar car : data) {
      Object[] eachCar = {
        car.getCarNoPlate(),
        car.getBrand(),
        car.getModel(),
        car.getYear(),
        car.getFuelType(),
        car.getPrice(),
      };

      if (!tempArr.contains(car.getCarNoPlate())) {
        model.addRow(eachCar);
        tempArr.add(car.getCarNoPlate());
      }
    }
  }

  private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

  private Boolean sanitizeInput() {
    String phnumEntered = this.PhNum.getText();
    String emailEntered = this.Email.getText();
    Validator v = new Validator();
    IC.setText(currentCustomerData.getIC());
    if (!v.isEmail(emailEntered)) {
      JOptionPane.showMessageDialog(
        this,
        "Incorrect Email.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      Email.setText(currentCustomerData.getEmail());
      return false;
    }
    if (
      (phnumEntered.length() != (10) && (phnumEntered.length() != (11))) ||
      !v.isPhNum(phnumEntered)
    ) {
      JOptionPane.showMessageDialog(
        this,
        "Incorrect Phone Number.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      PhNum.setText(currentCustomerData.getPhNum());
      return false;
    }
    if (!v.isValidCard(CardNum.getText())) {
      JOptionPane.showMessageDialog(
        this,
        "Invalid Card Number.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      CardNum.setText("");
      return false;
    }
    {
      ArrayList<String> data = new ArrayList<>();
      data.add(CarNoPlate.getText());
      data.add(Brand.getText());
      data.add(Model.getText());
      data.add(Year.getText());
      data.add(FuelType.getSelectedItem().toString());
      data.add(Price.getText());
      data.add(StartDate.getText());
      data.add(RentDays.getText());
      data.add(ReturnDate.getText());
      data.add(TotalPrice.getText());
      data.add(IC.getText());
      data.add(Email.getText());
      data.add(PhNum.getText());
      data.add(CardNum.getText());
      data.add(AccHolder.getText());
      data.add(Bank.getText());

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

  public String generateReceiptID() {
    String availableChar =
      "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
      "abcdefghijklmnopqrstuvwxyz" +
      "0123456789";

    StringBuilder sb = new StringBuilder("R-");
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
      // generate random index number
      int index = random.nextInt(availableChar.length());
      // get character specified by index
      char randomChar = availableChar.charAt(index);
      // append the character to string builder
      sb.append(randomChar);
    }

    return sb.toString();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    CustDetails = new javax.swing.JPanel();
    Passport = new javax.swing.JLabel();
    IC = new javax.swing.JTextField();
    Contact = new javax.swing.JLabel();
    PhNum = new javax.swing.JTextField();
    Mail = new javax.swing.JLabel();
    Email = new javax.swing.JTextField();
    CustDetailsLab = new javax.swing.JLabel();
    Mail1 = new javax.swing.JLabel();
    Mail2 = new javax.swing.JLabel();
    Mail3 = new javax.swing.JLabel();
    CardNum = new javax.swing.JTextField();
    AccHolder = new javax.swing.JTextField();
    Bank = new javax.swing.JTextField();
    Title = new javax.swing.JLabel();
    MenuBut = new javax.swing.JButton();
    search = new javax.swing.JButton();
    BookBtn = new javax.swing.JButton();
    clearBut = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    RoomDetails = new javax.swing.JPanel();
    RoomTypeLab = new javax.swing.JLabel();
    Room = new javax.swing.JLabel();
    Day = new javax.swing.JLabel();
    RoomDetailsLab = new javax.swing.JLabel();
    Brand = new javax.swing.JTextField();
    CarNoPlate = new javax.swing.JTextField();
    FuelType = new javax.swing.JComboBox<>();
    BookingLab = new javax.swing.JLabel();
    BookingLab2 = new javax.swing.JLabel();
    Model = new javax.swing.JTextField();
    Year = new javax.swing.JTextField();
    Room1 = new javax.swing.JLabel();
    StartDate = new javax.swing.JTextField();
    Room2 = new javax.swing.JLabel();
    Room3 = new javax.swing.JLabel();
    RentDays = new javax.swing.JTextField();
    TotalPrice = new javax.swing.JTextField();
    BookingLab1 = new javax.swing.JLabel();
    Day1 = new javax.swing.JLabel();
    ReturnDate = new javax.swing.JTextField();
    PricePDay = new javax.swing.JLabel();
    Price = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    CustDetails.setBorder(
      javax.swing.BorderFactory.createLineBorder(
        new java.awt.Color(210, 204, 228),
        4
      )
    );

    Passport.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Passport.setForeground(new java.awt.Color(140, 174, 238));
    Passport.setText("Customer IC:");

    IC.setEditable(false);
    IC.setBackground(new java.awt.Color(255, 255, 255));

    Contact.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Contact.setForeground(new java.awt.Color(140, 174, 238));
    Contact.setText("Phone Number:");

    PhNum.setEditable(false);
    PhNum.setBackground(new java.awt.Color(255, 255, 255));

    Mail.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Mail.setForeground(new java.awt.Color(140, 174, 238));
    Mail.setText("Email:");

    Email.setEditable(false);
    Email.setBackground(new java.awt.Color(255, 255, 255));
    Email.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          EmailActionPerformed(evt);
        }
      }
    );

    CustDetailsLab.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
    CustDetailsLab.setForeground(new java.awt.Color(66, 129, 244));
    CustDetailsLab.setText("Customer Details");

    Mail1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Mail1.setForeground(new java.awt.Color(140, 174, 238));
    Mail1.setText("Card Number:");

    Mail2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Mail2.setForeground(new java.awt.Color(140, 174, 238));
    Mail2.setText("Bank:");

    Mail3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Mail3.setForeground(new java.awt.Color(140, 174, 238));
    Mail3.setText("Card Holder:");

    CardNum.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          CardNumActionPerformed(evt);
        }
      }
    );

    AccHolder.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          AccHolderActionPerformed(evt);
        }
      }
    );

    Bank.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          BankActionPerformed(evt);
        }
      }
    );

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
            .addGap(10, 10, 10)
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(Mail3)
                .addComponent(Mail2)
                .addComponent(Mail1)
                .addComponent(Passport)
                .addComponent(Contact)
                .addComponent(
                  Mail,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  40,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  false
                )
                .addComponent(
                  Email,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  209,
                  Short.MAX_VALUE
                )
                .addComponent(
                  PhNum,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  209,
                  Short.MAX_VALUE
                )
                .addComponent(CustDetailsLab)
                .addComponent(
                  IC,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  209,
                  Short.MAX_VALUE
                )
                .addComponent(
                  CardNum,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  209,
                  Short.MAX_VALUE
                )
                .addComponent(
                  AccHolder,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  209,
                  Short.MAX_VALUE
                )
                .addComponent(
                  Bank,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  209,
                  Short.MAX_VALUE
                )
            )
            .addContainerGap(16, Short.MAX_VALUE)
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
                  IC,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  22,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  PhNum,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(Contact)
            )
            .addGap(12, 12, 12)
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  Email,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(Mail)
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Mail1)
                .addComponent(
                  CardNum,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
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
                  AccHolder,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(Mail3)
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              CustDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  Bank,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(Mail2)
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
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

    jTable1.setFont(new java.awt.Font("STZhongsong", 0, 14)); // NOI18N
    jTable1.setModel(
      new javax.swing.table.DefaultTableModel(
        new Object[][] {
          { null, null, null, null, null, null },
          { null, null, null, null, null, null },
          { null, null, null, null, null, null },
          { null, null, null, null, null, null },
        },
        new String[] {
          "Car No Plate",
          "Brand",
          "Model",
          "Year",
          "Type of Fuel",
          "Price",
        }
      ) {
        Class[] types = new Class[] {
          java.lang.String.class,
          java.lang.String.class,
          java.lang.String.class,
          java.lang.Integer.class,
          java.lang.String.class,
          java.lang.Double.class,
        };
        boolean[] canEdit = new boolean[] {
          false,
          false,
          false,
          false,
          false,
          false,
        };

        public Class getColumnClass(int columnIndex) {
          return types[columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
          return canEdit[columnIndex];
        }
      }
    );
    jTable1.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          jTable1MouseClicked(evt);
        }
      }
    );
    jScrollPane1.setViewportView(jTable1);

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

    Brand.addActionListener(
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

    FuelType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
    FuelType.setModel(
      new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Petron", "Diesel" }
      )
    );
    FuelType.addContainerListener(
      new java.awt.event.ContainerAdapter() {
        public void componentAdded(java.awt.event.ContainerEvent evt) {}
      }
    );
    FuelType.addItemListener(
      new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {}
      }
    );
    FuelType.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {}
      }
    );

    BookingLab.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    BookingLab.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab.setText("Car No. Plate:");

    BookingLab2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    BookingLab2.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab2.setText("Model:");

    Model.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          ModelActionPerformed(evt);
        }
      }
    );

    Year.setEditable(false);
    Year.setBackground(new java.awt.Color(255, 255, 255));
    Year.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          YearActionPerformed(evt);
        }
      }
    );

    Room1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Room1.setForeground(new java.awt.Color(140, 174, 238));
    Room1.setText("Total Price:");

    StartDate.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          StartDateActionPerformed(evt);
        }
      }
    );

    Room2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Room2.setForeground(new java.awt.Color(140, 174, 238));
    Room2.setText("Return Date:");

    Room3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Room3.setForeground(new java.awt.Color(140, 174, 238));
    Room3.setText("Start Date:");

    RentDays.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          RentDaysActionPerformed(evt);
        }
      }
    );
    RentDays.addKeyListener(
      new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
          RentDaysKeyReleased(evt);
        }
      }
    );

    TotalPrice.setEditable(false);
    TotalPrice.setBackground(new java.awt.Color(255, 255, 255));
    TotalPrice.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          TotalPriceActionPerformed(evt);
        }
      }
    );

    BookingLab1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
    BookingLab1.setForeground(new java.awt.Color(140, 174, 238));
    BookingLab1.setText("(dd/mm/yyyy)");

    Day1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    Day1.setForeground(new java.awt.Color(140, 174, 238));
    Day1.setText("Day of Rent:");

    ReturnDate.setEditable(false);
    ReturnDate.setBackground(new java.awt.Color(255, 255, 255));
    ReturnDate.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          ReturnDateActionPerformed(evt);
        }
      }
    );

    PricePDay.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
    PricePDay.setForeground(new java.awt.Color(140, 174, 238));
    PricePDay.setText("Price Per Day:");

    Price.setEditable(false);
    Price.setBackground(new java.awt.Color(255, 255, 255));
    Price.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          PriceActionPerformed(evt);
        }
      }
    );

    jLabel1.setText("** Use Car No Plate/ Brand/ Model to search a car");

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
            .addGap(169, 169, 169)
            .addComponent(RoomDetailsLab)
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
        .addGroup(
          RoomDetailsLayout
            .createSequentialGroup()
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  RoomDetailsLayout
                    .createSequentialGroup()
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.TRAILING
                                )
                                .addComponent(RoomTypeLab)
                                .addComponent(Room)
                                .addComponent(PricePDay)
                            )
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                            )
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING
                                )
                                .addGroup(
                                  RoomDetailsLayout
                                    .createSequentialGroup()
                                    .addGroup(
                                      RoomDetailsLayout
                                        .createParallelGroup(
                                          javax.swing.GroupLayout.Alignment.LEADING
                                        )
                                        .addComponent(
                                          FuelType,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          112,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                        .addComponent(
                                          Price,
                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                          110,
                                          javax.swing.GroupLayout.PREFERRED_SIZE
                                        )
                                    )
                                    .addGap(0, 0, Short.MAX_VALUE)
                                )
                                .addGroup(
                                  javax.swing.GroupLayout.Alignment.TRAILING,
                                  RoomDetailsLayout
                                    .createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(
                                      Year,
                                      javax.swing.GroupLayout.PREFERRED_SIZE,
                                      110,
                                      javax.swing.GroupLayout.PREFERRED_SIZE
                                    )
                                )
                            )
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addContainerGap(
                              javax.swing.GroupLayout.DEFAULT_SIZE,
                              Short.MAX_VALUE
                            )
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.TRAILING
                                )
                                .addGroup(
                                  RoomDetailsLayout
                                    .createSequentialGroup()
                                    .addComponent(BookingLab)
                                    .addGap(14, 14, 14)
                                )
                                .addGroup(
                                  RoomDetailsLayout
                                    .createSequentialGroup()
                                    .addComponent(Day)
                                    .addPreferredGap(
                                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                    )
                                )
                                .addGroup(
                                  RoomDetailsLayout
                                    .createSequentialGroup()
                                    .addComponent(BookingLab2)
                                    .addGap(18, 18, 18)
                                )
                            )
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING
                                )
                                .addComponent(
                                  Brand,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  110,
                                  javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                                .addComponent(
                                  Model,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  110,
                                  javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                                .addComponent(
                                  CarNoPlate,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  110,
                                  javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                            )
                        )
                    )
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING
                                )
                                .addComponent(Room2)
                                .addGroup(
                                  RoomDetailsLayout
                                    .createSequentialGroup()
                                    .addGroup(
                                      RoomDetailsLayout
                                        .createParallelGroup(
                                          javax.swing.GroupLayout.Alignment.TRAILING
                                        )
                                        .addComponent(BookingLab1)
                                        .addComponent(Day1)
                                        .addComponent(Room3)
                                    )
                                    .addPreferredGap(
                                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                    )
                                    .addGroup(
                                      RoomDetailsLayout
                                        .createParallelGroup(
                                          javax.swing.GroupLayout.Alignment.LEADING,
                                          false
                                        )
                                        .addComponent(
                                          RentDays,
                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                          104,
                                          Short.MAX_VALUE
                                        )
                                        .addComponent(StartDate)
                                    )
                                )
                            )
                        )
                        .addGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(Room1)
                            .addGap(9, 9, 9)
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING,
                                  false
                                )
                                .addComponent(
                                  TotalPrice,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  104,
                                  Short.MAX_VALUE
                                )
                                .addComponent(ReturnDate)
                            )
                        )
                    )
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  RoomDetailsLayout
                    .createSequentialGroup()
                    .addContainerGap(
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(jLabel1)
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
            .addContainerGap()
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  RoomDetailsLayout
                    .createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(
                          CarNoPlate,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          BookingLab,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          21,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGroup(
                  RoomDetailsLayout
                    .createSequentialGroup()
                    .addComponent(
                      RoomDetailsLab,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      34,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(Room3)
                        .addComponent(
                          StartDate,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addComponent(
                              BookingLab1,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              14,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                            )
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.BASELINE
                                )
                                .addComponent(
                                  RentDays,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                                .addComponent(Day1)
                            )
                        )
                        .addGroup(
                          RoomDetailsLayout
                            .createSequentialGroup()
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.BASELINE
                                )
                                .addComponent(
                                  Brand,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  20,
                                  javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                                .addComponent(Day)
                            )
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                            )
                            .addGroup(
                              RoomDetailsLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.BASELINE
                                )
                                .addComponent(
                                  Model,
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
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      RoomDetailsLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(
                          ReturnDate,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(Room2)
                        .addComponent(RoomTypeLab)
                        .addComponent(
                          Year,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
            )
            .addGap(12, 12, 12)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Room)
                .addComponent(
                  FuelType,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  23,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(Room1)
                .addComponent(
                  TotalPrice,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(
              RoomDetailsLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(PricePDay)
                .addComponent(
                  Price,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addComponent(jLabel1)
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
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(MenuBut)
                    .addGap(115, 115, 115)
                    .addComponent(Title)
                    .addGap(0, 0, Short.MAX_VALUE)
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      RoomDetails,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(18, 18, 18)
                    .addComponent(
                      CustDetails,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      50,
                      Short.MAX_VALUE
                    )
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          layout
                            .createSequentialGroup()
                            .addComponent(
                              BookBtn,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              188,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                            .addGap(18, 18, 18)
                        )
                        .addComponent(
                          search,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          188,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(
                          clearBut,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          188,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addComponent(jScrollPane1)
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
                .createParallelGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  false
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(BookBtn)
                    .addGap(18, 18, 18)
                    .addComponent(search)
                    .addGap(18, 18, 18)
                    .addComponent(clearBut)
                )
                .addComponent(
                  CustDetails,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
                .addComponent(
                  RoomDetails,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
            )
            .addGap(18, 18, 18)
            .addComponent(
              jScrollPane1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              228,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(28, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void EmailActionPerformed(java.awt.event.ActionEvent evt) {}

  private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {
    String receiptId = generateReceiptID();
    try {
      if (!sanitizeInput()) return;
      RecordBooking newBookingData = new RecordBooking(
        receiptId,
        currentCustomerData,
        tableSelectedCar,
        Integer.parseInt(RentDays.getText()),
        Double.parseDouble(TotalPrice.getText()),
        new Date(),
        df.parse(StartDate.getText()),
        df.parse(ReturnDate.getText()),
        "Pending",
        CardNum.getText(),
        AccHolder.getText(),
        Bank.getText()
      );
      GeneralMutation m = new GeneralMutation();
      if (m.addNewBooking(newBookingData)) {
        JOptionPane.showMessageDialog(
          this,
          "Booking has been added sucessfully, an confirmation email will be sent once admin approve your booking.",
          "Information",
          JOptionPane.INFORMATION_MESSAGE
        );
        JFrame frame = new JFrame("E-Receipt");
        JLabel lbl1 = new JLabel("Car Rental System");
        JLabel lbl2 = new JLabel(
          "---------------------------------------------------------------"
        );
        JLabel lbl3 = new JLabel("Bill:" + receiptId);
        JLabel lbl4 = new JLabel("Car No Plate     Start Date     End Date");
        JLabel lbl5 = new JLabel(
          CarNoPlate.getText() +
          "         " +
          StartDate.getText() +
          "          " +
          ReturnDate.getText()
        );
        JLabel lbl6 = new JLabel(
          "---------------------------------------------------------------"
        );
        JLabel lbl7 = new JLabel(
          "                                        Total Amount:" +
          TotalPrice.getText()
        );
        lbl1.setBounds(10, 10, 500, 50);
        lbl2.setBounds(10, 50, 500, 50);
        lbl3.setBounds(10, 110, 500, 50);
        lbl4.setBounds(10, 160, 500, 50);
        lbl5.setBounds(10, 210, 500, 50);
        lbl6.setBounds(10, 250, 500, 50);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);
        frame.add(lbl5);
        frame.add(lbl6);
        frame.add(lbl7);
        frame.setPreferredSize(new Dimension(500, 650));
        frame.pack();
        // Display the window.
        frame.setVisible(true);
        clear();
        setTable();
      } else {
        JOptionPane.showMessageDialog(
          this,
          "Failed to add booking",
          "Error Message",
          JOptionPane.ERROR_MESSAGE
        );
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void MenuButActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_MenuButActionPerformed
    //Direct to main menu
    MemberMenu menu = new MemberMenu();
    menu.setCurrentCustomerData(currentCustomerData);
    menu.setVisible(true);
    dispose();
  } //GEN-LAST:event_MenuButActionPerformed

  private void CarNoPlateActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_CarNoPlateActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_CarNoPlateActionPerformed

  private void ModelActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_ModelActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_ModelActionPerformed

  private void YearActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_YearActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_YearActionPerformed

  private void StartDateActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_StartDateActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_StartDateActionPerformed

  private void RentDaysActionPerformed(java.awt.event.ActionEvent evt) {}

  private void TotalPriceActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_TotalPriceActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_TotalPriceActionPerformed

  private void ReturnDateActionPerformed(java.awt.event.ActionEvent evt) {}

  private void PriceActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_PriceActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_PriceActionPerformed

  private void CardNumActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_CardNumActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_CardNumActionPerformed

  private void AccHolderActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_AccHolderActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_AccHolderActionPerformed

  private void BankActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_BankActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_BankActionPerformed

  private void RentDaysKeyReleased(java.awt.event.KeyEvent evt) { //GEN-FIRST:event_RentDaysKeyReleased
    String bookingStartDate = StartDate.getText();
    String totalDayStay = RentDays.getText();
    String records;
    String Car = CarNoPlate.getText();
    GeneralGetters g = new GeneralGetters();
    ArrayList<RecordBooking> allRecords = g.getAllBooking();
    Validator valid = new Validator();
    // will return whatever the key is released from the keyboard
    // but in char datatype
    char key = evt.getKeyChar();
    // backspace key character
    if (evt.getKeyChar() == ('\b')) return;
    // if input empty we are gonna assign totalDayStay as that key
    if (totalDayStay.isEmpty()) totalDayStay = Character.toString(key);
    // if there's no selected car to do calculatiaons, throw popup
    if (tableSelectedCar.getCarId() == null) {
      JOptionPane.showMessageDialog(
        this,
        "Please select a car first",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      return;
    }

    if (bookingStartDate.isEmpty()) {
      JOptionPane.showMessageDialog(
        this,
        "Starting date cannot be empty",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      return;
    }
    //
    // keycode 10 refers to ENTER key press
    if (
      !valid.isNumber(Character.toString(key)) &&
      evt.getKeyCode() != 10 &&
      !valid.isNumber(totalDayStay)
    ) {
      JOptionPane.showMessageDialog(
        this,
        "Invalid Day Stay",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      RentDays.setText("");
      ReturnDate.setText("");
      TotalPrice.setText("");
      return;
    }

    Date startDate, endDate;

    //Convert Day Rent into Integer
    int day = Integer.parseInt(RentDays.getText());
    //Check if Day larger than zero
    if (day <= 0) {
      //Display error message if day stau enter less than one
      JOptionPane.showMessageDialog(
        this,
        "Day stay cannot less than one day.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      return;
    }

    try {
      Date today = new Date();
      startDate = df.parse(bookingStartDate);
      if (startDate.before(today)) {
        //Display error message if the booking date has passed

        JOptionPane.showMessageDialog(
          this,
          "Error. The booking date has passed.",
          "Error Message",
          JOptionPane.ERROR_MESSAGE
        );
        StartDate.setText("");
        RentDays.setText("");
        ReturnDate.setText("");
        return;
      }

      //Call calendar features
      Calendar c = Calendar.getInstance();
      c.setTime(df.parse(bookingStartDate));
      //Calculate end date
      c.add(Calendar.DATE, day);
      String bookingEndDate = df.format(c.getTime());
      endDate = df.parse(bookingEndDate);
      //Set end date
      ReturnDate.setText(bookingEndDate);
      //Set total price
      TotalPrice.setText(
        String.valueOf(Double.parseDouble(Price.getText()) * day)
      );

      // check clash for end date
      for (RecordBooking r : allRecords) {
        if (
          r
            .getCar()
            .getCarNoPlate()
            .equalsIgnoreCase(tableSelectedCar.getCarNoPlate())
        ) if (
          (
            startDate.getTime() >= r.getStartDate().getTime() &&
            startDate.getTime() <= r.getReturnDate().getTime()
          ) ||
          (
            endDate.getTime() >= r.getStartDate().getTime() &&
            endDate.getTime() <= r.getReturnDate().getTime()
          ) ||
          (
            startDate.getTime() <= r.getStartDate().getTime() &&
            endDate.getTime() >= r.getReturnDate().getTime()
          )
        ) {
          JOptionPane.showMessageDialog(
            this,
            "The car is not available on selected date.",
            "Error Message",
            JOptionPane.ERROR_MESSAGE
          );
          clear();
          setTable();
          return;
        }
      }
    } catch (ParseException ex) {
      //Display error message if any error
      JOptionPane.showMessageDialog(
        this,
        "Invalid Date Format.",
        "Error Message",
        JOptionPane.ERROR_MESSAGE
      );
      StartDate.setText("");
      ReturnDate.setText("");
    }
  } //GEN-LAST:event_RentDaysKeyReleased

  private void searchActionPerformed(java.awt.event.ActionEvent evt) {
    // search
    GeneralGetters getter = new GeneralGetters();
    GeneralCar carQuery = new GeneralCar(
      null,
      !CarNoPlate.getText().isEmpty() ? CarNoPlate.getText() : null, // plate
      !Brand.getText().isEmpty() ? Brand.getText() : null, // brand
      !Model.getText().isEmpty() ? Model.getText() : null, // model
      null, // status
      0, // year
      0, // price
      null // fuel type
    );
    ArrayList<GeneralCar> queryList = (getter.getSpecificCar(carQuery));

    updateTableInformation(queryList);
  }

  private void clearButActionPerformed(java.awt.event.ActionEvent evt) {
    clear();
    setTable();
  }

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
    // select car based on table GUI
    GeneralGetters g = new GeneralGetters();
    JTable source = ((JTable) evt.getSource());
    int rowIndex = (source.getSelectedRow());
    int columnCount = (source.getModel().getColumnCount());

    ArrayList<Object> fetchedCarData = new ArrayList<>();
    for (int i = 0; i < columnCount; i++) {
      //((source.getModel().getValueAt(rowIndex, i)).getClass());
      fetchedCarData.add((source.getModel().getValueAt(rowIndex, i)));
    }
    tableSelectedCar.setCarId(
      g.getSpecificSingleCar(fetchedCarData.get(0).toString()).getCarId()
    );
    tableSelectedCar.setCarNoPlate(fetchedCarData.get(0).toString());
    tableSelectedCar.setBrand(fetchedCarData.get(1).toString());
    tableSelectedCar.setModel(fetchedCarData.get(2).toString());
    tableSelectedCar.setYear(
      Integer.parseInt(fetchedCarData.get(3).toString())
    );
    tableSelectedCar.setFuelType(fetchedCarData.get(4).toString());
    tableSelectedCar.setPrice(
      Double.parseDouble(fetchedCarData.get(5).toString())
    );
    tableSelectedCar.setState(
      g.getSpecificSingleCar(fetchedCarData.get(0).toString()).getState()
    );

    CarNoPlate.setText(tableSelectedCar.getCarNoPlate()); // plate
    Brand.setText(tableSelectedCar.getBrand()); // brand
    Model.setText(tableSelectedCar.getModel()); // model
    Price.setText(String.valueOf(tableSelectedCar.getPrice())); // price
    Year.setText(String.valueOf(tableSelectedCar.getYear())); // year
    FuelType.setSelectedItem(tableSelectedCar.getFuelType()); // fuel
  }

  public void clear() {
    CarNoPlate.setText("");
    Brand.setText("");
    Model.setText("");
    Year.setText("");
    FuelType.setSelectedItem("Petron");
    Price.setText("");
    StartDate.setText("");
    RentDays.setText("");
    ReturnDate.setText("");
    TotalPrice.setText("");
    IC.setText(currentCustomerData.getIC());
    Email.setText(currentCustomerData.getEmail());
    PhNum.setText(currentCustomerData.getPhNum());
    CardNum.setText("");
    AccHolder.setText("");
    Bank.setText("");
    //Get Table
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    //Clear all rows displayed in table to avoid duplicate record displayed
    model.setNumRows(0);
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
        .getLogger(BookCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(BookCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(BookCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(BookCar.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new BookCar().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField AccHolder;
  private javax.swing.JTextField Bank;
  private javax.swing.JButton BookBtn;
  private javax.swing.JLabel BookingLab;
  private javax.swing.JLabel BookingLab1;
  private javax.swing.JLabel BookingLab2;
  private javax.swing.JTextField Brand;
  private javax.swing.JTextField CarNoPlate;
  private javax.swing.JTextField CardNum;
  private javax.swing.JLabel Contact;
  private javax.swing.JPanel CustDetails;
  private javax.swing.JLabel CustDetailsLab;
  private javax.swing.JLabel Day;
  private javax.swing.JLabel Day1;
  private javax.swing.JTextField Email;
  private javax.swing.JComboBox<String> FuelType;
  private javax.swing.JTextField IC;
  private javax.swing.JLabel Mail;
  private javax.swing.JLabel Mail1;
  private javax.swing.JLabel Mail2;
  private javax.swing.JLabel Mail3;
  private javax.swing.JButton MenuBut;
  private javax.swing.JTextField Model;
  private javax.swing.JLabel Passport;
  private javax.swing.JTextField PhNum;
  private javax.swing.JTextField Price;
  private javax.swing.JLabel PricePDay;
  private javax.swing.JTextField RentDays;
  private javax.swing.JTextField ReturnDate;
  private javax.swing.JLabel Room;
  private javax.swing.JLabel Room1;
  private javax.swing.JLabel Room2;
  private javax.swing.JLabel Room3;
  private javax.swing.JPanel RoomDetails;
  private javax.swing.JLabel RoomDetailsLab;
  private javax.swing.JLabel RoomTypeLab;
  private javax.swing.JTextField StartDate;
  private javax.swing.JLabel Title;
  private javax.swing.JTextField TotalPrice;
  private javax.swing.JTextField Year;
  private javax.swing.JButton clearBut;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JButton search;
  // End of variables declaration//GEN-END:variables

}
