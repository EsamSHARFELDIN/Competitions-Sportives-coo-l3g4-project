/**
 * 
 */
package competition;

import competitor.Competitor;
import match.Match;
import match.Matchs;

/**
 * @author adama
 *
 */
public class CompetitionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Competitor c1= new Competitor("Lynx");
		Competitor c2= new Competitor("Midas");
		Competitor c3= new Competitor("Drift");
		Competitor c4= new Competitor("Catalyst");
		Competitor c5= new Competitor("Raven");
		Competitor c6= new Competitor("Blastoff");
		Competition competition = new Competitions ("round_1");
		competition.addCompetitor(c1);
		competition.addCompetitor(c2);
		competition.addCompetitor(c3);
		competition.addCompetitor(c4);
		competition.addCompetitor(c5);
		competition.addCompetitor(c6);
		Match match = new Matchs (c1,c2);
		match.playMatch(c1, c2);
		System.out.println("\n   "+ match.toString());
		System.out.println("\n     " + competition.toString());
		
	}

}
