package funPark.kid;

import dataStructures.ArrayList;
import dataStructures.InvalidPositionException;
import dataStructures.List;
import funPark.attraction.Attraction;

public class CKid implements Kid {

    List<Attraction> visitedAttractions;

    public CKid(){
        visitedAttractions = new ArrayList<>();
    }

    @Override
    public void addVisitIndex(int i, Attraction attr) throws InvalidItineraryException{
        try {
            visitedAttractions.add(i, attr);
        } catch (InvalidPositionException e) {
            throw new InvalidItineraryException();
        }
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