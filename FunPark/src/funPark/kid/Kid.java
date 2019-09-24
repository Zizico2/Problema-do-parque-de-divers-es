package funPark.kid;

import funPark.attraction.Attraction;

public interface Kid {

	void addVisitIndex(int i, Attraction attr) throws InvalidItineraryException;

	void addVisitEnd(Attraction attr);

	int getNoOfVisitedAttrs();
    
} 