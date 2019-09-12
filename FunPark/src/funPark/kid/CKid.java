package funPark.kid;

import dataStructures.ArrayList;
import dataStructures.List;
import funPark.attraction.Attraction;
import funPark.attraction.CAttraction;

public class CKid implements Kid {

    List<Attraction> visitedAttractions;

    public CKid(){
        visitedAttractions = new ArrayList<>();
    }
} 