import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Gift {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Arya", "Balu", "Ajith", "John", "Akash", "Martin", "Surya", "Tejus", "Anushiya", "Sam");

        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}
