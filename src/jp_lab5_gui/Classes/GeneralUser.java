package jp_lab5_gui;

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

}
