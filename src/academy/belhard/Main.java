package academy.belhard;

import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("Eva", "Green", "eg@gmial.com", "qwerty");
        user.getFullInfo();
        user.isPasswordCorrect("retert");
    }
}
