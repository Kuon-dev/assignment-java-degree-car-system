package carrentalsystem;

import carrentalsystem.GeneralCar;
import carrentalsystem.RecordBooking;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class GeneralMutation {

  private String cwd = Path.of("").toAbsolutePath().toString();
  private String adminDatabase = cwd + "/Database/MainAdmin.txt";
  private String customerDatabse = cwd + "/Database/MainCustomer.txt";
  private String carDatabase = cwd + "/Database/MainCar.txt";
  private String bookingDatabase = cwd + "/Database/MainBooking.txt";
  private String logDatabase = cwd + "/Database/MainLog.txt";
  private FileController f = new FileController();
  private GeneralGetters g = new GeneralGetters();
  private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

  public void logLoginActivity(UserCustomer customer) {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    ArrayList<String> data = new ArrayList<>();
    data.add(customer.getIC());
    data.add(df.format(date));
    data.add("User login");
    f.addFile(data, logDatabase);
  }

  public void logLoginActivity(UserAdmin admin) {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    ArrayList<String> data = new ArrayList<>();
    data.add(admin.getId());
    data.add(df.format(date));
    data.add("Admin login");
    f.addFile(data, logDatabase);
  }

  public void logLogoutActivity(UserCustomer customer) {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    ArrayList<String> data = new ArrayList<>();
    data.add(customer.getIC());
    data.add(df.format(date));
    data.add("User logout");
    f.addFile(data, logDatabase);
  }

  public void logLogoutActivity(UserAdmin admin) {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

    ArrayList<String> data = new ArrayList<>();
    data.add(admin.getId());
    data.add(df.format(date));
    data.add("Admin logout");
    f.addFile(data, logDatabase);
  }

  // ---------------------------------------------
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

  // ---------------------------------------------
  public Boolean addNewCustomer(UserCustomer customer) {
    ArrayList<String> userData = new ArrayList<>();
    userData.add(customer.getIC());
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
    userData.add(newCustomer.getIC());
    userData.add(newCustomer.getName());
    userData.add(newCustomer.getPassword());
    userData.add(newCustomer.getEmail());
    userData.add(newCustomer.getPhNum());

    ArrayList<UserCustomer> cust = g.getAllCustomer();
    for (int i = 0; i < cust.size(); i++) {
      if (cust.get(i).getIC().equalsIgnoreCase(oldCustomer.getIC())) {
        f.modifyFile(userData, customerDatabse, Integer.toString(i));
        return true;
      }
    }
    return false;
  }

  public Boolean deleteExistingCustomer(UserCustomer customer) {
    ArrayList<UserCustomer> customers = g.getAllCustomer();

    for (int i = 0; i < customers.size(); i++) {
      if (customers.get(i).getIC().equalsIgnoreCase(customer.getIC())) {
        f.deleteFile(adminDatabase, Integer.toString(i));
        return true;
      }
    }
    return false;
  }

  // ---------------------------------------------
  public Boolean addNewCar(GeneralCar car) {
    ArrayList<String> carData = new ArrayList<>();
    carData.add(car.getCarId());
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
    carData.add(newCar.getCarId());
    carData.add(newCar.getCarNoPlate());
    carData.add(newCar.getBrand());
    carData.add(newCar.getModel());
    carData.add(newCar.getState());
    carData.add(String.valueOf(newCar.getYear()));
    carData.add(String.valueOf(newCar.getPrice()));
    carData.add(newCar.getFuelType());

    ArrayList<GeneralCar> allCars = g.getAllCar();
    for (int i = 0; i < allCars.size(); i++) {
      if (allCars.get(i).getCarId().equalsIgnoreCase(oldCar.getCarId())) {
        return f.modifyFile(carData, carDatabase, Integer.toString(i));
      }
    }
    return false;
  }

  public Boolean deleteExistingCar(GeneralCar car) {
    ArrayList<GeneralCar> allCars = g.getAllCar();

    for (int i = 0; i < allCars.size(); i++) {
      if (allCars.get(i).getCarId().equalsIgnoreCase(car.getCarId())) {
        return f.deleteFile(carDatabase, Integer.toString(i));
      }
    }
    return false;
  }

  // ---------------------------------------------
  public Boolean addNewBooking(RecordBooking booking) {
    ArrayList<String> Data = new ArrayList<>();
    Data.add(booking.getReceiptID());
    Data.add(booking.getCustomer().getIC());
    Data.add(booking.getCar().getCarNoPlate());
    Data.add(String.valueOf(booking.getDays()));
    Data.add(String.valueOf(booking.getTotalPrice()));
    Data.add(df.format(booking.getBookingDate()));
    Data.add(df.format(booking.getStartDate()));
    Data.add(df.format(booking.getReturnDate()));
    Data.add(booking.getStatus());
    Data.add(booking.getCardNum());
    Data.add(booking.getAccHolder());
    Data.add(booking.getBank());

    return f.addFile(Data, bookingDatabase);
  }

  public Boolean editExistingBooking(
    RecordBooking oldBooking,
    RecordBooking newBooking
  ) {
    ArrayList<String> Data = new ArrayList<>();
    Data.add(newBooking.getReceiptID());
    Data.add(newBooking.getCustomer().getIC());
    Data.add(newBooking.getCar().getCarId());
    Data.add(String.valueOf(newBooking.getDays()));
    Data.add(String.valueOf(newBooking.getTotalPrice()));
    Data.add(df.format(newBooking.getBookingDate()));
    Data.add(df.format(newBooking.getStartDate()));
    Data.add(df.format(newBooking.getReturnDate()));
    Data.add(newBooking.getStatus());

    ArrayList<RecordBooking> allBookings = g.getAllBooking();
    for (int i = 0; i < allBookings.size(); i++) {
      if (
        allBookings
          .get(i)
          .getReceiptID()
          .equalsIgnoreCase(oldBooking.getReceiptID())
      ) {
        return f.modifyFile(Data, bookingDatabase, Integer.toString(i));
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
        return f.deleteFile(bookingDatabase, Integer.toString(i));
      }
    }
    return false;
  }
  // ---------------------------------------------
  //
}
