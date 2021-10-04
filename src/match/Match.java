package match;

import java.util.Random;

import competitor.Competitor;

public abstract class Match {
	private int score;
	private Competitor winner;
	private Competitor c1;
	private Competitor c2;

	
	public Match(Competitor c1,Competitor c2) {
		this.c1 = c1;
		this.c2 = c2;
		
	}
	
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	public void addScore (int score) {
		this.setScore(this.getScore()+1);
	}
	public Competitor playMatch(Competitor c1,Competitor c2) {
		Competitor[] competitors = {c1,c2};
		Competitor winner = competitors[new Random().nextInt(competitors.length)];
		return winner;
		
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the winner
	 */
	public Competitor getWinner() {
		return playMatch(c1, c2);
	}

	@Override
	public String toString() {
		return  c1 + "   vs   " + c2 + "  -->   " + getWinner() ;
	}

	
	

}
