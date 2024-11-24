package app;

import java.security.SecureRandom;


public class PasswordGenerator {

    private static final String CAPITAL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SMALL_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_SYMBOLS = "!@#$%^&*_=+-/.?<>)";
    private static final String ALLOWED_SYMBOLS = CAPITAL_CHARS
            .concat(SMALL_CHARS)
            .concat(DIGITS)
            .concat(SPECIAL_SYMBOLS);

    public static String generatePassword(int passwordLength){
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            password.append(ALLOWED_SYMBOLS.charAt(random.nextInt(ALLOWED_SYMBOLS.length())));
        }
        return password.toString();
    }
}
