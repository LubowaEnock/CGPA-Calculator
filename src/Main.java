/**
 * @author Lubowa
 */
import java.util.HashMap;
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
	
	private static HashMap<Integer, Integer> putMarks(){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(){
			{
				put(66, 4);
				put(70, 5);	
			}
		};
		return map;
	}
	
	
	/**
	 * Cacluculates the actual CGPA
	 * @param map A HashMap of the marks to use in the caluculation.
	 * It then prints the CGPA on the screen
	 */
	private static void calculate(HashMap<Integer, Integer> map) {
		double grade_sum=0;
		double grade = 0;
		double cu_sum =0;
		double cgpa=0;
		for(Integer i:map.keySet()) {
			if(i>=80) {
				grade = 5*map.get(i);
			}
			else if(i>=75) {
				grade = 4.5*map.get(i);
			}
			else if(i>=70) {
				grade = 4*map.get(i);
			}
			else if(i>=65) {
				grade = 3.5*map.get(i);
			}
			else if(i>=60) {
				grade = 3.0*map.get(i);
			}
			grade_sum=grade_sum+grade;
			cu_sum=cu_sum+map.get(i);

		}
		cgpa = grade_sum/cu_sum;
		System.out.println("Your CGPA is "+cgpa);

	}
}
