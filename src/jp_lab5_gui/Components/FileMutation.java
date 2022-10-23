package jp_lab5_gui;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMutation {
  public static List<ArrayList<String>> readFile(String path) {
    List<ArrayList<String>> tempArr = new ArrayList();
    try {
      File file = new File(path);
      BufferedReader br = new BufferedReader(new FileReader(file));


      String st;
      while ((st = br.readLine()) != null) {
          String filteredString1, filteredString2;
          //System.out.println(st);
          filteredString1 = st.replace("[", "");
          filteredString2 = filteredString1.replace("]", "");
          ArrayList<String> eachLine = new ArrayList<>(Arrays.asList(filteredString2.split(", ")));
          tempArr.add(eachLine);
        
        // return an array instead

      }
      br.close();
      return tempArr;
    }
    catch(FileNotFoundException e) {
      System.out.println("An error occured");
      e.printStackTrace();
    }
    catch(IOException e){
      System.out.println("An error occured");
      e.printStackTrace();

    }

    finally{
      return tempArr;
    }

  }
}
