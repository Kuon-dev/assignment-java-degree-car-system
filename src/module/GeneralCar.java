package carrentalsystem;

import java.util.ArrayList;

public class GeneralCar {

  public String carNoPlate, brand, model, status, typeOfFuel;
  public int year;
  public double price;

  public GeneralCar(
    String carNoPlate,
    String brand,
    String model,
    String status,
    int year,
    double price,
    String typeOfFuel
  ) {
    this.carNoPlate = carNoPlate;
    this.brand = brand;
    this.model = model;
    this.status = status;
    this.year = year;
    this.price = price;
    this.typeOfFuel = typeOfFuel;
  }

  // get set
  // -------------------------------------
  public String getCarNoPlate() {
    return carNoPlate;
  }

  public void setCarNoPlate(String plate) {
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
  public void clearData() {
    setCarNoPlate(null);
    setYear(0);
    setBrand(null);
    setState(null);
    setFuelType(null);
    setModel(null);
    setPrice(0);
  }

  public void setData() {
    if (!isCarExist()) return;
    GeneralGetters g = new GeneralGetters();
    ArrayList<GeneralCar> allUsers = g.getAllCar();
    for (GeneralCar c : allUsers) {
      if (c.getCarNoPlate().equalsIgnoreCase(this.carNoPlate)) {
        this.brand = c.getBrand();
        this.model = c.getModel();
        this.status = c.getState();
        this.year = c.getYear();
        this.price = c.getPrice();
        this.typeOfFuel = c.getFuelType();
      }
    }
  }

  public Boolean isCarExist() {
    GeneralGetters g = new GeneralGetters();
    ArrayList<GeneralCar> allCars = g.getAllCar();
    for (GeneralCar car : allCars) {
      if (car.getCarNoPlate().equals(this.carNoPlate)) return true;
    }
    return false;
  }
}
