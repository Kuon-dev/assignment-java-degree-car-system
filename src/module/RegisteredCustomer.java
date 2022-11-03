package carrentalsystem;

public class RegisteredCustomer extends GeneralUser {

  public String IC;

  public RegisteredCustomer(
    int user_id,
    String IC,
    String user_name,
    String user_password
  ) {
    this.user_id = user_id;
    this.user_name = user_name;
    this.user_password = user_password;
  }

  public static void bookCar() {}
}
