package funPark;

import dataStructures.Iterator;
import funPark.attraction.Attraction;

public interface FunPark {
    void addVisitEnd(int attrId, int score);
    void addVisitIndex(int i, int attrId, int score);
    Iterator<Attraction> getVisitedAttrs(boolean order);
    void removeVisitIndex(int attrId);
    int getNoOfVisitedAttrs();
    int getHighScore(int attrId);
} 