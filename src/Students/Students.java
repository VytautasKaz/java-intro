package Students;

public class Students {
    public static void main(String[] args) {
        StudentsClass[] students = new StudentsClass[] {
            new StudentsClass("John", "Cena", 2),
            new StudentsClass("Creed", "Bratton", 2),
            new StudentsClass("Micahel", "Scott", 1),
            new StudentsClass("Pam", "Halpert", 3),
            new StudentsClass("Dwight", "Schrute", 1),
            new StudentsClass("Jim", "Halpert", 3),
            new StudentsClass("Jim", "Carrey", 3)
        };

        print(students);

        System.out.println("-------------------------------------------------");
        for (int i = 0; i < students.length - 1; i++){
            for (int j = i + 1; j < students.length; j++){
                if (compare(students[i], students[j]) > 0){
                    StudentsClass temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        print(students);
    }

    static void print(StudentsClass[] students){
        for (StudentsClass s : students){
            System.out.println("Name: " + s.getName() + ", Surname: " + s.getSurname() + ", Grade: " + s.getGrade());
        }
    }

    static int compare(StudentsClass s1, StudentsClass s2){
        if (s1.getGrade() > s2.getGrade()) return 1;
        if (s1.getGrade() < s2.getGrade()) return -1;
        if (s1.getGrade() == s2.getGrade()) {
            if (s1.getSurname().equals(s2.getSurname())){
                return s1.getName().compareTo(s2.getName());
            }
        }
        return s1.getSurname().compareTo(s2.getSurname());
    }
}
