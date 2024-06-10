package hello.oop_practice.validator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 초기화")
    @Test
    void createPassword(){
        //given
        User user = new User();

        //when
        user.initPassword(new CorrectFixedPasswordGenerator()); //항상 8글자로 고정 -> 항상 초기화 되는 경우
        //functional interface를 구현한 inteface이기 때문에 구현체 만들 필요 없이
        //user.initPassword(() -> "abcdefgh");

        //then
        assertThat(user.getPassword()).isNotBlank();

        //random으로 만들어지기 때문에 해당 testCode를 돌릴때마다 fail 할 수도 있고, 아닐 수도 있음
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화 되지 않는다")
    @Test
    void createPasswordFail(){
        //given
        User user = new User();

        user.initPassword(new WrongFixedPasswordGenerator()); // -> 초기화 되지 않는 경우
        //user.initPassword(() -> "ab");


        assertThat(user.getPassword()).isBlank();
    }

}