package tournament;

public class Player {
    static private int counter;
    private int nr;

    public Player() {
        nr = ++counter;
    }

    public int getNr() {
        return nr;
    }

    public String winner(){
        return "";
    }

    public String nameInAPair(){
        return "";
    }
}
