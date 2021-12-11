package test;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import main.*;

public class BookMakersTest implements CompetitionObserverTest {
	private Map<Competitor, Integer>rateMap;


	@Test
	public void rateUpdateTest() {
		Competitor winner = new Competitor("Team1");
		int winnerRate = -2;
        if(winnerRate <= 0)
        assertEquals(this.rateMap.put(winner, 1),1);    
	}
	@Test
  public void competitorRateTest() {
	Competitor competitor = new Competitor ("Team2");
	assertEquals(this.rateMap.get(competitor),1);
}
	@Test
	public  void looserTest() {
		Competitor winner = new Competitor("Team1");
		Competitor c1 = new Competitor("Team2");
		assertEquals(c1.equals(winner),c1);
	}
	@Test
	public void watchMatchTest() {
		Competitor c1 = new Competitor ("Team1");
		Competitor c2 = new Competitor ("Team2");
		Competitor winner = new Competitor ("Team2");
		/* assertEquals(this.rateUpdate(c1,c2,winner),1); */
	}
}
