package me.peppermill.testroom.godofjava.ch15;

import java.util.Locale;

public class UseStringMethods {

    public static void main(String[] args) {
        UseStringMethods useStringMethods = new UseStringMethods();
        useStringMethods.printWords("Hell Java");
        useStringMethods.findString("The String class represents character Strings.", "class");
        useStringMethods.findAnyCaseString("The String Class represents character Strings.", "class");
        useStringMethods.countChar("The String Class represents character Strings.", 'c');
        useStringMethods.printContainWords("The String Class represents character Strings.", "ss");
    }

    private void printContainWords(String s, String target) {
        for(String temp : s.split(" ")) {
            if (temp.contains(target))
                System.out.println(temp + " contains " + target);
        }
    }


    private void countChar(String s, char target) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if (target == c) {
                count++;
            }
        }
        System.out.println(count);
    }

    private void findAnyCaseString(String s, String target) {
        String a = new String(s);
        a= a.toLowerCase();
        System.out.println(a.indexOf(target));
    }

    private void findString(String s, String target) {
        System.out.println(s.indexOf(target));
    }

    private void printWords(String str) {
        for(String s : str.split(" ")) {
            System.out.println(s);
        }
    }
}
