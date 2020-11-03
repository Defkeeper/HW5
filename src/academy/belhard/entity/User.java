package academy.belhard.entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo() {
        String result = "E-mail: " + email + "\n" + "Имя: " + super.firstName + " " + super.lastName;
        System.out.println(result);
        return result;
    }

    public boolean isPasswordCorrect(String password){
        boolean result = this.password.equals(password);
        System.out.println(result);
        return result;
    }



}

