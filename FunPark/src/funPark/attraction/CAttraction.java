package funPark.attraction;

import dataStructures.List;
import dataStructures.NoSuchElementException;
import dataStructures.ArrayList;
import dataStructures.Iterator;
import funPark.Visit;
import funPark.kid.Kid;

public class CAttraction implements Attraction {

    private List<Visit> visits;

    public CAttraction() {
        visits = new ArrayList<>();
    }

    @Override
    public void addVisit(Kid kid, int score) {
        visits.addLast(new Visit(kid, score));
    }

	@Override
	public int getHighScore() throws AttractionNotVisitedException {
        Iterator<Visit> iter = visits.iterator();
        int maxValue;

        try {
            maxValue = iter.next().score;
        } catch (NoSuchElementException e) {
            throw new AttractionNotVisitedException();
        }

        while (iter.hasNext()) {
            int next = iter.next().score;
            if (next > maxValue)
                maxValue = next;
        }

        return maxValue;
	}
}