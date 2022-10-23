package jp_lab5_gui;

import java.nio.file.Path;
import java.util.*;


public class GeneralUser {
  int userId;
  String userName;
  String userPassword;
  private static String cwd = Path.of("").toAbsolutePath().toString();

  // getter setters
  public void setId(int usrInput){
    this.userId = usrInput;  
  }

  public int getId(){
    return userId;
  }

  public void setName(String usrInput){
    this.userName = usrInput;  
  }

  public String getName(){
    return userName;
  }

  public void setPassword(String usrInput){
    this.userPassword = usrInput;  
  }

  public String getPassword(){
    return userPassword;
  }

  public Boolean userLogin(String inputName, String inputPassword, String path, String type){
    FileMutation mutation = new FileMutation();
    String demoPath = ( cwd + "/Database/MainAdmin.txt");

    List<ArrayList<String>> result = mutation.readFile(demoPath);
    for (int i = 0; i < result.size(); i++) {
      // 0 - ID
      // 1 - Name
      // 2 - Password
      // 3 - Email (admin)
      // 4 - phnum (admin)
      // 5 - position (admin)
      userName = result.get(i).get(1);
      userPassword = result.get(i).get(2);
      if (userName.equalsIgnoreCase(inputName) && userPassword.equals(inputPassword)){
        return true;  
      }
    }
    return false; 
  }
}

