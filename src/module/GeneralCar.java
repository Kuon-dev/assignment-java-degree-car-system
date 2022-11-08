package jp_lab5_gui;

public class GeneralCar {

  public String carNoPlate, brand, model, status, typeOfFuel;
  public int year;
  public double price;

  // get set
  // -------------------------------------
  public String getCarNoPlate() {
    return carNoPlate;
  }

  public void setCarNoplate(String plate) {
    this.carNoPlate = plate;
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
    return typeOfFuel;
  }

  public void setFuelType(String type) {
    this.typeOfFuel = type;
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
  // -------------------------------------
}
