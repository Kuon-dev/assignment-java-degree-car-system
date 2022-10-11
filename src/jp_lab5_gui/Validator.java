package jp_lab5_gui;

import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;

public class Validator {

  public static Boolean emailValidator(String email){
    return True;
  }

  public static Boolean phoneNumValidator(String phnum){
    try {
      if (phnum == "") return false;
      String newPh = phnum.replace("-", "");
      int validPh = Integer.parseInt(newPh);
      if (validPh) {
        return true;
      }
    }
    catch (NumberFormatException e) {
      return false;
    }
  }

  public static Boolean cardValidator(String card){
    try {
      if (card == "") return false;

      // check for any strings 
      int noStr = Integer.parseInt(card);
      
      // luhn's algo

      // finally return true
      return true;
    }
    catch (NumberFormatException e) {
      return false;
    }

  }

  public static Boolean dateValidator(){
    try {
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      //
      // check if date is already over (means if user selected a past date)
      LocalDateTime now = LocalDateTime.now();

    }
    catch(ParseException e) {
      return false;
    }
  }


}
