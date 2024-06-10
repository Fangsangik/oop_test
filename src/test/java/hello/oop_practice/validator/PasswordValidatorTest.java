package hello.oop_practice.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.locks.StampedLock;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 비밀번호는 최소 8자 이상 12자 이하
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArugmentException 예외를 발생
 * 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자리 이상 12자리 미만이면 예외 발생 X") //문서화 역할 의미
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 12자 초과하는 경우 IllegalArugmentException 발생")
    @ParameterizedTest
    @ValueSource(strings = {"aabbcce", "aabbccddeeffg"}) //경계 조건에 대한 test
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다");
    }

    /*
     @ParameterizedTest
     -> ValueSource, CSV source, Enum source 등등을 사용할 수 있음
     */
}
