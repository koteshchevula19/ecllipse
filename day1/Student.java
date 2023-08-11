package day1;

public class Student {
	String studentName;
	int rollNumber;
	Subject[] subjects= {new Subject("Maths"),new Subject("English")};
	 
	
	public Student(String studentName,int rollNumber)
	{
		this.studentName=studentName;
		this.rollNumber=rollNumber;
		 
		
	}

	 
	

}
