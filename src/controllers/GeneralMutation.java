package carrentalsystem;

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

import carrentalsystem.FileController;
import carrentalsystem.UserAdmin;

public class GeneralMutation {

  private String cwd = Path.of("").toAbsolutePath().toString();
  private String adminDatabase = cwd + "/Database/MainAdmin.txt";
  private String customerDatabse = cwd + "/Database/MainCustomer.txt";

  public Boolean addNewAdmin(UserAdmin admin){
    
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
}
