package hello.oop_practice.customer;

import java.util.Objects;

public class MenuItem {
    private String name;
    private int price;

    public MenuItem(String cookName, int price) {
        this.name = cookName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean matches(String name) {
        return this.name.equals(name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem item = (MenuItem) o;
        return price == item.price && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
