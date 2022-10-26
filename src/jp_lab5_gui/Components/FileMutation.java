package jp_lab5_gui;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

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
      }
      br.close();
      // return an array instead
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

  public Boolean addFile(ArrayList<String> contents, String path){
    try {
      FileWriter fw = new FileWriter(path, true);
      BufferedWriter bw = new BufferedWriter(fw);

      fw.write(contents + "\n");
      fw.close();
      // JOptionPane.showMessageDialog(this, "Account Created Successfully");
      return true;
    }
    catch (IOException ex) {
      // Logger.getLogger(Staff_Register.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println("IO Error");
      ex.printStackTrace();
      return false;
    } 
    catch (Exception e) {
      System.out.println("An unexpected Error has occured");
      return false;
    }
  }

  public Boolean modifyFile(ArrayList<String> contents, String path, String index){
    // index in this case serve the purpose as IDs
    try {
      // to check if the file is modified or not
      Boolean hasModified = false;
      FileWriter fw = new FileWriter(path, true);
      BufferedWriter bw = new BufferedWriter(fw);

      // to delete
      PrintWriter pr = new PrintWriter(path);

      List<ArrayList<String>> data = readFile(path);
      ArrayList<String> newData = new ArrayList<>();

      for (ArrayList<String> line: data) {
        if (line.get(0) == index) {
          newData.add(String.join(", ", contents));
          hasModified = true;
        }
        else {
          newData.add(String.join(", ", line));
        }
      }
      pr.write("");
      pr.close();

      for (String line: newData) {
        fw.write(line + "\n");
      }
      fw.close();
      return hasModified;

    }
    catch (IOException ex) {
      // Logger.getLogger(Staff_Register.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println("IO Error");
      ex.printStackTrace();
      return false;
    } 
    catch (Exception e) {
      System.out.println("An unexpected Error has occured");
      return false;
    }
  }

  public Boolean deleteFile(String path, String index){
    // same as modifyFile but only one small difference
    try {
      Boolean hasModified = false;
      FileWriter fw = new FileWriter(path, true);
      BufferedWriter bw = new BufferedWriter(fw);

      PrintWriter pr = new PrintWriter(path);

      List<ArrayList<String>> data = readFile(path);
      ArrayList<String> newData = new ArrayList<>();

      for (ArrayList<String> line: data) {
        if (line.get(0) == index) {
          hasModified = true;
        }
        else {
          newData.add(String.join(", ", line));
        }
      }
      pr.write("");
      pr.close();

      for (String line: newData) {
        fw.write(line + "\n");
      }
      fw.close();
      return hasModified;
    }
    catch (IOException ex) {
      // Logger.getLogger(Staff_Register.class.getName()).log(Level.SEVERE, null, ex);
      System.out.println("IO Error");
      ex.printStackTrace();
      return false;
    } 
    catch (Exception e) {
      System.out.println("An unexpected Error has occured");
      return false;
    }
  }

}
