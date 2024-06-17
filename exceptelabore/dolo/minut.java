import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCalculator {
    public static void main(String[] args) {
        String textToHash = "Hello, World!";
        HashCalculator calculator = new HashCalculator();
        String hashedText = calculator.calculateHash(textToHash);
        System.out.println("Original Text: " + textToHash);
        System.out.println("Hashed Text: " + hashedText);
    }

    public String calculateHash(String text) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(text.getBytes());
            return bytesToHex(encodedhash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
