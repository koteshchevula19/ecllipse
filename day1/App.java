package day1;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("Rakesh", 101);
		Student s2 = new Student("Mahesh", 102);
		Student s3 = new Student("Rishi", 103);
		Student s4 = new Student("Rahul", 104);
		Student s5 = new Student("Manish", 105);
		Student s6 = new Student("Kranthi", 106);
		Student s7 = new Student("Bharath", 107);
		Student s8 = new Student("Arun", 108);
		Student s9 = new Student("Vikas", 109);
		Student s10 = new Student("Vishwa", 110);

		Teacher t = new Teacher();
		t.assignMarks(s1, 65, 79);
		t.assignMarks(s2, 70, 61);
		t.assignMarks(s3, 72, 71);
		t.assignMarks(s4, 62, 96);
		t.assignMarks(s5, 74, 89);
		t.assignMarks(s6, 95, 65);
		t.assignMarks(s7, 81, 77);
		t.assignMarks(s8, 76, 54);
		t.assignMarks(s9, 85, 68);
		t.assignMarks(s10, 91, 76);
		Student students[] = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 };
		double tmMaths = 0, tmEnglish = 0, avgmMaths = 0, avgmEnglish = 0, minmMaths = Double.MAX_VALUE,
				minmEnglish = Double.MAX_VALUE, maxmMaths = 0, maxmEnglish = 0;
		String minMathmarkname = "", minEnglishmarkName = "", maxMathmarkname = "", maxEnglishmarkName = "";
		for (Student s : students) {
			tmMaths = tmMaths+s.subjects[0].marks;
			tmEnglish =tmEnglish+ s.subjects[1].marks;

			if (s.subjects[0].marks < minmMaths) {
				minmMaths = s.subjects[0].marks;
				minMathmarkname = s.studentName;
			}
			if (s.subjects[0].marks > maxmMaths)

			{
				maxmMaths = s.subjects[0].marks;
				maxMathmarkname = s.studentName;
			}

			if (s.subjects[1].marks < minmEnglish) {
				minmEnglish = s.subjects[1].marks;
				minEnglishmarkName = s.studentName;

			}
			if (s.subjects[1].marks > maxmEnglish) {

				maxmEnglish = s.subjects[1].marks;
				maxEnglishmarkName = s.studentName;
			}

		}
		avgmMaths = tmMaths / students.length;
		avgmEnglish = tmEnglish / students.length;
		System.out.println("Average of Math marks :" + avgmMaths);
		System.out.println("Average of English marks :" + avgmEnglish);
		System.out.println(minMathmarkname + " got Minimum marks in Maths :" + minmMaths);
		System.out.println(minEnglishmarkName + " got Minimum marks in English :" + minmEnglish);
		System.out.println(maxMathmarkname + " got Maximum marks in Maths :" + maxmMaths);
		System.out.println(maxEnglishmarkName + " got Maximum marks in English :" + maxmEnglish);

	}

}
