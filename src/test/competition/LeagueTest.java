package test;
import java.util.List;

import competition.Competition;
import competition.Competitor;

	

	public class LeagueTest extends CompetitionTest{

	    @Override
	    protected Competition createCompetition(List<Competitor>competitors) {
	        return new League(competitors);
	    }

}