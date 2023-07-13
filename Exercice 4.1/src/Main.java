import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier: ");
        int number = scanner.nextInt();
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hexadecimal = Integer.toHexString(number);

        System.out.println("Binaire: " + binary);
        System.out.println("Octale: " + octal);
        System.out.println("Hexadécimale: " + hexadecimal);
    }
}