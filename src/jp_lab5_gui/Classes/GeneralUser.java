package jp_lab5_gui;

import java.nio.file.Path;

public class GeneralUser {
  int userId;
  String userName;
  String userPassword;

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

  public void userLogin(String name, String password){
    FileMutation reader = new FileMutation();
    String cwd = Path.of("").toAbsolutePath().toString();
    reader.readFile( cwd + "/Database/MainAdmin.txt");
  }

}
