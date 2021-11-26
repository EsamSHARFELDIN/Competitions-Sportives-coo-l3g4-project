package main;

public class Competitor {
	
	private String pseudo;
	private int points;
    public Competitor(String pseudo, int points) {
		this.pseudo = pseudo;
		this.points = points;
	}
   
    public int getPoints() {
		return points;
	}

	public void setPoints() {
		this.points = +1;
	}

    public String getPseudo() {
		return pseudo;
	}



    /** {@inheritDoc} */
    public boolean equals(Object object){
        if(object instanceof Competitor){
            Competitor other = (Competitor)object;
            return this == other;
        }
        return false;
    }

}
