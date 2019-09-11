package funPark;

import dataStructures.Iterator;
import funPark.attraction.Attraction;

public interface FunPark {
    void AddVisitEnd(int attrId, int score);
    void AddVisitIndex(int i, int attrId, int score);
    Iterator<Attraction> GetVisitedAttrs(boolean order);
    void RemoveVisitIndex(int attrId);
    int getNoOfVisitedAttrs();
    int getHighScore(int attrId);
} 