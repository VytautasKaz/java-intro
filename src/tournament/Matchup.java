package tournament;

public class Matchup extends Player {
    private Player a;
    private Player b;

    @Override
    public String name() {
        return a.name() + " - " + b.name();
    }
}
