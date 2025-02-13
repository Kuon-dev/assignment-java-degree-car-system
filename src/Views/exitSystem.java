/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lim Li Ping
 */
public class exitSystem {

  private JFrame frame;

  //Exit system
  public void exitsystem() {
    //Create a JFrame for exit
    frame = new JFrame("Exit");
    //Display confirm message
    if (
      JOptionPane.showConfirmDialog(
        frame,
        "Confirm if you want to exit?",
        "Confirm Messages",
        JOptionPane.YES_NO_OPTION
      ) ==
      JOptionPane.YES_NO_OPTION
    ) {
      // log user activity

      //If the user confirm to exit then end the system
      System.exit(0);
    }
  }

  public Boolean exitsystem(UserAdmin admin) {
    if (
      JOptionPane.showConfirmDialog(
        frame,
        "Confirm if you want to log out?",
        "Confirm Messages",
        JOptionPane.YES_NO_OPTION
      ) ==
      JOptionPane.YES_NO_OPTION
    ) {
      // log user activity
      GeneralMutation m = new GeneralMutation();
      m.logLogoutActivity(admin);
      return true;
      //If the user confirm to logout then go back to login
    }
    return false;
  }

  public Boolean exitsystem(UserCustomer customer) {
    if (
      JOptionPane.showConfirmDialog(
        frame,
        "Confirm if you want to exit?",
        "Confirm Messages",
        JOptionPane.YES_NO_OPTION
      ) ==
      JOptionPane.YES_NO_OPTION
    ) {
      // log user activity
      GeneralMutation m = new GeneralMutation();
      m.logLogoutActivity(customer);
      //If the user confirm to logout then go back to login
      return true;
    }
    return false;
  }
}
