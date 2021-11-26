package main;



public interface CompetitionObserver {
    void watchMatch(Competitor c1, Competitor c2, Competitor winner);
}
