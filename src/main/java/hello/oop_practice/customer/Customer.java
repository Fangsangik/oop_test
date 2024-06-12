package hello.oop_practice.customer;

public class Customer {

    public void order(String name, Menu menu, Cooking cooking) {
        MenuItem item = menu.choose(name);
        cooking.makeFood(item);
    }
}
