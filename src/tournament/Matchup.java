package tournament;

public class Matchup extends Player {
    private Player a;
    private Player b;
    static private int count;
    private int number;

    public Matchup(Player a, Player b) {
        this.a = a;
        this.b = b;
        this.number = ++count;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String winner() {
        if (getNumber() == 1){
            return this.getNumber() + "st matchup winner";
        } else if (getNumber() == 2){
            return this.getNumber() + "nd matchup winner";
        } else if (getNumber() == 3){
            return this.getNumber() + "rd matchup winner";
        } else {
            return this.getNumber() + "th matchup winner";
        }
    }

    @Override
    public String nameInAPair() {
        return a.winner() + " - " + b.winner();
    }
}
