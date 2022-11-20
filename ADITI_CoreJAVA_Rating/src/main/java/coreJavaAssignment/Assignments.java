package coreJavaAssignment;

import java.util.HashMap;
import java.util.Scanner;

public class Assignments {

	
	static int totalWeight=100;
	static HashMap<String, Integer>assignmentMap; 
		
	private static void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the assignment category");
		String assignmentCategory = sc.next();
		System.out.println("Enter the assignment category weight");
		int weight = sc.nextInt();
		if(assignmentMap.containsKey(assignmentCategory))
		{
			//duplicate assignment 
			
			return;
		}
		if(totalWeight + weight > 100)
		{
			//If adding the current assignment weight increases the total weight over 100
			System.out.println("Overall weight is already 100, please delete a category");
			return;
		}
		
		assignmentMap.put(assignmentCategory.toLowerCase(), weight); 
		totalWeight+=weight;
	}
	
	private static void delete(String assignmentCategory)
	{
		String lowerCasedAssignmentCategory = assignmentCategory.toLowerCase(); 
		if(assignmentMap.containsKey(lowerCasedAssignmentCategory))
		{
			totalWeight-=assignmentMap.get(lowerCasedAssignmentCategory); 
			assignmentMap.remove(lowerCasedAssignmentCategory); 
		}
		else 
		{
			System.out.println("Assignment Category not found"); 
			return;
		}
	}
	
	private static void display()
	{
		System.out.println("Assignment Weight");
		for(HashMap.Entry<String,Integer> entry : assignmentMap.entrySet())
		{
			String key = entry.getKey();
			System.out.println(key.substring(0,1).toUpperCase()+key.substring(1)+" "+entry.getValue()); 
		}
	}
	
	public static void assignmentControlMenu()
	{
		Scanner sc = new Scanner(System.in);
		
		assignmentMap = new HashMap<String, Integer>();
		assignmentMap.put("test", 50); 
		assignmentMap.put("quiz", 50);
		
		while(true)
		{
			System.out.println("1. Input Assignment Category");
			System.out.println("2. Delete Assignment Category");
			System.out.println("3. Display Assignment Category With Weights");
			System.out.println("4. Exit");
			
			int choice = sc.nextInt();
			
			boolean exitFlag = false; 
			
			switch(choice)
			{
				case 1: input(); 
						break;
				case 2: System.out.println("Enter the assignment category you want to delete");	
						String assignmentCategoryToDelete = sc.next();
						delete(assignmentCategoryToDelete); 
						break;
				case 3: display();
						break;
				case 4: exitFlag = true;
						break; 
				default: System.out.println("Please enter a valid choice from 1 - 4"); 
			}
			
			if(exitFlag)
				break;
			
		}
	}
	public static  void main(String[]args)
	{
			System.out.println("test");
			//assignmentControlMenu(); - uncomment
			StudentRecords obj = new StudentRecords();
			obj.display(); //display student records
			obj.ratingForAllSubjects("Ananth");
	}
		
}
	
	


