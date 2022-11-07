package carrentalsystem;

import java.nio.file.Path;
import java.util.*;

public class GeneralUser {

  String userID;
  String userName;
  String userPassword;
  String userEmail;
  String userPhNum;
  private String cwd = Path.of("").toAbsolutePath().toString();

  // getter setters
  // -----------------------------------------------------------------------------
  public void setId(String userInput) {
    this.userID = userInput;
  }

  public String getId() {
    return userID;
  }

  public void setName(String userInput) {
    this.userName = userInput;
  }

  public String getName() {
    return userName;
  }

  public void setPassword(String userInput) {
    this.userPassword = userInput;
  }

  public String getPassword() {
    return userPassword;
  }

  public void setEmail(String email) {
    this.userEmail = email;
  }

  public String getEmail() {
    return userEmail;
  }

  public void setPhNum(String phnum) {
    this.userPhNum = phnum;
  }

  public String getPhNum() {
    return userPhNum;
  }

  // Shared functions
  // -----------------------------------------------------------------------------

  public Boolean userLogin(
    String inputName,
    String inputPassword,
    String path
  ) {

    GeneralGetters getters = new GeneralGetters();
    ArrayList<UserAdmin> admins = getters.getAllAdmin();
    for (int i = 0; i < admins.size(); i++) {
      String adminName = admins.get(i).getName();
      String adminPassword = admins.get(i).getPassword();
      if (
        userName.equalsIgnoreCase(inputName) && userPassword.equals(inputPassword))
        return true;
    }
    return false;
  }

  public void userRegister() {
  }

  public ArrayList<String> getUserData(String targetUser, String path) {
    FileController getters = new FileController();
    String destination = cwd + path;
    ArrayList<String> userObj = new ArrayList<>();

    List<ArrayList<String>> result = getters.readFile(destination);
    for (int i = 0; i < result.size(); i++) {
      ArrayList<String> currentLine = result.get(i);
      for (int j = 0; j < currentLine.size(); j++) {
        if (currentLine.get(j).equalsIgnoreCase(targetUser)) {
          userObj = currentLine;
          return userObj;
        }
      }
    }
    if (userObj.isEmpty()) System.out.println("Something went wrong"); // shouldn't happen at all // somehow the user is able to login, but inable to fetch data
    return userObj;
  }
}
