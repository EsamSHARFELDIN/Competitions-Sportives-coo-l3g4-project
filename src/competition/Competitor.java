/**
 * 
 */
package competition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author traorea
 *
 */

public class Competitor implements Comparable<Competitor> {
	
	private String name;		//String identifier of the player
	private int win = 0;		//number of wins
	private int loss = 0;		//number of losses
	private int points;
	public List<Competitor>  list= new ArrayList<Competitor>();
	
	public  Competitor (String name) {
		this.name=name;
	} 
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the win
	 */
	public int getWin() {
		return win;
	}
	/**
	 * @param win the win to set
	 */
	public void setWin(int win) {
		this.win = win;
	}

	/**
	 * @return the loss
	 */
	public int getLoss() {
		return loss;
	}
	
	/**
	 * @param loss the loss to set
	 */
	public void setLoss(int loss) {
		this.loss = loss;
	}
	
	

	@Override
	public int compareTo(Competitor o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void addWin() {
		// TODO Auto-generated method stub
		
	}
	public void addLoss() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	
	




	
	


}
