public class HealthyBurger extends Hamburger {

    private double cheesePrice = 0.7;
    private double olivesPrice = 0.2;
      private boolean isCheese;
    private boolean isOlives;


    public HealthyBurger(String meat, double price, String name) {
        super("bread", meat, price, name);
        this.isCheese = false;
        this.isOlives = false;
    }

    public void addCheese() {
       setFinalPrice(getBasePrice() + cheesePrice);

        this.isCheese = true;
    }

    public void addOlives() {
        setFinalPrice(getBasePrice() + olivesPrice);
        this.isOlives = true;
    }

    public void getFinalRaport() {
        System.out.println("Base burger price is:" + super.getBasePrice() + "USD" +" You choosed:");
        getFinalSpec();
        System.out.println("In total you pay:" + super.getFinalPrice());
    }

    @Override
    public void getFinalSpec() {
        super.getFinalSpec();
        if (this.isOlives) System.out.println("Olives with price:" + olivesPrice);
        if (this.isCheese) System.out.println("Cheese with price:" + cheesePrice);
    }
}

