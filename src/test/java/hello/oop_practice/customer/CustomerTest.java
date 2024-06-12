package hello.oop_practice.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.awt.SystemColor.menu;

/**
 * 음식점에서 주문 하는 과정 구현
 * 1. 도메인을 구성하는 객채
 *  ㄴ 손님, 메뉴판, 음식, 요리사
 * 2. 객체들 간의 관계 고민
 *  ㄴ 손님 -- 메뉴판
 *  ㄴ 손님 -- 요리사
 *  ㄴ 요리사 -- 음식
 * 3. 동적인 객체 -> 정적 타입으로 추상화
 *  ㄴ 손님 -> type
 *  ㄴ 요리 -> 요리 type
 *  ㄴ 메뉴판 -> 메뉴판 type
 *  ㄴ 메뉴 -> 메뉴 tpye
 * 4. 협력을 설계
 * 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
 * 6. 구현
 */
public class CustomerTest {

    @Test
    void order(){
        Customer customer = new Customer();

        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000),
                new MenuItem("고기", 12000)));

        Cooking cooking = new Cooking();

        Assertions.assertThatCode(() -> customer.order("돈까스", menu, cooking))
                .doesNotThrowAnyException();
    }
}
