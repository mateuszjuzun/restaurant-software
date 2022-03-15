public class DeluxeBurger extends Hamburger{

    private double deluxeAdditionsPrice = 2.2;
private double deluxeBurgerPrice;
private boolean areDeluxeAdditions;

    public DeluxeBurger(String rollType, String meat, double price, String name) {
        super(rollType, meat, price, name);
        this.areDeluxeAdditions = true;
        super.setFinalPrice(super.getBasePrice()+this.getDeluxeAdditionsPrice());
    }

    public double getDeluxeAdditionsPrice() {
        return deluxeAdditionsPrice;
    }

    @Override
    public void getFinalReport() {
        System.out.println("Base burger price is:" + getBasePrice() + "USD" +" and Deluxe ingredients costs:" );
        System.out.println(this.getDeluxeAdditionsPrice());
        System.out.println("In total you pay:" + getFinalPrice());
    }
}
