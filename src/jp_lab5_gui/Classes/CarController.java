package jp_lab5_gui;

import java.util.ArrayList;

public class CarController {
  private final ArrayList<GeneralCar> allCars;
  // private final ArrayList<GeneralCar> availableCars;

  public CarController(ArrayList<GeneralCar> cars){
    this.allCars = cars;
  }

  public ArrayList<GeneralCar> getAvailableCars(){
    return allCars;
  }
}
