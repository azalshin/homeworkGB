package org.example.lesson_k;

import java.util.*;


public class Homework {
    public static void main(String[] args) {
        String wordsCollect = "alphabet, word, track, music, bass, soundtrack, " +
                "java, triangle, word, word, jazz, dance," +
                " game, euro, dollar, pc, cat, dog, cat, do, game, euro, dollar, pc, cat, dog, cat, do";
//        System.out.println(wordsToList(wordsCollect.split(", ")));
//        System.out.println(wordsRepeats(wordsCollect.split(", ")))
        System.out.println(wordsToList(wordsCollect.toLowerCase().split(", ")));
        System.out.println(wordsRepeats(wordsCollect.toLowerCase().split(", ")));
//        Phonebook people1 = new Phonebook("Ivanov", "16-54-51-65-845");
//        Phonebook people2 = new Phonebook("Ivanov", "45-44-5-4-5-45-4");
    }

    public static HashSet<String> wordsToList (String[] wordsArray) {
        return new HashSet<>(Arrays.asList(wordsArray));
    }

    public static HashMap<String, Integer> wordsRepeats(String[] arr) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        return hashMap;
    }
}


