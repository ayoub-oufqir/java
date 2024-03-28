package email;

public class EmailValidator {
    public static boolean validateEmail(String email){
        return email.contains("@");
    }
}
