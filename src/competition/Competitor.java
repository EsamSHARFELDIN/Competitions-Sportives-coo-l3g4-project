package competition;


/**
 * @author traorea
 *
 */
public class Competitor {
    private String pseudo;
    private int points;

    /**
     * @param pseudo
     */
    public Competitor(String pseudo) {
        this.pseudo = pseudo;
        this.points = 0;
    }

    
    /**
     * @return
     */
    public String getPseudo() {
        return pseudo;
    }


   
    /**
     * @return
     */
    public int getPoints() {
        return points;
    }

    /**
     * 
     */
    public void setPoints() {
        this.points += 1;
    }

    /**
     * @return
     */
    public String toString() {
        return this.getPseudo() + "";
    }


    /**
     * @param object
     * @return
     */
    public boolean equals(Object object){
        if(object instanceof Competitor){
            Competitor other = (Competitor)object;
            return this == other;
        }
        return false;
    }

}
