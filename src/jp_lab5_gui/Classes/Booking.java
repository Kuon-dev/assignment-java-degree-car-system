package jp_lab5_gui;
import java.util.Date;

public class Booking extends GeneralBill {
  public Date start_date, end_date;  
  public int days;
  public double price;
  public String car_no_plate;

  // get set
  public Date getStartDate() {
    return start_date;
  }

  public void setStartDate(Date date) {
    this.start_date = date;
  }

  public Date getEndDate(){
    return end_date;
  }

  public void setEndDate(Date date) {
    this.end_date = date;
  }

  public int getDays(){
    return days;
  }

  public void setDays(int days) {
    this.days = days;
  }

  public float getPrice(){
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getCarNoPlate() {
    return car_no_plate;
  }

  public void setCarNoplate(String plate){
    this.car_no_plate = plate;
  }

}
