package main;



/**
 * @author traorea sharfeldin
 *
 */
/*
 * interface CompetitionObserver
 * @param Competitor c1
 * @param Competitor c2
 * @param Competitor winner
 */
public interface CompetitionObserver {
    void watchMatch(Competitor c1, Competitor c2, Competitor winner);

}
