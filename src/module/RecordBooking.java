package carrentalsystem;

import java.util.Date;
import java.util.Random;

public class RecordBooking {

  public String receiptID;
  public UserCustomer customer;
  public GeneralCar car;
  public double totalPrice;
  public int days;
  public Date bookingDate, startDate, returnDate;
  public String status, cardNum, accHolder, bank;

  public RecordBooking(
    String receiptID,
    UserCustomer customer,
    GeneralCar car,
    int days,
    double totalPrice,
    Date bookingDate,
    Date startDate,
    Date returnDate,
    String status,
    String cardNum,
    String accHolder,
    String bank
  ) {
    this.receiptID = receiptID;
    this.customer = customer;
    this.car = car;
    this.days = days;
    this.totalPrice = totalPrice;
    this.bookingDate = bookingDate;
    this.startDate = startDate;
    this.returnDate = returnDate;
    this.status = status;
    this.cardNum = cardNum;
    this.accHolder = accHolder;
    this.bank = bank;
  }

  // getter setters
  // ------------------
  public String getReceiptID() {
    return receiptID;
  }

  public void setReceiptID(String receiptID) {
    this.receiptID = receiptID;
  }

  public GeneralCar getCar() {
    return car;
  }

  public void setCar(GeneralCar car) {
    this.car = car;
  }

  public UserCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(UserCustomer customer) {
    this.customer = customer;
  }

  public int getDays() {
    return days;
  }

  public void setDays(int days) {
    this.days = days;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Date getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(Date bookingDate) {
    this.bookingDate = bookingDate;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCardNum() {
    return cardNum;
  }

  public void setCardNum(String cardNum) {
    this.cardNum = cardNum;
  }

  public String getAccHolder() {
    return accHolder;
  }

  public void setAccHolder(String accHolder) {
    this.accHolder = accHolder;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  // ----------------------

  public void clearData() {
    this.receiptID = null;
    this.customer = null;
    this.car = null;
    this.days = 0;
    this.totalPrice = 0;
    this.bookingDate = null;
    this.startDate = null;
    this.returnDate = null;
    this.cardNum = null;
    this.accHolder = null;
    this.bank = null;
  }
}
