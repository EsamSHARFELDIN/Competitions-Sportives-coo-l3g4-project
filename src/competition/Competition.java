/**
 * 
 */
package competition;

import java.util.List;

import competitor.Competitor;
import match.Match;

/**
 * @author adama
 *
 */
public abstract class Competition {
	protected Match match;
	private final List<Competitor> competitors;
	


	public Competition(Match match,List<Competitor> competitors) {
		this.match= match;
		this.competitors = competitors;
	}


	public Match getMatch() {
		return match;
	}


	public void setMatch(Match match) {
		this.match = match;
	}


	public List<Competitor> getCompetitors() {
		return competitors;
	}
	

}
