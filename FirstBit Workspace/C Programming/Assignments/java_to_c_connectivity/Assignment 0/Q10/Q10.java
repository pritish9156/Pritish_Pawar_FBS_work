//Write a C program to input marks of five subjects, find the total marks, and calculate the percentage.

class Q10{
	public static void main(String[] args){
		
		//initialization
		int sub1 = 40, sub2 = 65, sub3 = 70, sub4 = 80, sub5 = 50;
		
		//declaration
		int total_marks;
		double percentage;
		
		//performing operations
		
		//calculating total marks
		total_marks = sub1 + sub2 + sub3 + sub4 + sub5;
		
		//calculating percentage
		percentage = (total_marks / 500.0) * 100;
		
		//printing output
		System.out.println("Marks of Five Subjects : ");
		System.out.printf("subject 1 = %d\nsubject 2 = %d\nsubject 3 = %d\nsubject 4 = %d\nsubject 5 = %d\n",sub1, sub2, sub3, sub4, sub5);
		System.out.printf("\nTotal Marks = %d\n",total_marks);
		System.out.printf("Percentage = %.2f%%",percentage);
		
	}
}


