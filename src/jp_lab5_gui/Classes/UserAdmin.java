
package jp_lab5_gui;

public class UserAdmin extends GeneralUser {
  String admin_email;
  String admin_phnum;
  String admin_position;

  public UserAdmin(
    int user_id, 
    String user_name, 
    String user_password, 
    String admin_email, 
    String admin_phnum, 
    String admin_position
  ){
      this.user_id = user_id;
      this.user_name = user_name;
      this.user_password = user_password;
      this.admin_email = admin_email;
      this.admin_phnum = admin_phnum;
      this.admin_position = admin_position;
  }

  public void displayAdmin(){
    System.out.println(user_id + " " + user_name);
  }

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
