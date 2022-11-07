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
    FileController mutation = new FileController();
    // this is just a demo usage, not intended for production use
    // String demo_path = (cwd + "/Database/MainAdmin.txt");
    String destination = cwd + path;

    List<ArrayList<String>> result = mutation.readFile(destination);
    // result is a 2d array
    for (int i = 0; i < result.size(); i++) {
      name = result.get(i).get(1);
      userPassword = result.get(i).get(2);
      if (
        name.equalsIgnoreCase(inputName) && userPassword.equals(inputPassword)
      ) {
        return true;
      }
    }
    return false;
  }

  public void userRegister(ArrayList<String> data, String path) {
    FileController mutation = new FileController();
    String destination = cwd + path;

    // get latest ID
    ArrayList<String> userData = new ArrayList<>();
    int latest_id = generateUserId(path);

    // put ID in first
    userData.add(String.valueOf(latest_id));
    // then take user input add it to user data
    for (String userInput : data) {
      // 0 - ID
      // 1 - Name
      // 2 - Password
      // 3 - Email (admin)
      // 4 - phnum (admin)
      // 5 - position (admin)
      userData.add(userInput);
    }

    mutation.addFile(userData, destination);
  }

  public List<ArrayList<String>> viewCar() {
    FileController getCars = new FileController();
    return getCars.readFile("/Database/MainCar.txt");
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
