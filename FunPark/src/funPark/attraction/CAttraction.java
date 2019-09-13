package funPark.attraction;

import dataStructures.List;
import dataStructures.ArrayList;
import funPark.Visit;
import funPark.kid.Kid;

public class CAttraction implements Attraction {

    private List<Visit> visits;

    public CAttraction() {
        visits = new ArrayList<>();
    }

    @Override
    public void addVisit(Kid kid, int score) {
        visits.addLast(new Visit(kid, score));
    }
} 