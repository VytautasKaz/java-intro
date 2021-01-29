package tournament;

public class Main {
    public static void main(String[] args) {
        Player person1 = new Person("A");
        Player person2 = new Person("B");
        Player m1 = new Matchup(person1, person2);
        Player m2 = new Matchup(m1, new Person("C"));

        System.out.println(person1.getNr() + ". " + person1.nameInAPair());
        System.out.println(person2.getNr() + ". " + person2.nameInAPair());
        System.out.println(m1.getNr() + ". " + m1.nameInAPair());
        System.out.println(m2.getNr() + ". " + m2.nameInAPair());
    }
}
