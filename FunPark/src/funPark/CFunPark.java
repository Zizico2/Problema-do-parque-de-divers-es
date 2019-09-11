package funPark;

import dataStructures.Iterator;
import dataStructures.Map;
import funPark.attraction.*;
import funPark.kid.*;

public class CFunPark implements FunPark {

    Kid kid;



    public CFunPark(int noOfAvailableAttractions, int kidId) {
        // TODO
    }

    @Override
    public void AddVisitEnd(int attrId, int score) {
        // TODO Auto-generated method stub

    }

    @Override
    public void AddVisitIndex(int i, int attrId, int score) {
        // TODO Auto-generated method stub

    }

    @Override
    public Iterator<Attraction> GetVisitedAttrs(boolean order) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void RemoveVisitIndex(int attrId) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getNoOfVisitedAttrs() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getHighScore(int attrId) {
        // TODO Auto-generated method stub
        return 0;
    }
}