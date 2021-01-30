package tournament;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("A");
        Person person2 = new Person("B");
        Matchup m1 = new Matchup(person1, person2);
        Person person3 = new Person("C");
        Matchup m2 = new Matchup(m1, person3);
        Matchup m3 = new Matchup(m1, m2);

        System.out.println(person1.getNr() + ". " + person1.nameInAPair());
        System.out.println(person2.getNr() + ". " + person2.nameInAPair());
        System.out.println(m1.getNr() + ". " + m1.nameInAPair());
        System.out.println(m2.getNr() + ". " + m2.nameInAPair());
        System.out.println(m3.getNr() + ". " + m3.nameInAPair());
    }
}
