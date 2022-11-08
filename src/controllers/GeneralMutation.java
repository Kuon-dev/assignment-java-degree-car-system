package carrentalsystem;

import carrentalsystem.FileController;
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

public class GeneralMutation {

  private String cwd = Path.of("").toAbsolutePath().toString();
  private String adminDatabase = cwd + "/Database/MainAdmin.txt";
  private String customerDatabse = cwd + "/Database/MainCustomer.txt";

  public Boolean addNewAdmin(UserAdmin admin) {
    ArrayList<String> userData = new ArrayList<>();
    userData.add(admin.getId());
    userData.add(admin.getName());
    userData.add(admin.getPassword());
    userData.add(admin.getEmail());
    userData.add(admin.getPhNum());
    userData.add(admin.getPosition());

    FileController f = new FileController();
    Boolean status = f.addFile(userData, adminDatabase);
    return status;
  }

  public Boolean editExistingAdmin(UserAdmin admin) {
    ArrayList<String> userData = new ArrayList<>();
    userData.add(admin.getId());
    userData.add(admin.getName());
    userData.add(admin.getPassword());
    userData.add(admin.getEmail());
    userData.add(admin.getPhNum());
    userData.add(admin.getPosition());

    FileController f = new FileController();
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserAdmin> admins = g.getAllAdmin();
    for (int i = 0; i < admins.size(); i++) {
      if (admins.get(i).getId() == admin.getId()) {
        f.modifyFile(userData, adminDatabase, Integer.toString(i));
        return true;
      }
    }
    return false;
  }

  public Boolean deleteExistingAdmin(UserAdmin admin) {
    FileController f = new FileController();
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserAdmin> admins = g.getAllAdmin();
    for (int i = 0; i < admins.size(); i++) {
      if (admins.get(i).getId() == admin.getId()) {
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

    FileController f = new FileController();
    Boolean status = f.addFile(userData, customerDatabse);
    return status;
  }

  public Boolean editExistingCustomer(UserCustomer customer) {
    ArrayList<String> userData = new ArrayList<>();
    userData.add(customer.getId());
    userData.add(customer.getName());
    userData.add(customer.getPassword());
    userData.add(customer.getEmail());
    userData.add(customer.getPhNum());

    FileController f = new FileController();
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserCustomer> cust = g.getAllCustomer();
    for (int i = 0; i < cust.size(); i++) {
      if (cust.get(i).getId() == customer.getId()) {
        f.modifyFile(userData, customerDatabse, Integer.toString(i));
        return true;
      }
    }
    return false;
  }

  public Boolean deleteExistingCustomer(UserCustomer customer) {
    FileController f = new FileController();
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserCustomer> customers = g.getAllCustomer();
    for (int i = 0; i < customers.size(); i++) {
      if (customers.get(i).getId() == customer.getId()) {
        f.deleteFile(adminDatabase, Integer.toString(i));
        return true;
      }
    }
    return false;
  }
}
