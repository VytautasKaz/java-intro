package Students;

public class Students {
    public static void main(String[] args) {
        StudentsClass[] students = new StudentsClass[] {
            new StudentsClass("Creed", "Bratton", 2),
            new StudentsClass("Micahel", "Scott", 1),
            new StudentsClass("Pam", "Halpert", 3),
            new StudentsClass("Dwight", "Schrute", 1),
            new StudentsClass("Jim", "Halpert", 3)
        };
        for (StudentsClass s : students){
            System.out.println("Name: " + s.getName() + ", Surname: " + s.getSurname() + ", Grade: " + s.getGrade());
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < students.length - 1; i++){
            for (int j = i + 1; j < students.length; j++){
                if (students[i].getGrade() > students[j].getGrade()){
                    StudentsClass temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (StudentsClass s : students){
            System.out.println("Name: " + s.getName() + ", Surname: " + s.getSurname() + ", Grade: " + s.getGrade());
        }
    }
}
