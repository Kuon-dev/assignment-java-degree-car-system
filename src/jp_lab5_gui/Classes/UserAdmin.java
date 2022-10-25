package jp_lab5_gui;

public class UserAdmin extends GeneralUser {
  String admin_email;
  String admin_phnum;
  String admin_position;

  // getter & setter
  public String getEmail(){
    return admin_email;
  }

  public void setEmail(String user_input){
    this.admin_email = user_input;
  }

  public String getPhnum(){
    return admin_phnum;
  }

  public void setPhnum(String user_input){
    this.admin_phnum = user_input;
  }

  public String getPosition(){
    return admin_position;
  }

  public void setPosition(String user_input){
    this.admin_position = user_input;
  }
}
