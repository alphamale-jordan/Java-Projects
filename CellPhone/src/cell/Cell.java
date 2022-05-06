package cell;
public abstract class Cell implements iPrintable {
    private String name;
    private int talkTime;
    private double pricePerMin;
    public Cell(String nme, int talkT, double priceT){
        this.name = nme;
        this.pricePerMin = priceT;
        this.talkTime = talkT;
    }
    
    public int getTalkTime(){
        return this.talkTime;
    }
    public double getPricePerMin(){
        return this.getPricePerMin();
    }
    
    public String getName(){
        return this.name;
    }
}
