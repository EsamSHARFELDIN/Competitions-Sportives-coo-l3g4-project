package test;
import org.junit.Before;
import org.junit.Test;

import competition.Competitor;
import competition.RandomMatch;

import static org.junit.Assert.assertEquals;
public class RandomMatchTest {
	private Competitor c1;
    private Competitor c2;
    private RandomMatch randomMatch;

    @Before
    public void init(){
        this.c1 = new Competitor("Team 1");
        this.c2 = new Competitor("Team 2");
        this.randomMatch = new RandomMatch();
    }

    @Test
    public void ifWinnerPointChangeAfterCallPlayMatch(){
        int sumPointBeforePlayMatch = this.c1.getPoints() + this.c2.getPoints();
        this.matchRandom.playMatch(c1, c2);
        assertEquals(sumPointBeforePlayMatch+1, c1.getPoints()+c2.getPoints());
    }
}
