package carrentalsystem;

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
}
