package tournament;

public class Person extends Player {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String nameInAPair() {
        return name;
    }

    @Override
    public String winner() {
        return name;
    }
}
