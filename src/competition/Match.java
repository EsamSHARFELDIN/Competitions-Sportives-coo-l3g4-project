package competition;

public class Match {
	private Competitor c1;	
	private Competitor c2;	
	private Competitor winner;	
	private Competitor loser;	
	
	public Match(Competitor c1, Competitor c2) {	
		this.c1 = c1;
		this.c2 = c2;
		
	}
	
	/*public Competitor  setResults(int c) {		
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
	
	public Competitor getWinner() {	
		return winner;
	}
	
	public Competitor getLoser() {	
		return loser;
	}
	public String toString() {
		return c1 + "(" + c1.getPoints() + ")" + " vs. " + c2 + "(" + c2.getPoints() + ")";	
	}
}
