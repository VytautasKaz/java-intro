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
        if (getNr() == 1){
            return this.getNr() + "st matchup winner";
        } else if (getNr() == 2){
            return this.getNr() + "nd matchup winner";
        } else if (getNr() == 3){
            return this.getNr() + "rd matchup winner";
        } else {
            return this.getNr() + "th matchup winner";
        }
    }

    @Override
    public String nameInAPair() {
        return a.winner() + " - " + b.winner();
    }
}
