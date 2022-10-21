package jp_lab5_gui.Classes;

public class GeneralUser {
  private int userId;
  String userName;

  // getter setters
  public void setId(String usrInput){
    this.userId = usrInput;  
  }

  public String getId(){
    return userId;
  }

  public void setName(String usrInput){
    this.userName = usrInput;  
  }

  public String getName(){
    return userName;
  }
}
