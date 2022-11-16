package carrentalsystem;

import java.nio.file.Path;
import java.util.*;

public abstract class GeneralUser {

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

  public abstract Boolean login(String inputName, String inputPassword);

  public abstract Boolean isUserExist();
}
