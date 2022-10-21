package jp_lab5_gui.Classes;

public class UserAdmin extends GeneralUser {
  private String adminPassword;
  String adminEmail;
  String adminPhnum;
  String adminPosition;

  // getter & setter
  public String getName(){
    return userName;
  }

  public void setPassword(String usrInput){
    this.adminPassword = usrInput;  
  }

  public String getPassword(){
    return adminPassword;
  }

  public String getEmail(){
    return adminEmail;
  }

  public void setEmail(String usrInput){
    this.adminEmail = usrInput;
  }

  public String getPosition(){
    return adminPosition;
  }

  public void setPosition(String usrInput){
    this.adminPosition = usrInput;
  }
}
