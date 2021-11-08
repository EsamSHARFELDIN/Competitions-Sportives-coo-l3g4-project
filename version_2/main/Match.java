package main;


public interface Match {
    /**
     * allows to play a match
     *
     * @param competitor1 a {@link competition.Competitor} object.
     * @param competitor2 a {@link competition.Competitor} object.
     * @return a {@link competition.Competitor} object.
     */
    Competitor playMatch(Competitor competitor1, Competitor competitor2);
}
