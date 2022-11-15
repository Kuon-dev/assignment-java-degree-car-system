package carrentalsystem;

import carrentalsystem.FileController;
import carrentalsystem.GeneralCar;
import carrentalsystem.RecordBooking;
import carrentalsystem.UserAdmin;
import carrentalsystem.UserCustomer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;

public class GeneralGetters {

  private String cwd = Path.of("").toAbsolutePath().toString();
  private String adminDatabase = cwd + "/Database/MainAdmin.txt";
  private String customerDatabse = cwd + "/Database/MainCustomer.txt";
  private String carDatabase = cwd + "/Database/MainCar.txt";
  private String bookingDatabase = cwd + "/Database/MainBooking.txt";
  private FileController f = new FileController();

  public ArrayList<UserAdmin> getAllAdmin() {
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
      if (admin.getId().equalsIgnoreCase(id)) return admin;
    }
    // this shouldn't happen anyway
    // because the user should exist, otherwise the argument is wrong
    throw new EmptyStackException();
  }

  // ---------------------------------------------
  public ArrayList<UserCustomer> getAllCustomer() {
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

  public UserCustomer getSpecificCustomer(String ic) {
    ArrayList<UserCustomer> allCustomers = getAllCustomer();
    for (UserCustomer c : allCustomers) {
      if (c.getIC().equalsIgnoreCase(ic)) return c;
    }

    throw new EmptyStackException();
  }

  // ---------------------------------------------
  public ArrayList<GeneralCar> getAllCar() {
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

    // loop within the car list, if there is a record that matches the query,
    // then return a list of car that matches the car query.
    ArrayList<GeneralCar> filteredCars = new ArrayList<GeneralCar>();
    for (GeneralCar c : allCars) {
      if (
        carQuery.getCarNoPlate() != null &&
        carQuery.getCarNoPlate().equalsIgnoreCase(c.getCarNoPlate())
      ) {
        filteredCars.add(c);
      }
      if (
        carQuery.getBrand() != null &&
        carQuery.getBrand().equalsIgnoreCase(c.getBrand())
      ) {
        filteredCars.add(c);
      }
      if (
        carQuery.getModel() != null &&
        carQuery.getModel().equalsIgnoreCase(c.getModel())
      ) {
        filteredCars.add(c);
      }
      if (
        carQuery.getState() != null &&
        carQuery.getState().equalsIgnoreCase(c.getState())
      ) {
        filteredCars.add(c);
      }
      if (carQuery.getYear() != 0 && carQuery.getYear() == (c.getYear())) {
        filteredCars.add(c);
      }
      if (carQuery.getPrice() != 0 && carQuery.getPrice() == (c.getPrice())) {
        filteredCars.add(c);
      }
      if (
        carQuery.getFuelType() != null &&
        carQuery.getFuelType().equalsIgnoreCase(c.getFuelType())
      ) {
        filteredCars.add(c);
      }
    }
    return filteredCars;
  }

  public GeneralCar getSpecificSingleCar(String carPlate) {
    ArrayList<GeneralCar> allCars = getAllCar();
    for (GeneralCar c : allCars) {
      if (c.getCarNoPlate().equals(carPlate)) return c;
    }
    // return empty car
    return new GeneralCar(null, null, null, null, 0, 0, null);
  }

  // ---------------------------------------------
  public ArrayList<RecordBooking> getAllBooking() {
    List<ArrayList<String>> data = f.readFile(bookingDatabase);
    ArrayList<RecordBooking> allBookings = new ArrayList<RecordBooking>();

    try {
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
      for (ArrayList<String> booking : data) {
        GeneralCar bookedCar = new GeneralCar(
          booking.get(2),
          null,
          null,
          null,
          0,
          0,
          null
        );
        RecordBooking b = new RecordBooking(
          booking.get(0), // receiptID
          getSpecificCustomer(booking.get(1)), // customerID
          // because this returns an arraylist, have to get index of 0
          getSpecificCar(bookedCar).get(0), // car
          Integer.parseInt(booking.get(3)), // days
          Double.parseDouble(booking.get(4)), // price
          df.parse(booking.get(5)),
          df.parse(booking.get(6)),
          df.parse(booking.get(7))
        );
        allBookings.add(b);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      return allBookings;
    }
  }

  public RecordBooking getSpecificBooking(String receiptID) {
    ArrayList<RecordBooking> allBookings = getAllBooking();

    for (RecordBooking record : allBookings) {
      if (record.getReceiptID().equals(receiptID)) return record;
    }

    return new RecordBooking(null, null, null, null, 0, null, null, null);
  }
}
