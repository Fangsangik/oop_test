package hello.oop_practice.validator;

public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void initPassword(PasswordGenerator passwordGenerator){
        //as-is (내부에서 생성하면 강한 결합)
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator(); //-> 이부분 control 안됨

        //to-be (결합을 끊기 위해서 interface를 사용)
        String password = passwordGenerator.generatePassword();

        if (password.length() >= 8 && password.length() <=12) {
            this.password = password;
        }
    }
}
