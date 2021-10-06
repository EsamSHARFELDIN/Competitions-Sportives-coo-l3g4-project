package competition;

public class Competitor {
	
	private String pseudo;
	private int points;
	
	
		public Competitor(String pseudo) {
		this.pseudo = pseudo;
		this.points = 0;
	}


		/**
		 * @return the name
		 */
		public String getPseudo() {
			return pseudo;
		}


		@Override
		public String toString() {
			return "Competitor [pseudo=" + pseudo + "]";
		}


		/**
		 * @return the points
		 */
		public int getPoints() {
			return points;
		}


		public void setPoints() {
			this.points = points +1;
		}

		public boolean equals(Object object){
	        if(object instanceof Competitor){
	            Competitor other = (Competitor)object;
	            return this == other;
	        }
	        return false;
	    }
	

}
