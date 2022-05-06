package animal;

import javax.swing.JOptionPane;

public class Reptile extends Animal {
    private double bloodTemp;
    
    //constructor
    public Reptile(){
      this.inputValues();
    }
    public void setBloodTemp( double newTemp){
        this.bloodTemp = newTemp;
    }
    public double getBloodTenp(){
        return this.bloodTemp;
    }
    
    @Override
    public void inputValues(){ 
      super.inputValues();
      String bloodTStr = JOptionPane.showInputDialog("Enter the Blood Temperature");
      double bloodT = Double.parseDouble(bloodTStr);
      this.setBloodTemp(bloodT);
    }
    
     @Override
    public void outputValues(){
        super.outputValues();
        System.out.println("Blood Temperature :" + this.bloodTemp + "Degrees Celcius");
    }
}
