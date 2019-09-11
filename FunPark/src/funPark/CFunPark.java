package funPark;

import dataStructures.Iterator;
import dataStructures.Map;
import dataStructures.HashMap;
import funPark.attraction.*;
import funPark.kid.*;

public class CFunPark implements FunPark {
    private class KidIdentifier {
        public int id;
        public Kid kid;

        public KidIdentifier(int id, Kid kid){
            this.id = id;
            this.kid = kid;
        }
    }

    private KidIdentifier kid;

    private Map<Integer, Attraction> attractions;

    public CFunPark(int noOfAvailableAttractions, int kidId) {
        kid = new KidIdentifier(kidId, new CKid());
        attractions = new HashMap<>();
        for(int i = 0; i < noOfAvailableAttractions; i++){
            attractions.insert(i, new CAttraction());
        }
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