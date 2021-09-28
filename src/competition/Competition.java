/**
 * 
 */
package competition;

import java.util.List;

/**
 * @author adama
 *
 */
public abstract class Competition {
	private Match match;
	private final List<Competitor> competitors;
	


	public Competition(List<Competitor> competitors) {
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
	
	public void play() {
		
	}	
	
	public void ranking () {
		
	}

}
