package animal;

import javax.swing.JOptionPane;

public class Animal {
    private int IDTag;
    private String species;
    //constructor
    public Animal(){
       //this.inputValues();
    }
    
    public void setIDTag(int newTg){
        this.IDTag = newTg;
    }
    public int getIDTag(){
        return this.IDTag;
    }
    
     public void setSpecies(String newSpecies){
        this.species = newSpecies;
    }
    public String getSpecies(){
        return this.species;
    }
    
    // input id and species
    public void inputValues(){
        System.out.println("Running inputValues in aNIMAL CLASS");
        String idTStr = JOptionPane.showInputDialog("Enter the value for ID Tag");
        int idT = Integer.parseInt(idTStr);
        this.setIDTag(idT);
        String spec = JOptionPane.showInputDialog("Enter specie");
        this.setSpecies(spec);
    }
    //output the id and species
    public void outputValues(){
        //System.out.println("ID Tag :" + this.IDTag);
        //System.out.println("Species :" + this.species);
        JOptionPane.showMessageDialog(null, "ID Tag :" + this.IDTag +
                "\nSpecies :"+this.species);
    }
    
}
