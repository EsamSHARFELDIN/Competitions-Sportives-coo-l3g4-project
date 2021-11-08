package competition;


public class Competitor {
    private String pseudo;
    private int points;

    public Competitor(String pseudo) {
        this.pseudo = pseudo;
        this.points = 0;
    }

   
    public String getPseudo() {
        return pseudo;
    }


    /**
     * <p>Getter for the field <code>competitorPoint</code>.</p>
     *
     * @return a int.
     */
    public int getPoints() {
        return points;
    }

    /**
     * <p>Setter for the field <code>competitorPoint</code>.</p>
     */
    public void setPoints() {
        this.points += 1;
    }

    /**
     * reset the point to zero
     */
    public void resetPoint(){
        this.points = 0;
    }
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.getPseudo() + "";
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
