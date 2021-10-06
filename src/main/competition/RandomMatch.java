package competition;

import java.util.Random;

public class RandomMatch implements Match {


	

	public RandomMatch() {
	}

	public Competitor playMatch(Competitor c1, Competitor c2) {
        Competitor winner;
        int random = new Random().nextInt(2);
        if(random > 0){
            c1.setPoints();
            winner = c1;
        }
        else {
            c2.setPoints();
            winner = c2;
        }
        return winner;
    }

	

}
