package coreJavaAssignment;

import java.sql.Date;

public class Student {
	 int serialNo;
	 String name;
	 String subject;
	 String category;
	 String dateOfSubmission;
	 int points;
	
	 public Student(int serialNo, String name, String subject, String category, String dateOfSubmission, int points) {
		super();
		this.serialNo = serialNo;
		this.name = name;
		this.subject = subject;
		this.category = category;
		this.dateOfSubmission = dateOfSubmission;
		this.points = points;
	} 
	 
	 
}
