package competition;

import java.util.List;

import competitor.Competitor;

public class Competitions  extends Competition{
	

	public Competitions(String id) {
		super(id);
	
	}
	
	@Override
	protected void play(List<Competitor> competitors) {
		play(competitors);
		
	}
}
