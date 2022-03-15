public class Hamburger {

    private String rollType;
    private String meat;
    private double basePrice;
    private double finalPrice;
    private String name;
    private double lettucePrice = 0.3;
    private double tomatoPrice = 0.5;
    private double carrotPrice = 0.8;
    private double onionPrice = 0.1;
private boolean isLettuce;
private boolean isTomato;
private boolean isCarrot ;
private boolean isOnion;


    public Hamburger(String rollType, String meat, double price, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.basePrice = price;
        this.name = name;
        this.isLettuce = false;
        this.isTomato = false;
        this.isCarrot = false;
        this.isOnion = false;
    }

    public void addLettuce(){
         this.finalPrice += lettucePrice;
         isLettuce = true;
    }
    public void addTomato(){
        this.finalPrice += tomatoPrice;
        isTomato = true;
    }
    public void addCarrot(){
        this.finalPrice += carrotPrice;
        isCarrot = true;
    }
    public void addOnion(){
        this.finalPrice += onionPrice;
        isOnion = true;
    }

    public double getBasePrice(){
        return this.basePrice;
    }

    public double getLastPrice() {
        return this.basePrice + this.finalPrice;
    }

    public void getFinalReport(){
        System.out.println("Base burger price is:" + getBasePrice() + "USD" +" You choosed:");
        this.getFinalSpec();
        System.out.println("In total you pay:" + getLastPrice());
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void getFinalSpec(){
        if(isLettuce) System.out.println("Lettuce with price:"+ lettucePrice);
        if(isTomato) System.out.println("Tomato with price:"+ tomatoPrice);
        if(isCarrot) System.out.println("Carrot with price:"+ carrotPrice);
        if(isOnion) System.out.println("Onion with price:"+ onionPrice);
    }

}
