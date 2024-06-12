package hello.oop_practice.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CookTest {
    @Test
    void cookTest(){
        Assertions.assertThatCode(() -> new Cook("만두", 5000))
                .doesNotThrowAnyException();
    }
}
