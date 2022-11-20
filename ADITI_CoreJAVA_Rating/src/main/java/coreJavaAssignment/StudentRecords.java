package coreJavaAssignment;
import java.util.*;


public class StudentRecords{
	 ArrayList<Student> arr = new ArrayList<Student>();
	 HashSet<String>uniqueSubject; 
	 Student obj1 = new Student(1, "Ananth", "Electro Fields", "test_1", "21-Jul-16", 100);
	 Student obj2 = new Student(2, "Bhagath", "Electro Fields","test_1","21-May-14",200);
	 Student obj3 = new Student(3, "Athreya", "Electro Fields","quiz_1","22-Jun-15",80);

	 public StudentRecords() 
	 {
		 arr.add(obj1); 
		 arr.add(obj2);
		 arr.add(obj3);
	 }
	 
	 public void display()
	 {
		 System.out.println("Hi");
		 for(Student s: arr)
		 {
			 uniqueSubject.add(s.subject);
			 System.out.println(s.serialNo+" "+s.name+" "+s.subject+" "+s.category+" "+s.dateOfSubmission+" "+s.points);
		 }
	 }
	 

	 //Input: Name of student
	 //output: Rating of student for all subjects 
	 
	 //for every student -> rating -> for every subject
	 public void ratingForAllSubjects(String studentName)
	 {
		 Assignments object = new Assignments();
		 HashMap<String, Integer>assignmentList = object.assignmentMap;
		 for(Student s: arr) //for every student  
		 {
			 if(s.name.equals(studentName))
			 {
				 for(String subject: uniqueSubject)
				 {
					 if(s.subject.equals(subject))
					 {
						 for(HashMap.Entry<String,Integer> entry : assignmentList.entrySet()) //for every category
						 {	
							 
						 }
					 }
				 }
			 }
		 }
	 }
}
