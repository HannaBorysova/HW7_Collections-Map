package main.java.com.hw7.family;

import java.util.Comparator;

public class FamilyComp implements Comparator<Family> {
    @Override
    public int compare(Family family, Family f1) {
        return family.getTitle().compareTo(f1.getTitle());
    }
}
