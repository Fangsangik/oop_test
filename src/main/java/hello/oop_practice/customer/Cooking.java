package hello.oop_practice.customer;

public class Cooking {
    public Cook makeFood(MenuItem item) {
        Cook cook = new Cook(item);
        return cook;
    }
}
