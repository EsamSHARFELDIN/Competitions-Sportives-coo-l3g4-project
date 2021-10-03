package match;

import competitor.Competitor;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Competitor c1= new Competitor("Lynx");
		Competitor c2= new Competitor("Midas");
		Match match = new Matchs (c1,c2);

		match.playMatch(c1, c2);
		
		System.out.println("\n   "+ match.toString());
	}

}
