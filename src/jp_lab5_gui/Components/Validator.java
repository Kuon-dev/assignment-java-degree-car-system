package jp_lab5_gui;

// date formatters
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

// error handling
import java.text.ParseException;
import java.io.IOException;

// regex
// add comment
import java.util.regex.*;  

public class Validator {

  public static String testValidator(String input){
    // make sure this file is working, can be removed later on
    return input; 
  }

  // check for empty input
  public static Boolean notEmptyString (String input){
    return (!(input.isEmpty()));
  }

  // check if a string is a number
  public static Boolean isNumber(String input){
    try {
      if (input == "") return false;
      Integer.parseInt(input);
      return true;
    }  
    catch(NumberFormatException e) {
      return false; 
    }
  }

  // check if the email is valid
  public static final Pattern emailRegex = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  public static Boolean emailValidator(String email){
    Matcher matcher = emailRegex.matcher(email);
    return matcher.find();
  }

  // check if the phone number is valid
  public static Boolean phoneNumValidator(String phnum){
    try {
      if (phnum.isEmpty()) return false;
      String newPh = phnum.replace("-", "");
      Integer.parseInt(newPh);
      return true;
    }
    catch (NumberFormatException e) {
      return false;
    }
  }

  // check if the credit / debit card is valid
  public static Boolean cardValidator(String inputCard){
    try {
      if (inputCard.isEmpty()) return false;
      // remove dashes and empty spaces
      String formattedCard = inputCard.replace("-", "");
      formattedCard = formattedCard.replace(" ", "");

      // check for any strings 
      int validCard = Integer.parseInt(formattedCard);
      // luhn's algo
      int nDigits = inputCard.length();
   
      int nSum = 0;
      boolean isSecond = false;
      for (int i = nDigits - 1; i >= 0; i--){
          int d = inputCard.charAt(i) - '0';
          if (isSecond == true)
              d = d * 2;
          // We add two digits to handle
          // cases that make two digits
          // after doubling
          nSum += d / 10;
          nSum += d % 10;
   
          isSecond = !isSecond;
      }
      return (nSum % 10 == 0);
    }
    catch (NumberFormatException e) {
      return false;
    }
  }

  // check if the date is valid and if it is not a past date
  public static Boolean dateValidator(String usrInput){
    try {
      // always return false if empty
      if (usrInput.isEmpty()) return false;
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

      // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      // check if it is a valid date, will reach ParseException if invalid
      Date validDate; 
      validDate = formatter.parse(usrInput);
      validDate = dateFormat.parse(usrInput);

      // check if date is already over (means if user selected a past date)
      Date dateNow = new Date();

      long currentTime, inputDate;
      currentTime = dateNow.getTime();
      inputDate = validDate.getTime();

      if (currentTime > inputDate) return false;
      return true;
      
    }
    catch(ParseException e) {
      return false;
    }
  }

}
