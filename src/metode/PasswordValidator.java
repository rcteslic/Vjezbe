package metode;

public class PasswordValidator {
    /*
    A password must have at least eight characters.
    A password consists of only letters and digits.
    A password must contain at least two digits.*/
    public static boolean isValidPassword(String password) {
        final int MIN_NUMBERS_OF_CHAR = 8;
        final int MIN_NUMBERS_OF_NUMBER = 2;
        int brojacSlovaIKaraktera = 0;
        boolean isValid = true;
        if (password.length() < MIN_NUMBERS_OF_CHAR) {
            System.out.println("Invalid, number chars");
            isValid = false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("Invalid, samo br i slova primamo");
                isValid = false;
            }
            if (Character.isDigit(password.charAt(i))) {
                brojacSlovaIKaraktera++;
            }
        }

        if (brojacSlovaIKaraktera < MIN_NUMBERS_OF_NUMBER) {
            System.out.println("invalid, min 2 broja");
            isValid = false;
        }

        return isValid;
    }
}
