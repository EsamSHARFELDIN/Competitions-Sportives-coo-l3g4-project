package competitor;

public class Competitor {
	private String pseudo;
	private int score;
	
	
	public Competitor(String string) {
		super();
		this.pseudo = string;
	}
		
		/**
	
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	
	/**
		 * @return the score
		 */
		public int getScore() {
			return score;
		}

		/**
		 * @param score the score to set
		 */
		public void setScore(int score) {
			this.score = score;
		}
		
		public void addScore(int score) {
			this.setScore(this.getScore() + 1);
		}

	@Override
	public String toString() {
		return  pseudo ;
	}
}
