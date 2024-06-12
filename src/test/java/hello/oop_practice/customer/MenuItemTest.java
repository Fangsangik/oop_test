package hello.oop_practice.customer;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MenuItemTest {

    @Test
    void menu() {
        assertThatCode(() -> new MenuItem("만두", 5000))
                .doesNotThrowAnyException();
    }
}