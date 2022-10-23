package jp_lab5_gui;

public class UserAdmin extends GeneralUser {
  String adminEmail;
  String adminPhnum;
  String adminPosition;

  // getter & setter
  public String getEmail(){
    return adminEmail;
  }

  public void setEmail(String usrInput){
    this.adminEmail = usrInput;
  }

  public String getPhnum(){
    return adminPhnum;
  }

  public void setPhnum(String usrInput){
    this.adminPhnum = usrInput;
  }

  public String getPosition(){
    return adminPosition;
  }

  public void setPosition(String usrInput){
    this.adminPosition = usrInput;
  }
}
