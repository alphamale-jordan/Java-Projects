package manipulateFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class WriteToFile {

   public static void main(String args[]) throws IOException { 
     
      FileOutputStream out = null;
      BufferedWriter bw = null;
      File f = new File("C:/Users/programmer/Desktop/VARSITY COLLEGE/output.txt");
      
      if(!f.exists()){
        f.createNewFile();
       
      }else{
            System.out.println("File already exists");
            System.exit(0);
      }
      try {        
         out = new FileOutputStream(f);      
         bw = new BufferedWriter(new OutputStreamWriter(out));
         String text="";
         Scanner input = new Scanner(System.in);
         System.out.println("Enter text to write to file");
         text = input.next();
         while (!text.toLowerCase().equals("quit")) {            
             bw.write(text);
             bw.newLine();
             System.out.println("Enter text to write to file");
             text = input.next();
         }
      }finally {         
         bw.close();
         }
      }
   }

