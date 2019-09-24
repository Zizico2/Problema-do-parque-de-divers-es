package funPark;

import dataStructures.Iterator;
import funPark.attraction.Attraction;
import funPark.attraction.AttractionNotVisitedException;
import funPark.kid.InvalidItineraryException;

public interface FunPark {
    int getKidId();
    void addVisitEnd(int attrId, int score);
    void addVisitIndex(int i, int attrId, int score) throws InvalidItineraryException;
    Iterator<Attraction> getVisitedAttrs(boolean order);
    void removeVisitIndex(int attrId);
    int getNoOfVisitedAttrs();
    int getHighScore(int attrId) throws AttractionNotVisitedException;
} 