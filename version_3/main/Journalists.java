package main;


public class Journalists implements CompetitionObserver{
    private String mediaName;

    public Journalists(String mediaName){
        this.mediaName = mediaName;
    }
    @Override
    public void watchMatch(Competitor c1, Competitor c2, Competitor winner) {
        System.out.println("**** Bienvenue sur "+this.mediaName+ " ****");
        System.out.println("**** Match du jour ****");
        System.out.println("** Competitor 1 : "+c1.toString()+" **");
        System.out.println("** Competitor 2 : "+c2.toString()+" **");
        System.out.println("** Le gagnant est : "+winner.toString()+" **");
    }
}
