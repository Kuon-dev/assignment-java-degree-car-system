package carrentalsystem;

import java.nio.file.Path;
import java.util.*;

public class GeneralUser {

  int user_id;
  String user_name;
  String user_password;
  private static String cwd = Path.of("").toAbsolutePath().toString();

  // getter setters
  // -----------------------------------------------------------------------------
  public void setId(int user_input) {
    this.user_id = user_input;
  }

  public int getId() {
    return user_id;
  }

  public void setName(String user_input) {
    this.user_name = user_input;
  }

  public String getName() {
    return user_name;
  }

  public void setPassword(String user_input) {
    this.user_password = user_input;
  }

  public String getPassword() {
    return user_password;
  }

  // Shared functions
  // -----------------------------------------------------------------------------
  public int generateUserId(String path) {
    FileMutation getter = new FileMutation();
    String destination = cwd + path;

    // get the length of the current db
    List<ArrayList<String>> result = getter.readFile(destination);
    ArrayList<String> last_result = new ArrayList<>(
      result.get(result.size() - 1)
    );
    // generate the db based on the latest ID num + 1
    return Integer.parseInt(last_result.get(0)) + 1;
  }

  public Boolean userLogin(
    String inputName,
    String inputPassword,
    String path
  ) {
    FileMutation mutation = new FileMutation();
    // this is just a demo usage, not intended for production use
    // String demo_path = (cwd + "/Database/MainAdmin.txt");
    String destination = cwd + path;

    List<ArrayList<String>> result = mutation.readFile(destination);
    // result is a 2d array
    for (int i = 0; i < result.size(); i++) {
      user_name = result.get(i).get(1);
      user_password = result.get(i).get(2);
      if (
        user_name.equalsIgnoreCase(inputName) &&
        user_password.equals(inputPassword)
      ) {
        return true;
      }
    }
    return false;
  }

  public void userRegister(ArrayList<String> data, String path) {
    FileMutation mutation = new FileMutation();
    String destination = cwd + path;

    // get latest ID
    ArrayList<String> user_data = new ArrayList<>();
    int latest_id = generateUserId(path);

    // put ID in first
    user_data.add(String.valueOf(latest_id));
    // then take user input add it to user data
    for (String user_input : data) {
      // 0 - ID
      // 1 - Name
      // 2 - Password
      // 3 - Email (admin)
      // 4 - phnum (admin)
      // 5 - position (admin)
      user_data.add(user_input);
    }

    mutation.addFile(user_data, destination);
  }

  public List<ArrayList<String>> viewCar() {
    FileMutation getCars = new FileMutation();
    return getCars.readFile("/Database/MainCar.txt");
  }

  public ArrayList<String> getUserData(String targetUser, String path) {
    FileMutation getters = new FileMutation();
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
    if (
      userObj.isEmpty()
    ) System.out.println("Something went wrong"); // shouldn't happen at all // somehow the user is able to login, but inable to fetch data
    return userObj;
  }
}
