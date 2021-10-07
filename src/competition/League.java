package competition;

import java.util.List;


/**
 * @author traorea
 *
 */
public class League extends Competition{

  
    public League(List<Competitor>competitorList){
        super(competitorList);
    }

    
    protected void play(final List<Competitor> competitors) throws EmptyCompetitorListException {
        if(competitors.isEmpty())
            throw new EmptyCompetitorListException("competitor's list should not be empty");

        this.competitorList.forEach(competitor -> this.competitorList.forEach(competitor2 ->{
            if(!competitor.equals(competitor2)){
                this.playMatch(competitor, competitor2);
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
