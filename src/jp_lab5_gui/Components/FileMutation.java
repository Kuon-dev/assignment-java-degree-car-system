import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMutation {
  public static void ReadFile(String path) {
    try {
      File file = new File(path);
      BufferedReader br = new BufferedReader(new FileReader(file));

      String st;
      while ((st = br.readLine()) != null) {
          String new_value1, new_value2;
          //System.out.println(st);
          new_value1 = st.replace("[", "");
          new_value2 = new_value1.replace("]", "");
          List<String> myList = new ArrayList<>(Arrays.asList(new_value2.split(", ")));
          System.out.println(myList);
        // return an array instead

      }
      br.close();
    }
    catch(FileNotFoundException e) {
      System.out.println("An error occured");
      e.printStackTrace();
    }
    catch(IOException e){
      System.out.println("An error occured");
      e.printStackTrace();

    }

  }
}
