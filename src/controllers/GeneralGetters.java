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

public class GeneralGetters {

  private String cwd = Path.of("").toAbsolutePath().toString();
  private String adminDatabase = cwd + "/Database/MainAdmin.txt";
  private String customerDatabse = cwd + "/Database/MainCustomer.txt";

  public ArrayList<UserAdmin> getAllAdmin() {
    FileController f = new FileController();

    List<ArrayList<String>> data = f.readFile(adminDatabase);
    ArrayList<UserAdmin> users = new ArrayList<UserAdmin>();
    for (ArrayList<String> user : data) {
      UserAdmin a = new UserAdmin(user.get(0), user.get(1), user.get(2), user.get(3), user.get(4), user.get(5));
      users.add(a);
    }
    return users;
  }
}
