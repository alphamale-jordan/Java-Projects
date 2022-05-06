package divionbyzero;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DivionByZero {
    public static void main(String[] args) {
        int []array = new int[3];
        try{
        array[0]=11;
        array[1]=22;
        array[2]=33;        
        array[3]=44;
        }catch(Exception exc){
            System.out.println("Arrays :"+ exc);
            System.exit(0);
        }
        Scanner sc = new Scanner(System.in);       
        int denom =0;
        int nume =0;
        System.out.println("Enter Denominator :");
        try {       
            denom = sc.nextInt(); 
            System.out.println("Enter Numerator :");
            nume = sc.nextInt();
	}catch(InputMismatchException e){
            System.out.println("Enter a number for denominator");       
                   
	}       
        
        int res=0;
        try{
            res = nume/denom;
            System.out.println("Numerator / Denominator = "+ res);
        }catch(ArithmeticException e){
            //System.out.println("Exception :"+ e); 
            System.out.println("You cannot divide by ZERO");
        }
    }
}
    

