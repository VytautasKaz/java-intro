package tournament;

import static tournament.Matchup.setCount;
import static tournament.Player.setCounter;

public class Main {
    public static void main(String[] args) {
//        Person person1 = new Person("A");
//        Person person2 = new Person("B");
//        Matchup m1 = new Matchup(person1, person2);
//        Person person3 = new Person("C");
//        Matchup m2 = new Matchup(m1, person3);
//        Matchup m3 = new Matchup(m1, m2);
//
//        System.out.println(person1.getNr() + ". " + person1.nameInAPair());
//        System.out.println(person2.getNr() + ". " + person2.nameInAPair());
//        System.out.println(m1.getNumber() + ". " + m1.nameInAPair());
//        System.out.println(m2.getNumber() + ". " + m2.nameInAPair());
//        System.out.println(m3.getNumber() + ". " + m3.nameInAPair());
        Player[] players = primaryData();
        int stage = 1;
        do {
        players = stage(players);
        print(stage, players);
        stage++;
        } while (players.length > 1);
    }
    static Player[] primaryData() {
        Player[] players = new Player[] {
                new Person("A"),
                new Person("B"),
                new Person("C"),
                new Person("D"),
                new Person("E"),
                new Person("F"),
                new Person("G"),
                new Person("H"),
                new Person("I"),
                new Person("J"),
                new Person("K"),
                new Person("L"),
                new Person("M"),
                new Person("N"),
                new Person("O"),
                new Person("P")
        };

        System.out.println("Players:");

        for (Player p : players){
            System.out.println(p.getNr() + ". " + p.nameInAPair());
        }
        setCounter(0);
        return players;
    }

    static Player[] stage(Player[] players){
        Player[] pairings = new Player[players.length / 2];

        for (int i = 0; i < pairings.length; i++){
            int x = i * 2;
            pairings[i] = new Matchup(players[x], players[x + 1]);
        }
        setCounter(0);

        return pairings;
    }

    static void print(int n, Player[] players){
        System.out.println("Stage " + n + ": ");
        for (Player p : players){
            if (players.length < 2){
                System.out.println("First semifinal winner" + " - " + "Second semifinal winner");
                break;
            }
            System.out.println(p.getNr() + ". " + p.nameInAPair());
        }
        setCount(0);
    }
}
