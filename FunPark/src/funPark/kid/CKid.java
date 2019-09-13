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

    @Override
    public void addVisitIndex(int i, Attraction attr) {
        visitedAttractions.add(i, attr);
    }

    @Override
    public void addVisitEnd(Attraction attr) {
        visitedAttractions.addLast(attr);
    }

    @Override
    public int getNoOfVisitedAttrs() {
        return visitedAttractions.size();
    }
}