
package jp_lab5_gui;

public class Bill {
  public String acc_holder;
  public double amount;

  public String getAccHolders() { 
    return acc_holder;
  }

  public void setAccHolders(String acc){
    this.acc_holder = acc;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount){
    this.amount = amount;
  }
}
