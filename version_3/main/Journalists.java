package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traorea  sharfeldin
 *
 */

public class Journalists implements CompetitionObserver{
    private String mediaName;
    protected static List<CompetitionObserver>observerList = new ArrayList<>();

    /**
     * @param mediaName
     */
    public Journalists(String mediaName){
        this.mediaName = mediaName;
    }
    
    /**
     * @param c1
     * @param c2
     * @param winner
     * display information of the match
     */
    @Override
    public void watchMatch(Competitor c1, Competitor c2, Competitor winner) {
		/*
		 * System.out.println();
		 * System.out.println("**** Bienvenue sur "+this.mediaName+ " ****");
		 * System.out.println("**** Match du jour ****");
		 * System.out.println("** Competitor 1 : "+c1.toString()+" **");
		 * System.out.println("** Competitor 2 : "+c2.toString()+" **");
		 * System.out.println("** Le gagnant est : "+winner.toString()+" **");
		 */
    }
	
}
