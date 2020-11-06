
/**
 * @author Lubowa
 */
import java.util.HashMap;
import java.util.ArrayList; // import the ArrayList class

public class Main {

	public static void main(String[] args) {
		
		//method call to calculate the CGPA
		calculate(putMarks());	
	}
	
	/**
	 * Use this to add your marks
	 * allows you to add marks obtained in a course unit together with the credit units for the program
	 * Use put(Marks,Credit units) to add your marks as done with the first 2 entries on line 23 and 24
	 * @return map A HashMap containing all your marks
	 */
	
	private static ArrayList<int[]> putMarks(){
		ArrayList<int[]> marks = new ArrayList<int[]>(){
			{

				add(new int[]{66,4});
				add(new int[]{83,4});
				add(new int[]{89,4});
				add(new int[]{64,3});
				add(new int[]{72,4});

				
			}
		};
		return marks;
	}
	
	
	/**
	 * Cacluculates the actual CGPA
	 * @param map A HashMap of the marks to use in the caluculation.
	 * It then prints the CGPA on the screen
	 */
	private static void calculate(ArrayList<int[]> map) {
		double grade_sum=0;
		double grade = 0;
		double cu_sum =0;
		double cgpa=0;
		for(int[] i:map) {
			if(i[0]>=80) {
				grade = 5*i[1];
			}
			else if(i[0]>=75) {
				grade = 4.5*i[1];
			}
			else if(i[0]>=70) {
				grade = 4*i[1];
			}
			else if(i[0]>=65) {
				grade = 3.5*i[1];
			}
			else if(i[0]>=60) {
				grade = 3.0*i[1];
			}
			grade_sum=grade_sum+grade;
			cu_sum=cu_sum+i[1];

		}
		cgpa = grade_sum/cu_sum;
		System.out.println("Your CGPA is "+cgpa);

	}
}
