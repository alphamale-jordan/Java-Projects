package writetofile;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
       //file object with directory information
        File file = new File("C:\\Users\\programmer\\Desktop\\VARSITY COLLEGE\\inputoutput.txt");

        try {
            //check if file exists
            if(!file.exists() ){ 
            //create the file
            file.createNewFile();
            }
        }catch (IOException ex) {
            //message to display when file cant be created
            JOptionPane.showMessageDialog(null,"Error creating the file");
        }
        try {
            //file writer to convert file into a stream the buffered writer can handle
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            String text = JOptionPane.showInputDialog("Enter text to sent to file");
            bw.write(text);
            bw.newLine();               
            bw.close(); 
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
            
            
       // }
    }
    
}
