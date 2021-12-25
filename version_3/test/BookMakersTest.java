package test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import main.*;

public class BookMakersTest {
	private Map<Competitor, Integer> rateMap;
	
	private BookMakers bookMakers;
	private Competitor cp1;
	private Competitor cp2;
	private List<Competitor> competitors;
	
	@Before
	public void init() {
		this.cp1 = new Competitor("cp1");
		this.cp2 = new Competitor("cp2");
		this.competitors = new ArrayList<Competitor>();
		this.competitors.add(cp1);
		this.competitors.add(cp2);
		this.bookMakers = new BookMakers("bookmakertest", this.competitors);
	}


	/*@Test
	public void rateUpdateTest() {
		Competitor winner = new Competitor("Team1");
		int winnerRate = -2;
        if(winnerRate <= 0) {
        	this.rateMap.put(winner, 1);
        }
        assertEquals(, 1);    
	}*/
	
	@Test
	public void rateUpdateShouldDecreaseTheWinnerCoteTest() {
		assertEquals(this.bookMakers.competitorRate(cp1), 1);
		assertEquals(this.bookMakers.competitorRate(cp2), 1);
		this.bookMakers.rateUpdate(this.cp1, this.cp2, this.competitors.get(0));
		assertEquals(this.bookMakers.competitorRate(cp1), 1);
	}
	
	@Test
	public void rateUpdateShouldIncreaseTheLooserCoteTest() {
		assertEquals(this.bookMakers.competitorRate(cp1), 1);
		assertEquals(this.bookMakers.competitorRate(cp2), 1);
		this.bookMakers.rateUpdate(this.cp1, this.cp2, cp1);
		assertEquals(this.bookMakers.competitorRate(cp2), 2);
	}
	
	@Test
	public void competitorRateShouldRetureTheGoodRateTest() {
		assertEquals(this.bookMakers.competitorRate(cp1), 1);
		assertEquals(this.bookMakers.competitorRate(cp2), 1);
	}
	
	@Test
	public void looserShouldGiveTheLooserCompetitorTest() {
		assertEquals(this.bookMakers.looser(this.cp1, this.cp2, cp1), this.cp2);
	}
	
	/*@Test
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
		assertEquals(this.rateUpdate(c1,c2,winner),1); 
	}*/
}
