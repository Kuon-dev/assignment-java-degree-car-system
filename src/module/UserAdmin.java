package carrentalsystem;

public class UserAdmin extends GeneralUser {

  String adminPostion;

  public UserAdmin(
    String adminID,
    String adminName,
    String adminPassword,
    String adminEmail,
    String adminPhNum,
    String adminPostion
  ) {
    this.adminID = adminID;
    this.adminName = adminName;
    this.adminPassword = user_password;
    this.adminEmail = adminEmail;
    this.adminPhNum = adminPhNum;
    this.adminPostion = adminPostion;
  }

  public void displayAdmin() {
    System.out.println(adminID + " " + adminName);
  }

  // getter & setter
  public String getPosition() {
    return adminPostion;
  }

  public void setPosition(String position) {
    this.adminPostion = position;
  }
}
