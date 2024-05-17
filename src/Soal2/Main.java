package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String str = scanner.nextLine();

        boolean isPalindrom = PalindromeChecker.isPalindrome(str);
        if (isPalindrom) {
            System.out.println("String \"" + str + "\" adalah Palindrom.");
        } else {
            System.out.println("String \"" + str + "\" bukan Palindrom.");
        }

        scanner.close();
    }
}
