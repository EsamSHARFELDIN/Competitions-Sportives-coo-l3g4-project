package competition;

import java.util.Random;


public class MatchRandom implements Match{
    /**
     * <p>Constructor for MatchRandom.</p>
     */
    public MatchRandom(){}

    /** {@inheritDoc} */
    public Competitor playMatch(Competitor competitor1, Competitor competitor2) {
        Competitor winner;
        int random = new Random().nextInt(2);
        if(random > 0){
            competitor1.setPoints();
            winner = competitor1;
        }
        else {
            competitor2.setPoints();
            winner = competitor2;
        }
        return winner;
    }
}
