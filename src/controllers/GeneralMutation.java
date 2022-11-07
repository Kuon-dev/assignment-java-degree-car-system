package carrentalsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.*;

public class GeneralMutation {

  private String cwd = Path.of("").toAbsolutePath().toString();
  private String adminDatabase = cwd + "/Database/MainAdmin.txt";
  private String customerDatabse = cwd + "/Database/MainCustomer.txt";
}
