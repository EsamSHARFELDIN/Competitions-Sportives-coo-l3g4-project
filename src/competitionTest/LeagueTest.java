package competitionTest;

import java.util.List;

import competition.Competition;
import competition.Competitor;
import competition.League;

public class LeagueTest extends CompetitionTest{

    protected Competition createCompetition(List<Competitor>competitors) {
        return new League(competitors);
    }
}
