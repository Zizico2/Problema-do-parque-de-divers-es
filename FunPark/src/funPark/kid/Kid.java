package funPark.kid;

import funPark.attraction.Attraction;

public interface Kid {

	void addVisitIndex(int i, Attraction attr);

	void addVisitEnd(Attraction attr);

	int getNoOfVisitedAttrs();
    
} 