package main;

import java.util.*;

public class BookMakers implements CompetitionObserver{
    private Map<Competitor, Integer>rateMap;
    private String bookMakerName;

    public BookMakers(String bookMakerName, List<Competitor>competitorList){
        this.rateMap = new HashMap<>();
        this.bookMakerName = bookMakerName;
        competitorList.forEach(competitor -> {
            this.rateMap.put(competitor, 1);
        });
    }
    @Override
    public void watchMatch(Competitor c1, Competitor c2, Competitor winner) {
        this.rateUpdate(c1, c2, winner);
    }

    /**
     * update the competitor's rate
     * @param c1 Competitor "team 1"
     * @param c2 Competitor "team 2"
     * @param winner Competitor "the winner between the two"
     */
    private void rateUpdate(Competitor c1, Competitor c2, Competitor winner){
        int winnerRate = competitorRate(winner)-1;
        if(winnerRate <= 0)
            this.rateMap.put(winner, 1);
        else
            this.rateMap.put(winner, winnerRate);
        this.rateMap.put(looser(c1, c2, winner), competitorRate(looser(c1, c2, winner))+1);
        this.displayTheCompetitorsRate();
    }

    /**
     * return the looser between the two
     * @param c1 Competitor "team 1"
     * @param c2 Competitor "team 2"
     * @param winner Competitor "the winner between the two"
     * @return Competitor
     */
    private Competitor looser(Competitor c1, Competitor c2, Competitor winner){
        if(!c1.equals(winner))
            return c1;
        return c2;
    }

    /**
     * return the competitor's rate
     * @param competitor "a competitor"
     * @return int
     */
    private int competitorRate(Competitor competitor){
        return this.rateMap.get(competitor);
    }

    /**
     * display the competitor's rate
     */
    private void displayTheCompetitorsRate(){
        Set<Map.Entry<Competitor, Integer>> competitorEntry = this.rateMap.entrySet();
        System.out.println("**** Bookmaker présent "+this.bookMakerName+" ****");
        for (Map.Entry<Competitor, Integer> entry : competitorEntry) {
            System.out.println(entry.getKey() + " Cote : " + entry.getValue());           
     
        }
    }
}
