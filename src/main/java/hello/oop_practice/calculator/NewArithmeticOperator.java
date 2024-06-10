package hello.oop_practice.calculator;

public interface NewArithmeticOperator {

    boolean supports(String operator);
    int calculate(PositiveNumber a, PositiveNumber b);
}
