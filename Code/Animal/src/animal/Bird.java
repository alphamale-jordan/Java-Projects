package animal;

import javax.swing.JOptionPane;

public class Bird extends Animal{
   private int colour;
   //constructor
   public Bird(){      
       this.inputValues();
   }
   //set colour
   public void setColour(int newColour){
       this.colour = newColour;
   }
   public int getColour(){
       return this.colour;
   }
   
   @Override
   public void inputValues(){ 
      super.inputValues();
      String colourStr = JOptionPane.showInputDialog("Enter the value for colour ( 1=grey, 2=white, 3=black");
      int col = Integer.parseInt( colourStr);
      this.setColour(col);
    }  
   
   @Override
    public void outputValues(){
        super.outputValues(); 
        String col;
         if( this.colour == 1){
            col = "grey";
        }else if(this.colour==2){
            col = "white";
        }else{
            col = "black";
        }
        JOptionPane.showMessageDialog(null, "Colour :" + col);
       // System.out.println("Colour :" + col);
    }
}
