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


   
    public int getPoints() {
        return points;
    }

    public void setPoints() {
        this.points += 1;
    }

    public String toString() {
        return this.getPseudo() + "";
    }


    public boolean equals(Object object){
        if(object instanceof Competitor){
            Competitor other = (Competitor)object;
            return this == other;
        }
        return false;
    }

}
