import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Alice", "Johnson", 12345, 2);
        Professor professor = new Professor("Dr. Smith", "Brown", 56789, "Computer Science");
        Assistant assistant = new Assistant("Bob", "Miller", 98765, true);

        // Chiama il metodo goToCollege per ciascun oggetto
        System.out.println("Student:");
        student.goToCollege();
        System.out.print("\n");
        System.out.println("Professor: ");
        professor.goToCollege();
        System.out.print("\n");
        System.out.print("Assistant: ");
        assistant.goToCollege();
        System.out.print("\n");

        // Richiama i metodi implementati dalle interfacce
        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }



}
