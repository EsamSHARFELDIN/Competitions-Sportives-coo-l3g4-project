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
	private  final List<Competitor> competitors;
	


	
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
	/*public play() {	
		
	}
	protected  play(List<Competitor> competitors) {
		this.competitors = competitors;
	}
	protected playMatch(Competitor c1, Competitor c2) {
		
		if (c1.getName().equals("bye"))		
			c = 0;					
		else if (c2.getName().equals("bye"))	
			c = 1;					
		
		if (c > 0) {		
			winner = c1;
			c1.addWin();
			loser = c2;
			c2.addLoss();
		} else {		
			winner = c2;
			c2.addWin();
			loser = c1;
			c1.addLoss();
		}
		return winner;
	}*/

}
