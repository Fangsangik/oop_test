package hello.oop_practice.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

/**
 * 간단한 사칙연산
 * 양수로만 계산 가능
 * 나눈샘에서 0을 나누는 경우 IllegalArgumentException
 * MVC 기반
 */
public class CalculatorTest {

    //@Test
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateSuccess(int x, String operator, int y, int rst) {

        int rst1 = Calculator.calculate(new PositiveNumber(x), operator, new PositiveNumber(y));
        assertThat(rst1).isEqualTo(rst);

//        int rst2= Calculator.calculate(1, "-", 2);
//        assertThat(rst2).isEqualTo(-1);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                Arguments.arguments(1, "+", 2, 3),
                Arguments.arguments(1, "-", 2, -1),
                Arguments.arguments(1, "*", 2, 2),
                Arguments.arguments(4, "/", 2, 2)
        );
    }

    @Test
    void calculateMethodFail() {
        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0또는 음수를 전달할 수 없습니다");
    }
}
