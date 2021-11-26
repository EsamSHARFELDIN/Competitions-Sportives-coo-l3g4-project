package main;


import java.util.*;

public class Master  extends Competition {
	private Map<Integer, List<Competitor>>groupStage;
    private List<Competitor>competitorsForPhaseTwo;
    private SelectTeamMethodStrategy selectTeamMethod;
    /**
     * <p>Constructor for Competition.</p>
     *
     * @param competitorList a {@link List} object.
     */
    public Master(List<Competitor> competitorList, SelectTeamMethodStrategy selectTeamMethod) {
        super(competitorList);
        this.groupStage = new HashMap<>();
        this.competitorsForPhaseTwo = new ArrayList<>();
        this.selectTeamMethod = selectTeamMethod;
    }
    private void speaker(String msg){
        System.out.println("*********** "+ msg + " ************");
    }
    /**
     * allows all the hens in the competition to play
     * @throws EmptyCompetitorListException
     */
    private void groupStage() throws EmptyCompetitorListException, NumberOfCompetitorsNotAchievedException {
        this.speaker("Phase de poules");
        this.selectTeamMethod.selectTeamMethod(this.groupStage, this.competitorList);
        League league;
        List<Competitor> competitorList;
        Set<Map.Entry<Integer, List<Competitor>>> competitorListEntry = this.groupStage.entrySet();
        Iterator<Map.Entry<Integer, List<Competitor>>> iterator = competitorListEntry.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, List<Competitor>> entry = iterator.next();
            competitorList = entry.getValue();
            league = new League(competitorList);
            this.speaker(" Matchs poule N° "+entry.getKey()+ " ");
            league.play(competitorList);
            this.selectTeamMethod.selectTeamForPhaseTwo(competitorList, this.competitorsForPhaseTwo);
        }
    }

    /**
     * final phase
     * @throws ListSizeIsNotPowerOfTwoException
     * @throws EmptyCompetitorListException
     */
    private void finaleStage() throws ListSizeIsNotPowerOfTwoException, EmptyCompetitorListException {
        this.speaker("Phase de finale");
        Tournament tournament = new Tournament(this.competitorsForPhaseTwo);
        this.resetCompetitorsPoint(this.competitorsForPhaseTwo);
        tournament.play(this.competitorsForPhaseTwo);
        classification(this.competitorsForPhaseTwo);
    }

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
            this.finaleStage();

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
     * @param competitorsList a {@link List} object.
     * @return <code>true</code> or <code>false</code>
     */
    @Override
    public boolean isPowerOfTwo(List<Competitor> competitorsList) {
        return false;
    }

}
