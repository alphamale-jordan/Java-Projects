package cell;
public class Cell_Billing extends Cell {
    public Cell_Billing(String nme, int talkT, double priceT){
        super(nme,talkT,priceT);
    
    }
    @Override
    public void print_bill() {
        double totalDue = this.getTalkTime()* this.getPricePerMin();
        System.out.println("Customer :" + this.getName());
        System.out.println("Talk Time :" + this.getTalkTime());
        System.out.println("Price PEr Minute :" + this.getPricePerMin());
        System.out.println("Total Bill : "+ totalDue);
    }
    
}
