package tel_ran;

public class UserAppl {

    public static void main(String[] args) {
        boolean check = validateEmail("peter@gmail.com");
        System.out.println(check);  
        check = isPasswordValid("Qwerty1@");
        System.out.println(check);  
        
        check = validateEmail("peterPArker");
        System.out.println(check);  
        check = isPasswordValid("123Aasdn-asd213@");
        System.out.println(check);  
    }
    
    private static boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) return false;
        
        String emailRegex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
    
    private static boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            else if (Character.isUpperCase(c)) hasUpperCase = true;
            else if (Character.isLowerCase(c)) hasLowerCase = true;
            else if (c == '!' || c == '%' || c == '@' || c == '$' || c == '&') hasSpecialChar = true;
        }        
        return hasDigit && hasUpperCase && hasLowerCase && hasSpecialChar;
    }
}
