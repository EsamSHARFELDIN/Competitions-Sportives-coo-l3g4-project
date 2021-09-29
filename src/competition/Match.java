package competition;

public abstract class Match {
		private Competitor c1;	
		private Competitor c2;	
		private Competitor winner;	
		private Competitor loser;	
		
		public Match(Competitor c1, Competitor c2) {	
			this.c1 = c1;
			this.c2 = c2;	
		}
		
		
		
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
