package main.java.com.hw7.family;

import java.util.Comparator;

public class FamilyCompByLength implements Comparator<Family> {
    @Override
    public int compare(Family family, Family f1) {
        return family.getNameOfEmblem().length() - f1.getNameOfEmblem().length();
    }
}
