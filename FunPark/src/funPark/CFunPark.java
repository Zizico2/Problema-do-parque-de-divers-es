package funPark;

import dataStructures.Iterator;
import dataStructures.Map;
import dataStructures.HashMap;
import funPark.attraction.*;
import funPark.kid.*;

public class CFunPark implements FunPark {
    private class IdentifiedKid extends CKid implements Kid {
        public final int id;

        public IdentifiedKid(int id){
            super();
            this.id = id;
        }
    }

    private final Kid kid;

    private Map<Integer, Attraction> attractions;

    public CFunPark(int noOfAvailableAttractions, int kidId) {
        kid = new IdentifiedKid(kidId);
        attractions = new HashMap<>();
        for(int i = 0; i < noOfAvailableAttractions; i++){
            attractions.insert(i, new CAttraction());
        }
    }

    @Override
    public int getKidId(){
        return ((IdentifiedKid)kid).id;
    }

    @Override
    public void addVisitEnd(int attrId, int score) {
        Attraction attraction = attractions.find(attrId);

        kid.addVisitEnd(attraction);
        attraction.addVisit(kid, score);
    }

    @Override
    public void addVisitIndex(int i, int attrId, int score) throws InvalidItineraryException {
        Attraction attraction = attractions.find(attrId);
        try {
            kid.addVisitIndex(i, attraction);
        } catch (InvalidItineraryException e) {
            throw e;
        }
        attraction.addVisit(kid, score);
    }

    @Override
    public Iterator<Attraction> getVisitedAttrs(boolean order) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeVisitIndex(int attrId) {
        // TODO Auto-generated method stub
    }

    @Override
    public int getNoOfVisitedAttrs() {
        return kid.getNoOfVisitedAttrs();
    }

    @Override
    public int getHighScore(int attrId) {
        // TODO Auto-generated method stub
        return 0;
    }
}