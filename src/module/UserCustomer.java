package carrentalsystem;

public class UserCustomer extends GeneralUser {

  public String IC;

  public UserCustomer(
    String custIC,
    String custName,
    String custPassword,
    String custEmail
  ) {
    this.IC = custIC;
    this.userName = custName;
    this.userPassword = custPassword;
    this.userEmail = custEmail;
  }

  public String getIC() {
    return this.IC;
  }

  public void setIC(String IC) {
    this.IC = IC;
  }
}
