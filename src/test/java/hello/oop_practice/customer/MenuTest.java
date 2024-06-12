package hello.oop_practice.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuTest {

    @Test
    void menu(){
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000),
                new MenuItem("고기", 12000)));

        MenuItem menus = menu.choose("돈까스");
        assertThat(menus).isEqualTo(new MenuItem("돈까스", 5000));
    }

    @Test
    void failed(){
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000),
                new MenuItem("고기", 12000)));

        assertThatCode(() -> menu.choose("통닭"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 이름 메뉴 이름 입니다");
    }
}

