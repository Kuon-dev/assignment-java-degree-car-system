package jp_lab5_gui;

import java.nio.file.Path;
import java.util.*;


public class GeneralUser {
  int userId;
  String userName;
  String userPassword;
  private String cwd = Path.of("").toAbsolutePath().toString();

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

  public Boolean userLogin(String inputName, String inputPassword, String path){
    FileMutation mutation = new FileMutation();
    String demoPath = ( cwd + "/Database/MainAdmin.txt");
    String destination = cwd + path;

    List<ArrayList<String>> result = mutation.readFile(destination);
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

  public void userRegister(ArrayList<String> data, String path){
    FileMutation mutation = new FileMutation();
    String destination = cwd + path;

    // get latest ID
    List<ArrayList<String>> result = mutation.readFile(destination);
    ArrayList<String> lastResult = new ArrayList<>(result.get(result.size() - 1));
    int latestId = Integer.parseInt(lastResult.get(0)) + 1;

    ArrayList<String> userData = new ArrayList<>();
    userData.add(String.valueOf(latestId));
    userData.add(data.get(0));
    userData.add(data.get(1));
    
    mutation.addFile(userData, destination);
  }
}

