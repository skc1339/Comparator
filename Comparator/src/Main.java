	
	import java.util.ArrayList;
	import java.util.List;

	public class Main {
		public static void main(String[] args) {
			List<Student> students = new ArrayList<>();
			students.add(new Student(1, "Alice", "123 Maple St"));
			students.add(new Student(2, "Bob", "456 Oak St"));
			students.add(new Student(3, "Charlie", "789 Pine St"));
			students.add(new Student(4, "David", "135 Elm St"));
			students.add(new Student(5, "Eve", "246 Birch St"));
			students.add(new Student(6, "Frank", "369 Cedar St"));
			students.add(new Student(7, "Grace", "480 Walnut St"));
			students.add(new Student(8, "Heidi", "135 Cherry St"));
			students.add(new Student(9, "Ivan", "246 Redwood St"));
			students.add(new Student(10, "Judy", "357 Aspen St"));

			System.out.println("Original list:");
			printStudents(students);

			SelectionSort.selectionSort(students, new NameComparator());
			System.out.println("\nSorted by name:");
			printStudents(students);

			SelectionSort.selectionSort(students, new RollnoComparator());
			System.out.println("\nSorted by roll number:");
			printStudents(students);
	}

   	public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

	
	