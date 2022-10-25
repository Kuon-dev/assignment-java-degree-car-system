package jp_lab5_gui;

public class GeneralBill {
  public int receipt_id, customer_id;
  public String bank;
  public datetime booking_date;

  // get set
  public int getReceiptId() {
    return receipt_id;
  }

  public void setReceiptId(int receipt){
    this.receipt_id = receipt;
  }

  public int getCustomerId() {
    return customer_id;
  }

  public void setCustomerId(int customer_id){
    this.customer_id = customer_id;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank){
    this.bank = bank;
  }

  public datetime getBookingDate() {
    return booking_date;
  }

  public void setBookingDate(datetime booking_date) {
    this.booking_date = booking_date;
  }

}
