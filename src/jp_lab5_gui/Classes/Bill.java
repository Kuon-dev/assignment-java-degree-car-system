
package jp_lab5_gui;

public class Bill {
  public String acc_holder;
  public float amount;

  public String getAccHolders() { 
    return acc_holder;
  }

  public void setAccHolders(String acc){
    this.acc_holder = acc;
  }

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount){
    this.amount = amount;
  }
}
