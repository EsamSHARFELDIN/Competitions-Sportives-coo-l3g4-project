package competition;


import java.util.ArrayList;
import java.util.List;

import competitor.Competitor;
import match.Match;

public abstract class Competition {
	
	private String id;
	private Match match;
	private final List<Competitor> competitors;
	public Competition(String id){
		super();
		this.id = id;
		this.competitors= new ArrayList<Competitor>();
	}
	

	public void play() {
		for (Competitor c : competitors) {
			c.playMatch(c1,c2);
		}
	}
	
	/**
	 * 
	 * @param competitor add competitor
	 */


	public void addCompetitor(Competitor competitor) {
	 this.getCompetitors().add(competitor);
	}
	
	/**
	 * @return the competitors
	 */
	public List<Competitor> getCompetitors() {
		return competitors;
	}

	/**
	 * @return the match
	 */
	public Match getMatch() {
		return match;
	}
	protected abstract void play(List<Competitor> competitors);

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "competition [id=" + id + ", competitors =" + competitors +  "]";
	}


	

}
