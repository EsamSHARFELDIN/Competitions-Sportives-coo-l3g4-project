package test;



 
import main.*;

import java.util.List;

public class TwentyFourTeamTest extends SelectTeamMethodTest{

    @Override
    protected SelectTeamMethodStrategy createSelectMethod(List<Competitor> competitorList) {
        return new TwentyFourTeamStrategy();
    }
}
