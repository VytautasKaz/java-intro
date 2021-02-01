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

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Player.counter = counter;
    }

    public abstract String winner();

    public abstract String nameInAPair();
}
