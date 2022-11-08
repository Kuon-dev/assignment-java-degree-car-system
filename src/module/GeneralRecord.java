package carrentalsystem;

import java.util.Date;

public class GeneralRecord {
  public String receiptID, bank;
  public Date bookingDate;
  public double amount;
  public UserCustomer customer;

  // getter setters
  // ------------------
  public String getReceiptID() {
    return receiptID;
  }

  public void setReceiptID(String receiptID) {
    this.receiptID = receiptID;
  }

  public Date getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(Date bookingDate) {
    this.bookingDate = bookingDate;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank){
    this.bank = bank;
  }

  public double getAmount(){
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public UserCustomer getCustomer() {
    return customer;	
  }

  public void setCustomer(UserCustomer customer) {
    this.customer = customer;	
  }

  // ----------------------

}
