package main.java.com.hw7.executor;

import main.java.com.hw7.family.Family;
import main.java.com.hw7.family.FamilyComp;
import main.java.com.hw7.family.FamilyCompByLength;
import main.java.com.hw7.map.Duplicates;


import java.util.Map;
import java.util.TreeMap;

public class Executor {
    public static void start() {
        Duplicates.removeDuplicates(Duplicates.createMap());
        Executor.startFamily();
    }

    public static void startFamily() {
        Map<Family, Integer> family = new TreeMap<>();
        family.put(new Family("Targaryen", 3, "dragon", "A red three-headed dragon, breathing flame on black"), 1);
        family.put(new Family("Stark", 3, "hardwolf", "A running grey direwolf, on an ice-white field"), 2);
        family.put(new Family("Lannister", 2, "lion", "A roaring lion, gold on crimson"), 3);
        family.put(new Family("Tyrell", 1, "rose", "A golden rose on green"), 4);
        family.put(new Family("Martell", 3, "spear", "A red sun pierced by a golden spear on orange"), 5);
        family.put(new Family("Tully", 1, "fish", "a leaping trout, silver, against a rippling blue-and-red field"), 6);
        family.put(new Family("Baratheon ", 1, "deer", "A crowned stag black on a golden field"), 7);
        family.put(new Family("Tarly", 2, "huntsman", "A striding red huntsman on green"), 8);
        family.put(new Family("Arryn", 1, "falcon", "A sky-blue falcon soaring against a white moon, on sky-blue"), 9);
        family.put(new Family("Greyjoy", 2, "kraken", "A golden kraken on black"), 10);

        System.out.println("Sort by name: ");
        family.forEach((Integer, Family) -> System.out.println(Integer + " " + Family));

        Map<Family, Integer> familyDescendSort = new TreeMap<>(new FamilyComp().reversed());
        familyDescendSort.putAll(family);
        System.out.println("Sort by title: ");
        familyDescendSort.forEach((Integer, Family) -> System.out.println(Integer + " " + Family));

        Map<Family, Integer> familySortByLength = new TreeMap<>(new FamilyCompByLength());
        familySortByLength.putAll(family);

        System.out.println("Sort by length of Emblem: ");
        familySortByLength.forEach((Integer, Family) -> System.out.println(Integer + " " + Family));
    }

    }




