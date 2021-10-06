package test;

import org.junit.Test;

import competition.Competition;
import competition.Competitor;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class TournamentTest  extends CompetitionTest {
	protected Competition createCompetition(List<Competitor> competitorsList) {
        return new Tournament(competitorsList);
    }

	
}
