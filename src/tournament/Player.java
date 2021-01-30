package tournament;

public abstract class Player {
    static private int counter;
    private int nr;

    public Player() {
        nr = ++counter;
    }

    public int getNr() {
        return nr;
    }

    public abstract String winner();

    public abstract String nameInAPair();
}
