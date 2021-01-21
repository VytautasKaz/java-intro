package Students;

public class StudentsClass {
        private String name;
        private String surname;
        private int grade;

        public StudentsClass(String name, String surname, int grade) {
            setName(name);
            setSurname(surname);
            setGrade(grade);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

