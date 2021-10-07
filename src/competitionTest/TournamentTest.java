package competitionTest;

/**
 * @author adama
 *
 */
import java.util.List;

import competition.Competition;
import competition.Competitor;
import competition.Tournament;


public class TournamentTest extends CompetitionTest{
	@Override
    protected Competition createCompetition(List<Competitor> competitorsList) {
        return new Tournament(competitorsList);
    }


}
