package readfromfile;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReadFromFile {
    public static void main(String[] args) {
        try {            
            FileReader reader = new FileReader("C:\\Users\\programmer\\Desktop\\VARSITY COLLEGE\\inputoutput.txt");
            BufferedReader bufferR = new BufferedReader(reader);            
            // text to store all the lines read from the file
            String text = "";
            String line = bufferR.readLine();//reading the first line in the file
            //loop to read file line by line until theres nothing to read
            while(line!=null){
                text = text+line+"\n";
                line = bufferR.readLine();               
            }
            bufferR.close();
            reader.close();
            JOptionPane.showMessageDialog(null,text);
        } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null,"File access error");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error reading from the file");
        }
    }
    
}
