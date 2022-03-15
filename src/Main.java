public class Main {


    public static void main(String[] args) {
/*
        Hamburger hamburger = new Hamburger("bread", "chicken", 10.0, "classic");
        System.out.println(hamburger.getBasePrice());
        hamburger.addCarrot();
        System.out.println(hamburger.getBasePrice());
        hamburger.addLettuce();
        System.out.println(hamburger.getBasePrice());
        hamburger.getFinalReport();
*/

        HealthyBurger healthyBurger = new HealthyBurger("chicken",14.0, "zdrowy");
        System.out.println(healthyBurger.getBasePrice());
        healthyBurger.addCheese();
        healthyBurger.addOnion();
        System.out.println(healthyBurger.getBasePrice());
        healthyBurger.getLastPrice();
        healthyBurger.getFinalRaport();

DeluxeBurger deluxeBurger = new DeluxeBurger("rye","beef", 13.0,"Wypasiony");
deluxeBurger.getFinalReport();


    }

}
