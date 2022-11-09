package carrentalsystem;

import carrentalsystem.FileController;
import carrentalsystem.GeneralCar;
import carrentalsystem.UserAdmin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.*;

public class GeneralGetters {

  private String cwd = Path.of("").toAbsolutePath().toString();
  private String adminDatabase = cwd + "/Database/MainAdmin.txt";
  private String customerDatabse = cwd + "/Database/MainCustomer.txt";
  private String carDatabase = cwd + "/Database/MainCar.txt";

  public ArrayList<UserAdmin> getAllAdmin() {
    FileController f = new FileController();

    List<ArrayList<String>> data = f.readFile(adminDatabase);
    ArrayList<UserAdmin> users = new ArrayList<UserAdmin>();
    for (ArrayList<String> user : data) {
      UserAdmin a = new UserAdmin(
        user.get(0),
        user.get(1),
        user.get(2),
        user.get(3),
        user.get(4),
        user.get(5)
      );
      users.add(a);
    }
    return users;
  }

  public UserAdmin getSpecificAdmin(String id) {
    ArrayList<UserAdmin> allAdmins = getAllAdmin();
    for (UserAdmin admin : allAdmins) {
      if (admin.getId() == id) return admin;
    }
    // this shouldn't happen anyway
    return allAdmins.get(0);
  }

  public ArrayList<UserCustomer> getAllCustomer() {
    FileController f = new FileController();

    List<ArrayList<String>> data = f.readFile(customerDatabse);
    ArrayList<UserCustomer> users = new ArrayList<UserCustomer>();
    for (ArrayList<String> user : data) {
      UserCustomer c = new UserCustomer(
        user.get(0),
        user.get(1),
        user.get(2),
        user.get(3),
        user.get(4)
      );
      users.add(c);
    }
    return users;
  }

  public ArrayList<GeneralCar> getAllCar() {
    FileController f = new FileController();
    List<ArrayList<String>> data = f.readFile(carDatabase);
    ArrayList<GeneralCar> allCars = new ArrayList<GeneralCar>();
    for (ArrayList<String> car : data) {
      GeneralCar c = new GeneralCar(
        car.get(0),
        car.get(1),
        car.get(2),
        car.get(3),
        Integer.parseInt(car.get(4)),
        Double.parseDouble(car.get(5)),
        car.get(6)
      );
      allCars.add(c);
    }
    return allCars;
  }

  public ArrayList<GeneralCar> getSpecificCar(GeneralCar carQuery) {
    ArrayList<GeneralCar> allCars = getAllCar();

    ArrayList<GeneralCar> filteredCars = new ArrayList<GeneralCar>();
    for (ArrayList<String> car : data) {
      GeneralCar c = new GeneralCar(
        car.get(0),
        car.get(1),
        car.get(2),
        car.get(3),
        Integer.parseInt(car.get(4)),
        Double.parseDouble(car.get(5)),
        car.get(6)
      );
      if (
        carQuery.getCarNoPlate() != null &&
        carQuery.getCarNoPlate() == c.getCarNoPlate()
      ) {
        filtereCars.add(c);
      }
      if (carQuery.getBrand() != null && carQuery.getBrand() == c.getBrand()) {
        filtereCars.add(c);
      }
      if (carQuery.getModel() != null && carQuery.getModel() == c.getModel()) {
        filtereCars.add(c);
      }
      if (carQuery.getState() != null && carQuery.getState() == c.getState()) {
        filtereCars.add(c);
      }
      if (carQuery.getYear() != 0 && carQuery.getYear() == c.getYear()) {
        filtereCars.add(c);
      }
      if (carQuery.getPrice() != 0 && carQuery.getPrice() == c.getPrice()) {
        filtereCars.add(c);
      }
      if (
        carQuery.getFuelType() != null &&
        carQuery.getFuelType() == c.getFuelType()
      ) {
        filtereCars.add(c);
      }
    }
    return filteredCars;
  }
}
