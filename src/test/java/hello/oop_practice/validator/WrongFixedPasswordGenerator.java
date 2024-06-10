package hello.oop_practice.validator;

public class WrongFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "ab";
    }
}
