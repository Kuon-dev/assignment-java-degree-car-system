package jp_lab5_gui;

import java.util.Date;

public class Report extends Booking {

  public Date date;
  public double sales;

  // get set
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public double getSales() {
    return sales;
  }

  public void setSales(double sales) {
    this.sales = sales;
  }

  public double totalSales() {
    // readfile is needed i suppose
    return sales;
  }
}
