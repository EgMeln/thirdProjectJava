package com.bsu.by;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter text: ");
            List<String> text = new ArrayList<>();
            String str = in.nextLine();
            while (!str.isEmpty()) {
                text.add(str);
                str = in.nextLine();
            }
            if (text.size() == 0) {
                throw new InvalidParameterException("Your line is empty.");
            }
            List<String> finallyStr = toLargeLetter(text);
            outList(finallyStr);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    static List<String> toLargeLetter(List<String> text) {
        List<String> newStr = new ArrayList<>();
        for (String str : text) {
            StringBuilder modifiedStr = new StringBuilder(str);
            char[] charArray = str.toCharArray();
            for (int i = 1; i < str.length(); i++) {
                modifiedStr.setCharAt(0, Character.toUpperCase(str.charAt(0)));
                if (Character.isSpaceChar(str.charAt(i - 1)) | charArray[i - 1] == '.' | charArray[i - 1] == ',') {
                    modifiedStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
                }
            }
            newStr.add(modifiedStr.toString());
        }
        return newStr;
    }

    static void outList(List<String> text) {
        for (String s : text) {
            System.out.println(s);
        }
    }
}

