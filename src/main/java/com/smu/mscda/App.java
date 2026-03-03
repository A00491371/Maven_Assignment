package com.smu.mscda;

import java.util.Scanner;
import org.apache.commons.text.WordUtils;
import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string in lower case: ");
        String input = scanner.nextLine();

        // Capitalize the input string
        String capitalizedString = WordUtils.capitalize(input);
        System.out.println("Capitalized String: " + capitalizedString);

        // Generate MD5 hex of the input string
        String md5Hex = DigestUtils.md5Hex(input);
        System.out.println("MD5 Hex: " + md5Hex);

        scanner.close();
    }
}
