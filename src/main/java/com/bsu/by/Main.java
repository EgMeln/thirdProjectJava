package com.bsu.by;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter text: ");
            String str = in.nextLine();
            if (str.trim().length() == 0) {
                throw new StringIndexOutOfBoundsException("Your line is empty.");
            }
            System.out.println(toLargeLetter(str));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    static String toLargeLetter(String str) {
        StringBuilder secondStr = new StringBuilder(str);
        secondStr.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        char[] charArray = str.toCharArray();
        for (int i = 1; i < str.length(); i++) {
            if (Character.isSpaceChar(str.charAt(i - 1)) | charArray[i - 1] == '.' | charArray[i - 1] == ',') {
                secondStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        return secondStr.toString();
    }
}

