package competition;

import java.util.*;

import static util.MapUtil.sortByDescendingValue;


public abstract class Competition {
    protected Match match;
    protected List<Competitor>competitorList;
    protected Map<Competitor, Integer>competitors = new HashMap<>();

    
    public Competition(List<Competitor> competitorList) {
        this.competitorList = competitorList;
        this.match = new MatchRandom();
    }

    void play() throws EmptyCompetitorListException, ListSizeIsNotPowerOfTwoException {
        play(this.competitorList);
    }

   
    protected abstract void play(List<Competitor>competitors)throws EmptyCompetitorListException, ListSizeIsNotPowerOfTwoException;

   
    protected void playMatch(Competitor competitor1, Competitor competitor2){
        this.match.playMatch(competitor1, competitor2);
        displayWinner(competitor1, competitor2);
    }

    public Map<Competitor, Integer> ranking(){
        return sortByDescendingValue(this.competitors);
    }

    
    private void displayWinner(Competitor c1, Competitor c2){
        if(c1.getPoints() > c2.getPoints())
            System.out.println(c1.toString()+" vs "+c2.getPseudo()+ " ---> "+c1.getPseudo()+" wins !  🏆");
        else
            System.out.println(c1.toString()+" vs "+c2.getPseudo()+ " ---> "+c2.getPseudo()+" wins!   🏆");
    }

    public abstract void classification();


   
    public abstract boolean isPowerOfTwo(List<Competitor>competitorsList);
}
