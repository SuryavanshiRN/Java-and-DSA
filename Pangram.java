package com.java;
import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

    }
    static boolean checkIfPangram(String sentence) {
        HashSet<Character> count= new HashSet<>();
        for (int i=0; i < sentence.length(); ++i) {
            count.add(sentence.charAt(i));
        }
        return count.size() == 26;
    }

}
