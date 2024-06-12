package hello.oop_practice.customer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CookerTest {
    @Test
    void cook(){
        Cooking cooking = new Cooking();
        MenuItem item = new MenuItem("돈까스", 5000);

        Cook cook = cooking.makeFood(item);

        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
