package tournament;

public class Person extends Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name();
    }
}
