package carrentalsystem;

import java.io.IOException;
import java.text.DateFormat;
// error handling
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
// date dfs
import java.util.Date;
// regex
// add comment
import java.util.regex.*;

public class Validator {

  // check if a string is a number
  public static Boolean isNumber(String input) {
    try {
      if (input.isEmpty()) return false;
      Double.parseDouble(input);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  // check if the email is valid

  public static Boolean isEmail(String email) {
    String regexPattern = "^(.+)@(\\S+)$";
    return Pattern.compile(regexPattern).matcher(email).matches();
  }

  // check if the phone number is valid
  public static Boolean isPhNum(String phnum) {
    try {
      if (phnum.isEmpty()) return false;
      String newPh = phnum.replace("-", "");
      Integer.parseInt(newPh);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  // check if the credit / debit card is valid
  public static Boolean isValidCard(String inputCard) {
    try {
      if (inputCard.isEmpty()) return false;
      // remove dashes and empty spaces
      String formattedCard = inputCard.replace("-", "");
      formattedCard = formattedCard.replace(" ", "");

      // check for any strings
      long validCard = Long.parseLong(formattedCard);
      // luhn's algo
      int nDigits = inputCard.length();

      int nSum = 0;
      boolean isSecond = false;
      for (int i = nDigits - 1; i >= 0; i--) {
        int d = inputCard.charAt(i) - '0';
        if (isSecond == true) d = d * 2;
        // We add two digits to handle
        // cases that make two digits
        // after doubling
        nSum += d / 10;
        nSum += d % 10;

        isSecond = !isSecond;
      }
      return (nSum % 10 == 0);
    } catch (NumberFormatException e) {
      return false;
    }
  }

  // check if the date is valid and if it is not a past date
  public static Boolean isValidDate(String usrInput) {
    try {
      // always return false if empty
      if (usrInput.isEmpty()) return false;
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

      // DateTimedf df = DateTimedf.ofPattern("dd/MM/yyyy");
      // check if it is a valid date, will reach ParseException if invalid
      Date validDate;
      validDate = df.parse(usrInput);

      // check if date is already over (means if user selected a past date)
      Date dateNow = new Date();

      long currentTime, inputDate;
      currentTime = dateNow.getTime();
      inputDate = validDate.getTime();

      if (currentTime > inputDate) return false;
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public static Boolean isValidDate(String usrInput, Boolean isCheckPast) {
    try {
      if (usrInput.isEmpty()) return false;
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
      Date validDate;
      validDate = df.parse(usrInput);

      // basically if we want to ignore check past date condition
      if (!isCheckPast) return true;
      Date dateNow = new Date();
      long currentTime, inputDate;
      currentTime = dateNow.getTime();
      inputDate = validDate.getTime();
      if (currentTime > inputDate) return false;
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public Boolean isValidEndDate(String startDate, String endDate) {
    try {
      if (startDate.isEmpty() || endDate.isEmpty()) return false;
      // always return false if empty
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

      Date startingDate = df.parse(startDate);
      Date endingDate = df.parse(endDate);

      if (startingDate.getTime() > endingDate.getTime()) return false;
      return true;
      // check if date is already over (means if user selected a past date)
    } catch (Exception e) {
      return false;
    }
  }

  public Boolean isAdminPhNumExist(String PhNum) {
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserAdmin> allUsers = g.getAllAdmin();
    for (UserAdmin a : allUsers) {
      if (a.getPhNum().equals(PhNum)) return true;
    }
    return false;
  }

  public Boolean isAdminEmailExist(String Email) {
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserAdmin> allUsers = g.getAllAdmin();
    for (UserAdmin a : allUsers) {
      if (a.getEmail().equals(Email)) return true;
    }
    return false;
  }

  public Boolean isCustomerICExist(String IC) {
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserCustomer> allUsers = g.getAllCustomer();
    for (UserCustomer a : allUsers) {
      if (a.getIC().equals(IC)) return true;
    }
    return false;
  }

  public Boolean isCustomerPhNumExist(String PhNum) {
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserCustomer> allUsers = g.getAllCustomer();
    for (UserCustomer a : allUsers) {
      if (a.getPhNum().equals(PhNum)) return true;
    }
    return false;
  }

  public Boolean isCustomerEmailExist(String Email) {
    GeneralGetters g = new GeneralGetters();
    ArrayList<UserCustomer> allUsers = g.getAllCustomer();
    for (UserCustomer a : allUsers) {
      if (a.getEmail().equals(Email)) return true;
    }
    return false;
  }
}
