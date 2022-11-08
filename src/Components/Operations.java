package jp_lab5_gui;

import java.util.Date;

public class Operations {

  public double finalPrice(int cost, int days) {
    // 1.06 is the tax
    return cost * days * 1.06;
  }

  // calculate the difference of the days
  public int calculateDays(Date start, Date end) {
    return 5;
  }
}
