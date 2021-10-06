package competition;

import java.util.List;

public class League extends Competition {

 
    public League(List<Competitor> competitorList){
        super(competitorList);
    }

    protected void play(final List<Competitor> competitors) throws EmptyCompetitorListException {
        if(competitors.isEmpty())
            throw new EmptyCompetitorListException("competitor's list should not be empty");

        this.competitorList.forEach(competitor -> this.competitorList.forEach(c2 ->{
            if(!competitor.equals(c2)){
                this.playMatch(competitor, c2);
            }
        }));
        classification();
    }

    public boolean isPowerOfTwo(List<Competitor> competitorsList) {
        return (((float)competitorList.size()/2)%2)==0.0;
    }

    
    public void classification(){
        this.competitorList.forEach(competitor -> {
            this.competitors.put(competitor, competitor.getPoints());
        });
    }
}
