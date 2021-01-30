package tournament;

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
                new Person("H")
        };

        System.out.println("Players:");

        for (Player p : players){
            System.out.println(p.getNr() + ". " + p.nameInAPair());
        }
        return players;
    }

    static Player[] stage(int n, Player[] players){
        Player[] pairings = new Player[players.length / 2];

        System.out.println("Pairings:");

        for (int i = 0; i < pairings.length; i++){
            int x = i * 2;
            pairings[i] = new Matchup(players[x], players[x + 1]);
        }

        return pairings;
    }
}
