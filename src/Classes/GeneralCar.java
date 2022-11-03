package jp_lab5_gui;

public class GeneralCar {

  public String car_no_plate, brand, model, status, type_of_fuel;
  public int year;
  public double price;

  // get set
  public String getCarNoPlate() {
    return car_no_plate;
  }

  public void setCarNoplate(String plate) {
    this.car_no_plate = plate;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getState() {
    return status;
  }

  public void setState(String status) {
    this.status = status;
  }

  public String getFuelType() {
    return type_of_fuel;
  }

  public void setFuelType(String type) {
    this.type_of_fuel = type;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  //
}
