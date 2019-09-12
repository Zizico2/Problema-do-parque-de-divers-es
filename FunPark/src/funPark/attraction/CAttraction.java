package funPark.attraction;

import dataStructures.List;
import dataStructures.ArrayList;
import funPark.Visit;

public class CAttraction implements Attraction{

    private List<Visit> visits;

    public CAttraction(int iD){
        visits = new ArrayList<>();
    }
} 