package inheritance;

public class Student extends Person {
	char grade;

	public Student(char grade) {
		super("Suresh", 20);
		this.grade = grade;
	}

	public void study() {
		System.out.println("study method");
	}

	public static void main(String[] args) {
		Student obj = new Student('A');
		obj.speak();
		obj.study();

	}

}
