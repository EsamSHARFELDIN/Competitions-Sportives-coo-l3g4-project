package competition;

import java.util.List;

public class Competition {
	private Match match;
	private final List<Competitor> competitors;
	
	
	public Competition(List<Competitor> competitors) {
		this.competitors = competitors;
	}
}
