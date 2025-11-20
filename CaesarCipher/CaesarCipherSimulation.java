import java.util.Scanner;

public class CaesarCipher {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String normalize(String text) {
        text = text.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (ALPHABET.indexOf(ch) != -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String encrypt(String plaintext, int shift) {
        plaintext = normalize(plaintext);
        StringBuilder sb = new StringBuilder();

        for (char ch : plaintext.toCharArray()) {
            int idx = ALPHABET.indexOf(ch);
            int newIdx = (idx + shift) % 26;
            sb.append(ALPHABET.charAt(newIdx));
        }
        return sb.toString();
    }

    public static String decrypt(String ciphertext, int shift) {
        ciphertext = normalize(ciphertext);
        StringBuilder sb = new StringBuilder();

        for (char ch : ciphertext.toCharArray()) {
            int idx = ALPHABET.indexOf(ch);
            int newIdx = (idx - shift + 26) % 26;
            sb.append(ALPHABET.charAt(newIdx));
        }
        return sb.toString();
    }

    public static void bruteForce(String ciphertext) {
        ciphertext = normalize(ciphertext);
        System.out.println("\n[*] Brute-force results:\n");

        for (int shift = 0; shift < 26; shift++) {
            String attempt = decrypt(ciphertext, shift);
            System.out.printf("Shift %2d: %s\n", shift, attempt);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        boolean status = true;

        do {
            System.out.println("\n=== Caesar Cipher Tool (Java) ===");
            System.out.println("1) Encrypt");
            System.out.println("2) Decrypt (known shift)");
            System.out.println("3) Brute-force (unknown shift)");
            System.out.println("4) Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            while (!input.hasNextInt()) {
                System.out.println("Enter a num (1-4): ");
                input.next();
            }
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Plaintext: ");
                    String pt = input.nextLine();
                    System.out.print("Shift (0-25): ");
                    int s1 = input.nextInt();
                    input.nextLine();
                    System.out.println("\nCiphertext: " + encrypt(pt, s1));
                    break;

                case 2:
                    System.out.print("Enter Ciphertext: ");
                    String ct = input.nextLine();
                    System.out.print("Shift (0-25): ");
                    int s2 = input.nextInt();
                    input.nextLine();
                    System.out.println("\nPlaintext: " + decrypt(ct, s2));
                    break;

                case 3:
                    System.out.print("Enter Ciphertext: ");
                    String ct2 = input.nextLine();
                    bruteForce(ct2);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    status = false; 
                    break;

                default:
                    System.out.println("Invalid choice. Enter a num between 1 and 4.");
            }

            if (choice != 4) { 
                System.out.print("Do you want to continue? (Yes/No): ");
                String continueChoice = input.next();
                input.nextLine(); 

                if (!continueChoice.equalsIgnoreCase("yes")) {
                    status = false;
                    System.out.println("Exiting...");
                }
            }

        } while (status);

        input.close();
    }
}
