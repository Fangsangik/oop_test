package hello.oop_practice.customer;

import java.util.List;

public class Menu {
    private final List<MenuItem> memuItem;

    public <E> Menu(List<MenuItem> menuItemList) {
        this.memuItem = menuItemList;
    }

    public MenuItem choose(String name) {

        return this.memuItem.stream()
                .filter(memuItem -> memuItem.matches(name))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("잘못된 이름 메뉴 이름 입니다"));
    }
}
