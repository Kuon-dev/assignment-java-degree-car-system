package carrentalsystem;

import java.util.ArrayList;
import java.util.Random;

public class GeneralCar {

  public String carId, carNoPlate, brand, model, status, typeOfFuel;
  public int year;
  public double price;

  public GeneralCar(
    String carId,
    String carNoPlate,
    String brand,
    String model,
    String status,
    int year,
    double price,
    String typeOfFuel
  ) {
    this.carId = carId;
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
  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }

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
    if (!isCarPlateExist()) return;
    GeneralGetters g = new GeneralGetters();
    ArrayList<GeneralCar> allUsers = g.getAllCar();
    for (GeneralCar c : allUsers) {
      if (c.getCarId().equalsIgnoreCase(this.carId)) {
        this.carNoPlate = c.getCarNoPlate();
        this.brand = c.getBrand();
        this.model = c.getModel();
        this.status = c.getState();
        this.year = c.getYear();
        this.price = c.getPrice();
        this.typeOfFuel = c.getFuelType();
      }
    }
  }

  public Boolean isCarPlateExist() {
    GeneralGetters g = new GeneralGetters();
    ArrayList<GeneralCar> allCars = g.getAllCar();
    for (GeneralCar car : allCars) {
      if (car.getCarNoPlate().equals(this.carNoPlate)) return true;
    }
    return false;
  }

  public String generateCarId() {
    String availableChar =
      "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
      "abcdefghijklmnopqrstuvwxyz" +
      "0123456789";

    StringBuilder sb = new StringBuilder("C-");
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
      // generate random index number
      int index = random.nextInt(availableChar.length());
      // get character specified by index
      char randomChar = availableChar.charAt(index);
      // append the character to string builder
      sb.append(randomChar);
    }

    return sb.toString();
  }
}
