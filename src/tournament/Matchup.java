package tournament;

public class Matchup extends Player {
    private Player a;
    private Player b;

    public Matchup(Player a, Player b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String winner() {
        return this.getNr() + " matchup winner";
    }

    @Override
    public String nameInAPair() {
        return a.winner() + " - " + b.winner();
    }
}
