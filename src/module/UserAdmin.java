package carrentalsystem;

import java.util.ArrayList;

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

  // methods
  // -------------------------
  public Boolean registerNewAdmin(UserAdmin admin) {
    FileController f = new FileController();
    GeneralGetters g = new GeneralGetters();
    // check if the IDs are taken
    GeneralMutation m = new GeneralMutation();

    return m.addNewAdmin(admin);
  }

  public Boolean login(String name, String pass) {
    GeneralGetters getters = new GeneralGetters();

    ArrayList<UserAdmin> user = getters.getAllAdmin();
    for (int i = 0; i < user.size(); i++) {
      String userName = user.get(i).getName();
      String userPassword = user.get(i).getPassword();
      if (
        userName.equalsIgnoreCase(name) && userPassword.equals(pass)
      ) return true;
    }
    // if no results found
    return false;
  }
}
