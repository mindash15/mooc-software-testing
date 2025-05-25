package tudelft.caesarshift;


public class CaesarShiftCipher {

    public String encode(String message, int shift) {
        StringBuilder sb = new StringBuilder();

        shift = shift % 26; // normalize shift

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            // Only allow lowercase a-z
            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            }

            // Shift and wrap around
            char shifted = (char)(currentChar + shift);

            if (shifted > 'z') {
                shifted -= 26;
            } else if (shifted < 'a') {
                shifted += 26;
            }

            sb.append(shifted);
        }

        return sb.toString();
    }
}
