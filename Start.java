package task;
public class Start{
      public static void main(String[] args) {
            Student[] students = new Student[5]
            students[0] = new Student("Alice", "S001", "A", "Math");
            students[1] = new Student("Bob", "S002", "B", "Science");
            students[2] = new Student("Charlie", "S003", "C", "History");
            students[3] = new Student("David", "S004", "A", "Physics");
            students[4] = new Student("Eve", "S005", "B", "Chemistry");
                for (Student student : students) {
                student.showDetails();
                System.out.println();
            }
        }
    }
 