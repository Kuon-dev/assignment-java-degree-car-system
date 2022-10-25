package jp_lab5_gui;

public class Report {
  public datetime date;
  public double sales;

  // get set
  public datetime getDate() {
    return date;
  }

  public void setDate(datetime date){
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
