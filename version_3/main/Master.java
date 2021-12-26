package main;


import java.util.*;
import java.util.Map.Entry;



public class Master  extends Competition {
	private Map<Integer, List<Competitor>>groupStage;
    private List<Competitor>competitorsForPhaseTwo;
    private SelectTeamMethodStrategy selectTeamMethod;
    private Map<Competitor, Integer>rateMap;
 
    /**
     * constructor Master
     * @param competitorList
     * @param selectTeamMethod
     */
    public Master(List<Competitor> competitorList, SelectTeamMethodStrategy selectTeamMethod) {
        super(competitorList);
        this.groupStage = new HashMap<>();
        this.competitorsForPhaseTwo = new ArrayList<>();
        this.selectTeamMethod = selectTeamMethod;
    }
    /**
     * @param msg
     * display message
     */
    private void speaker(String msg){
        System.out.println("*********** "+ msg + " ************");
    }
    /**
     * allows all the hens in the competition to play
     * @throws EmptyCompetitorListException
     */
    private void groupStage() throws EmptyCompetitorListException, NumberOfCompetitorsNotAchievedException {
        //this.speaker("Phase de poules");
        this.selectTeamMethod.selectTeamMethod(this.groupStage, this.competitorList);
        System.out.println("Les poules :");
        System.out.println("----------");
       
        for(Entry<Integer, List<Competitor>> entry : this.groupStage.entrySet()) {
        	System.out.format("Poule %d \n", entry.getKey());
        	System.out.println("========");
        	for(Competitor c : entry.getValue()) {
        		System.out.println(c.getPseudo());
        	}
        	System.out.println("======================================");
        }
        System.out.println("======================================");
        League league;
        List<Competitor> competitorList;
        Set<Map.Entry<Integer, List<Competitor>>> competitorListEntry = this.groupStage.entrySet();
        Iterator<Map.Entry<Integer, List<Competitor>>> iterator = competitorListEntry.iterator();
        
        while (iterator.hasNext()){
            Map.Entry<Integer, List<Competitor>> entry = iterator.next();
            competitorList = entry.getValue();
            league = new League(competitorList);
            
            System.out.println("-----------------------------");
            this.speaker(" Poule N°"+entry.getKey()+ " -  Matchs");
            System.out.println("-----------------------------");
            
            league.play(competitorList);
            this.selectTeamMethod.selectTeamForPhaseTwo(competitorList, this.competitorsForPhaseTwo);
            System.out.println();
            
            this.speaker(" Poule N°"+entry.getKey()+ " -  Cotes");
            System.out.println("-----------------------------");
            
            
            
            
                        
        }
    }

    /**
     * final phase
     * @throws ListSizeIsNotPowerOfTwoException
     * @throws EmptyCompetitorListException
     */
	/*
	 * private void finaleStage() throws ListSizeIsNotPowerOfTwoException,
	 * EmptyCompetitorListException { this.speaker("Phase de finale"); Tournament
	 * tournament = new Tournament(this.competitorsForPhaseTwo);
	 * this.resetCompetitorsPoint(this.competitorsForPhaseTwo);
	 * tournament.play(this.competitorsForPhaseTwo);
	 * classification(this.competitorsForPhaseTwo); }
	 */

    /**
     * reset the competitor's point to zero
     * @param competitorList a list of competitor
     */
    private void resetCompetitorsPoint(List<Competitor>competitorList){
        competitorList.forEach(Competitor::resetPoint);
    }
    
    /**
     * allows to play all the match according to type of competition
     * @param competitors list of competitors
     * @throws EmptyCompetitorListException throws an exception when that list is empty
     * @throws ListSizeIsNotPowerOfTwoException throws an exception when list's size is not power of 2
     */
    
    @Override
    public void play(List<Competitor> competitors) throws EmptyCompetitorListException, ListSizeIsNotPowerOfTwoException {
        try{
            this.groupStage();
            
           // this.finaleStage();

        }catch (NumberOfCompetitorsNotAchievedException e){
            e.printStackTrace();
        }
    }

    /**
     * <p>classification.</p>
     */
    @Override
    public void classification(List<Competitor>competitorList) {
        competitorList.forEach(competitor -> {
            this.competitors.put(competitor, competitor.getPoints());
        });
    }

    /**
     * return true if competitor's list size is power of 2, false else
     *
     * @param competitorsList .
     * @return true or false
     */
    @Override
    public boolean isPowerOfTwo(List<Competitor> competitorsList) {
        return false;
    }
    

}
