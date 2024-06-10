package hello.oop_practice.validator;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class RandomPasswordGenerator implements hello.oop_practice.validator.PasswordGenerator {

    public static final String ALLOWED_SPL_CHARACTERS = "!@#$%^&*()_+";
    public static final String ERROR_CODE = "ERRONEOUS_SPECIAL_CHARS";

    //0~12가지 random한 password 생성해주는 메소드
    public String generatePassword() {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule lowerCaseRule = new CharacterRule(lowerCaseChars);
        lowerCaseRule.setNumberOfCharacters(2);

        CharacterData upperCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule upperCaseRule = new CharacterRule(upperCaseChars);
        upperCaseRule.setNumberOfCharacters(2);

        CharacterData digitCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule digitCaseRule = new CharacterRule(digitCaseChars);
        digitCaseRule.setNumberOfCharacters(2);

        CharacterData specialChars = new CharacterData() {
            @Override
            public String getErrorCode() {
                return ERROR_CODE;
            }

            @Override
            public String getCharacters() {
                return ALLOWED_SPL_CHARACTERS;
            }
        };

        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(2);

        return passwordGenerator.generatePassword((int) (Math.random() * 13), splCharRule, lowerCaseRule, upperCaseRule, digitCaseRule);
    }

}
