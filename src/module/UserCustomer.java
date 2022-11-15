package carrentalsystem;

import java.util.ArrayList;

public class UserCustomer extends GeneralUser {

  public String IC;

  public UserCustomer(
    String custIC,
    String custName,
    String custPassword,
    String custEmail,
    String custPhNum
  ) {
    this.IC = custIC;
    this.userName = custName;
    this.userPassword = custPassword;
    this.userEmail = custEmail;
    this.userPhNum = custPhNum;
  }

  public String getIC() {
    return this.IC;
  }

  public void setIC(String IC) {
    this.IC = IC;
  }

  public Boolean registerNewCustomer(UserCustomer customer) {
    GeneralMutation m = new GeneralMutation();

    return m.addNewCustomer(customer);
  }

  public Boolean login(String name, String pass) {
    GeneralGetters getters = new GeneralGetters();

    ArrayList<UserCustomer> user = getters.getAllCustomer();
    for (int i = 0; i < user.size(); i++) {
      String userName = user.get(i).getName();
      String userPassword = user.get(i).getPassword();
      if (
        userName.equalsIgnoreCase(name) && userPassword.equals(pass)
      ) return true;
    }
    return false;
  }

  public Boolean userCustomerExists(String ic) {
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserCustomer> allUsers = g.getAllCustomer();
    for (UserCustomer c : allUsers) {
      if (c.getIC().equalsIgnoreCase(ic)) return true;
    }
    return false;
  }

  public void setCustomerData(String ic) {
    if (!userCustomerExists(ic)) return;
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserCustomer> allUsers = g.getAllCustomer();
    for (UserCustomer c : allUsers) {
      if (c.getIC().equalsIgnoreCase(ic)) {
        this.IC = c.getIC();
        this.userName = c.getName();
        this.userEmail = c.getEmail();
        this.userPassword = c.getPassword();
        this.userPhNum = c.getPhNum();
      }
    }
  }
}
