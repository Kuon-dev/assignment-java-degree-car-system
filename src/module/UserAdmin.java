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
    this.userID = adminID;
    this.userName = adminName;
    this.userPassword = adminPassword;
    this.userEmail = adminEmail;
    this.userPhNum = adminPhNum;
    this.adminPostion = adminPostion;
  }

  // getter & setter
  public String getPosition() {
    return adminPostion;
  }

  public void setPosition(String position) {
    this.adminPostion = position;
  }
}
