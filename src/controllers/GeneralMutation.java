package carrentalsystem;

import carrentalsystem.FileController;
import carrentalsystem.GeneralCar;
import carrentalsystem.RecordBooking;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class GeneralMutation {

  private String cwd = Path.of("").toAbsolutePath().toString();
  private String adminDatabase = cwd + "/Database/MainAdmin.txt";
  private String customerDatabse = cwd + "/Database/MainCustomer.txt";
  private String carDatabase = cwd + "/Database/MainCar.txt";
  private String bookingDatabase = cwd + "/Database/MainBooking.txt";
  private FileController f = new FileController();
  private GeneralGetters g = new GeneralGetters();
  private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

  public Boolean addNewAdmin(UserAdmin admin) {
    ArrayList<String> userData = new ArrayList<>();
    userData.add(admin.getId());
    userData.add(admin.getName());
    userData.add(admin.getPassword());
    userData.add(admin.getEmail());
    userData.add(admin.getPhNum());
    userData.add(admin.getPosition());

    Boolean status = f.addFile(userData, adminDatabase);
    return status;
  }

  public Boolean editExistingAdmin(UserAdmin oldAdmin, UserAdmin newAdmin) {
    ArrayList<String> userData = new ArrayList<>();
    userData.add(newAdmin.getId());
    userData.add(newAdmin.getName());
    userData.add(newAdmin.getPassword());
    userData.add(newAdmin.getEmail());
    userData.add(newAdmin.getPhNum());
    userData.add(newAdmin.getPosition());

    ArrayList<UserAdmin> admins = g.getAllAdmin();
    for (int i = 0; i < admins.size(); i++) {
      if (admins.get(i).getId().equalsIgnoreCase(oldAdmin.getId())) {
        f.modifyFile(userData, adminDatabase, Integer.toString(i));
        return true;
      }
    }
    return false;
  }

  public Boolean deleteExistingAdmin(UserAdmin admin) {
    ArrayList<UserAdmin> admins = g.getAllAdmin();
    for (int i = 0; i < admins.size(); i++) {
      if (admins.get(i).getId().equalsIgnoreCase(admin.getId())) {
        f.deleteFile(adminDatabase, Integer.toString(i));
        return true;
      }
    }
    return false;
  }

  public Boolean addNewCustomer(UserCustomer customer) {
    ArrayList<String> userData = new ArrayList<>();
    userData.add(customer.getId());
    userData.add(customer.getName());
    userData.add(customer.getPassword());
    userData.add(customer.getEmail());
    userData.add(customer.getPhNum());

    Boolean status = f.addFile(userData, customerDatabse);
    return status;
  }

  public Boolean editExistingCustomer(
    UserCustomer oldCustomer,
    UserCustomer newCustomer
  ) {
    ArrayList<String> userData = new ArrayList<>();
    userData.add(newCustomer.getId());
    userData.add(newCustomer.getName());
    userData.add(newCustomer.getPassword());
    userData.add(newCustomer.getEmail());
    userData.add(newCustomer.getPhNum());

    ArrayList<UserCustomer> cust = g.getAllCustomer();
    for (int i = 0; i < cust.size(); i++) {
      if (cust.get(i).getId().equalsIgnoreCase(oldCustomer.getId())) {
        f.modifyFile(userData, customerDatabse, Integer.toString(i));
        return true;
      }
    }
    return false;
  }

  public Boolean deleteExistingCustomer(UserCustomer customer) {
    ArrayList<UserCustomer> customers = g.getAllCustomer();

    for (int i = 0; i < customers.size(); i++) {
      if (customers.get(i).getId().equalsIgnoreCase(customer.getId())) {
        f.deleteFile(adminDatabase, Integer.toString(i));
        return true;
      }
    }
    return false;
  }

  public Boolean addNewCar(GeneralCar car) {
    ArrayList<String> carData = new ArrayList<>();
    carData.add(car.getCarNoPlate());
    carData.add(car.getBrand());
    carData.add(car.getModel());
    carData.add(car.getState());
    carData.add(String.valueOf(car.getYear()));
    carData.add(String.valueOf(car.getPrice()));
    carData.add(car.getFuelType());

    return f.addFile(carData, carDatabase);
  }

  public Boolean editExistingCar(GeneralCar oldCar, GeneralCar newCar) {
    ArrayList<String> carData = new ArrayList<>();
    carData.add(newCar.getCarNoPlate());
    carData.add(newCar.getBrand());
    carData.add(newCar.getModel());
    carData.add(newCar.getState());
    carData.add(String.valueOf(newCar.getYear()));
    carData.add(String.valueOf(newCar.getPrice()));
    carData.add(newCar.getFuelType());

    ArrayList<GeneralCar> allCars = g.getAllCar();
    for (int i = 0; i < allCars.size(); i++) {
      if (
        allCars.get(i).getCarNoPlate().equalsIgnoreCase(oldCar.getCarNoPlate())
      ) {
        return f.modifyFile(carData, carDatabase, Integer.toString(i));
      }
    }
    return false;
  }

  public Boolean deleteExistingCar(GeneralCar car) {
    ArrayList<GeneralCar> allCars = g.getAllCar();

    for (int i = 0; i < allCars.size(); i++) {
      if (
        allCars.get(i).getCarNoPlate().equalsIgnoreCase(car.getCarNoPlate())
      ) {
        return f.deleteFile(carDatabase, Integer.toString(i));
      }
    }
    return false;
  }

  public Boolean addNewBooking(RecordBooking booking) {
    ArrayList<String> recordData = new ArrayList<>();
    recordData.add(booking.getReceiptID());
    recordData.add(booking.getCustomer().getIC());
    recordData.add(booking.getCar().getCarNoPlate());
    recordData.add(String.valueOf(booking.getDays()));
    recordData.add(String.valueOf(booking.getTotalPrice()));
    recordData.add(df.format(booking.getBookingDate()));
    recordData.add(df.format(booking.getStartDate()));
    recordData.add(df.format(booking.getReturnDate()));

    return f.addFile(recordData, bookingDatabase);
  }

  public Boolean editExistingBooking(
    RecordBooking oldBooking,
    RecordBooking newBooking
  ) {
    ArrayList<String> recordData = new ArrayList<>();
    recordData.add(newBooking.getReceiptID());
    recordData.add(newBooking.getCustomer().getIC());
    recordData.add(newBooking.getCar().getCarNoPlate());
    recordData.add(String.valueOf(newBooking.getDays()));
    recordData.add(String.valueOf(newBooking.getTotalPrice()));
    recordData.add(df.format(newBooking.getBookingDate()));
    recordData.add(df.format(newBooking.getStartDate()));
    recordData.add(df.format(newBooking.getReturnDate()));

    ArrayList<RecordBooking> allBookings = g.getAllBooking();
    for (int i = 0; i < allBookings.size(); i++) {
      if (
        allBookings
          .get(i)
          .getReceiptID()
          .equalsIgnoreCase(oldBooking.getReceiptID())
      ) {
        return f.modifyFile(recordData, carDatabase, Integer.toString(i));
      }
    }
    return false;
  }

  public Boolean deleteExistingBooking(RecordBooking booking) {
    ArrayList<RecordBooking> allBookings = g.getAllBooking();
    for (int i = 0; i < allBookings.size(); i++) {
      if (
        allBookings
          .get(i)
          .getReceiptID()
          .equalsIgnoreCase(booking.getReceiptID())
      ) {
        return f.deleteFile(carDatabase, Integer.toString(i));
      }
    }
    return false;
  }
}
