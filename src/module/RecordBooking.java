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

  public RecordBooking(
    String receiptID,
    UserCustomer customer,
    GeneralCar car,
    int days,
    double totalPrice,
    Date bookingDate,
    Date startDate,
    Date endDate
  ) {
    this.receiptID = receiptID;
    this.customer = customer;
    this.car = car;
    this.days = days;
    this.totalPrice = totalPrice;
    this.bookingDate = bookingDate;
    this.startDate = startDate;
    this.returnDate = endDate;
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
    return bookingDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  // ----------------------

  public String generateReceiptID() {
    String availableChar =
      "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
      "abcdefghijklmnopqrstuvwxyz" +
      "0123456789";

    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < 15; i++) {
      // generate random index number
      int index = random.nextInt(availableChar.length());
      // get character specified by index
      char randomChar = availableChar.charAt(index);
      // append the character to string builder
      sb.append(randomChar);
    }

    return sb.toString();
  }

  public void clearData() {
    this.receiptID = null;
    this.customer = null;
    this.car = null;
    this.days = 0;
    this.totalPrice = 0;
    this.bookingDate = null;
    this.startDate = null;
    this.returnDate = null;
  }
}
