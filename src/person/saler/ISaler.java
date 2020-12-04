package person.saler;

import candy.Candy;
import except.CandyNotFound;

import java.util.List;

public interface ISaler {
    void sellCandies(List<Candy> candies) throws CandyNotFound;
    void startWorkDay();
    void finishWorkDay();
    void findCandies(Candy candy);
}
